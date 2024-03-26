package com.Zrips.CMI.Modules.Teleportations;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.ChunkSnapshot;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Version.PaperMethods.PaperLib;

public class TeleportHandler {

    private CMI plugin;

    private Set<CMIMaterial> emptyBlockMap = new HashSet<CMIMaterial>();
    private Set<CMIMaterial> badBlockMap = new HashSet<CMIMaterial>();

    private HashMap<UUID, DangerousTp> badTeleports = new HashMap<UUID, DangerousTp>();
    private int btprange = 15;

    public TeleportHandler(CMI plugin) {
        this.plugin = plugin;
        fill();
    }

    public void addBadTeleport(UUID uuid, Location loc) {
        DangerousTp dtp = new DangerousTp(uuid, loc);
        badTeleports.put(uuid, dtp);
    }

    public void removeBadTeleport(UUID uuid) {
        badTeleports.remove(uuid);
    }

    public Location getBadTeleport(UUID uuid) {
        DangerousTp btp = badTeleports.get(uuid);
        if (btp == null)
            return null;
        if (btp.getTime() + (btprange * 1000) < System.currentTimeMillis()) {
            badTeleports.remove(uuid);
            return null;
        }
        return btp.getLocation();
    }

    public CompletableFuture<CMIChunkSnapShot> getSnapshot(Location loc, boolean generate, boolean biomeData) {
        return getSnapshot(loc.getWorld(), loc.getBlockX() >> 4, loc.getBlockZ() >> 4, generate, biomeData);
    }

    public CompletableFuture<CMIChunkSnapShot> getSnapshot(World world, int chunkX, int chunkZ, boolean generate, boolean biomeData) {

        return null;
    }

    static Method getBlockTypeId = null;

    @SuppressWarnings("deprecation")
    public CMIMaterial getBlockType(ChunkSnapshot snap, int localY, PositionRelativeData data) {

        return null;
    }

    public CompletableFuture<CMITeleportLocation> getSafeTeleportationLocation(CMITeleportationBounds checkBounds, CompletableFuture<CMIChunkSnapShot> nestedChunkSnapshot) {

        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe) {
        return teleportPlayer(player, loc, TeleportCause.PLUGIN, safe, null);
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc) {
        return teleportPlayer(player, loc, TeleportCause.PLUGIN, false, null);
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, CMITeleportType type) {
        return teleportPlayer(player, loc, TeleportCause.PLUGIN, false, type);
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe, CMITeleportType type) {
        return teleportPlayer(player, loc, TeleportCause.PLUGIN, safe, type);
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, TeleportCause cause) {
        return teleportPlayer(player, loc, cause, false, null);
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, TeleportCause cause, boolean safe) {
        return teleportPlayer(player, loc, cause, safe, null);
    }

    private CompletableFuture<Boolean> finalizeTeleportation(Player player, TeleportCause cause, CMITeleportLocation cmiLocationDetector) {
        if (setTeleportInvulnerability(player) && cmiLocationDetector.getCondition().equals(CMITeleportCondition.Fall))
            cmiLocationDetector.setCondition(CMITeleportCondition.Good);
        if (player.isOnline()) {
            return PaperLib.teleportAsync(player, cmiLocationDetector.getLocation(), cause);
        }

        plugin.getNMS().setMiscLocation(player, cmiLocationDetector.getLocation());
        return CompletableFuture.completedFuture(true);
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, TeleportCause cause, boolean safe, CMITeleportType type) {

        return null;
    }

    @SuppressWarnings("deprecation")
    public List<Entity> shakePassengers(Entity entity) {

        return null;
    }

    public boolean isEmptySpaceForPlayer(ChunkSnapshot snap, int localY, PositionRelativeData positionData) {
        if (localY <= positionData.getMaxWorldY() && localY >= positionData.getMinWorldY() && !isEmpty(getBlockType(snap, localY, positionData), true))
            return false;

        return localY >= positionData.getMaxWorldY() || localY < positionData.getMinWorldY() || isEmpty(getBlockType(snap, localY + 1, positionData), true);
    }

    public boolean isEmpty(ChunkSnapshot snap, int localY, PositionRelativeData positionData) {
        return localY >= positionData.getMaxWorldY() - 1 || localY < positionData.getMinWorldY() || isEmpty(getBlockType(snap, localY, positionData), true);
    }

    public boolean isEmpty(CMIMaterial type, boolean includeWater) {

        return true;

    }

    public boolean isBad(CMIMaterial cmat) {
        return badBlockMap.contains(cmat);
    }

    private boolean setTeleportInvulnerability(Player player) {

        return true;
    }

    public boolean needToFly(Player player) {

        return true;
    }

    public CompletableFuture<Double> getDistanceToDrop(Location loc) {

        return null;
    }

    public CompletableFuture<CMITeleportFeedback> getSafeLocation(Player player, Location loc, int maxUpRange, int maxDownRange) {
        return getSafeLocation(player, loc, maxUpRange, maxDownRange, true);
    }

    public CompletableFuture<CMITeleportFeedback> getSafeLocation(Player player, Location loc, int maxUpRange, int maxDownRange, boolean checkForProtections) {

        return null;
    }

    private static boolean isImortal(Player player) {
        CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
        if (user == null)
            return false;
        return user.isGod() || !player.getGameMode().equals(GameMode.SURVIVAL) && !player.getGameMode().equals(GameMode.ADVENTURE);
    }

    public boolean bypassesBadLocation(Player player, CMITeleportCondition condition) {
        return CMIPerm.safeteleport_bypass_$1.hasPermission(player, condition.name());
    }

    public CompletableFuture<Location> getTopLocation(Location loc) {

        return null;
    }

    public CompletableFuture<Location> getDownLocation(Location loc) {

        return null;
    }

    private boolean isValidPosition(ChunkSnapshot snap, int y, PositionRelativeData positionData) {

        return false;

    }

    public CompletableFuture<Location> getBottomLocation(Location loc) {

        return null;
    }

    private void fill() {

    }
}
