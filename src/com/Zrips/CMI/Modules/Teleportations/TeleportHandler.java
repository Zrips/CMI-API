package com.Zrips.CMI.Modules.Teleportations;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.ChunkSnapshot;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;

public class TeleportHandler {
    private CMI plugin;
    private Set<CMIMaterial> emptyBlockMap;
    private Set<CMIMaterial> badBlockMap;
    private HashMap<UUID, DangerousTp> badTeleports;
    private int btprange;
    static Method getBlockTypeId;
    boolean enabledDouble;

    public TeleportHandler(CMI plugin) {
    }

    public void addBadTeleport(UUID uuid, Location loc) {
    }

    public void removeBadTeleport(UUID uuid) {
    }

    public Location getBadTeleport(UUID uuid) {
        return null;
    }

    public CompletableFuture<Material> getBlockType(Location loc, boolean generate) {
        return null;
    }

    public CompletableFuture<CMIChunkSnapShot> getSnapshot(Location loc, boolean generate, boolean biomeData) {
        return null;
    }

    public CompletableFuture<CMIChunkSnapShot> getSnapshot(World world, int chunkX, int chunkZ, boolean generate, boolean biomeData) {
        return null;
    }

    @SuppressWarnings("deprecation")
    public CMIMaterial getBlockType(ChunkSnapshot snap, int localY, PositionRelativeData data) {
        return null;
    }

    public CompletableFuture<CMITeleportLocation> getSafeTeleportationLocation(CMITeleportationBounds checkBounds, CompletableFuture<CMIChunkSnapShot> nestedChunkSnapshot) {
        return null;
    }

    public CompletableFuture<Boolean> teleportEntity(Entity entity, Location loc, TeleportCause cause) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, CMITeleportType type) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe, CMITeleportType type) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, boolean safe, CMITeleportType type, boolean ignoreHeightLimits) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, TeleportCause cause) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, TeleportCause cause, boolean safe) {
        return null;
    }

    public CompletableFuture<Boolean> finalizeTeleportation(Player player, TeleportCause cause, CMITeleportLocation cmiLocationDetector) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, TeleportCause cause, boolean safe, CMITeleportType type) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> teleportPlayer(Player player, Location loc, TeleportCause cause, boolean safe, CMITeleportType type, boolean ignoreHeightLimits) {
        return null;
    }

    public void showParticleEffect(Player player, CMITeleportType type, Location from, Location to) {
    }

    @SuppressWarnings("deprecation")
    public List<Entity> shakePassengers(Entity entity) {
        return null;
    }

    public boolean isEmptySpaceForPlayer(ChunkSnapshot snap, int localY, PositionRelativeData positionData) {
        return false;
    }

    public boolean isEmptySpaceForPlayer(ChunkSnapshot snap, int localY, PositionRelativeData positionData, boolean ignoreCrawl) {
        return false;
    }

    public boolean isEmpty(ChunkSnapshot snap, int localY, PositionRelativeData positionData) {
        return false;
    }

    public boolean isEmpty(CMIMaterial type, boolean includeWater) {
        return false;
    }

    public boolean isBad(CMIMaterial cmat) {
        return false;
    }

    private boolean setTeleportInvulnerability(Player player, World world) {
        return false;
    }

    public boolean needToFly(Player player) {
        return false;
    }

    public CompletableFuture<Double> getDistanceToDrop(Location loc) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> getSafeLocation(Player player, Location loc, int maxUpRange, int maxDownRange) {
        return null;
    }

    public CompletableFuture<CMITeleportFeedback> getSafeLocation(Player player, Location loc, int maxUpRange, int maxDownRange, boolean checkForProtections) {
        return null;
    }

    private static boolean isImortal(Player player) {
        return false;
    }

    public static boolean hasSafeTeleport(Player player) {
        return false;
    }

    public boolean bypassesBadLocation(Player player, CMITeleportCondition condition) {
        return false;
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
