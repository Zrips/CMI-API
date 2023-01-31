package com.Zrips.CMI.Modules.tp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIHitBox;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Particl.ParticleManager.CMIPresetAnimations;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Items.CMIMaterial;

public class Teleportations {

    private CMI plugin;

//    private Set<Material> Empty = new HashSet<Material>();
    private HashMap<CMIMaterial, List<Integer>> EmptyBlockMap = new HashMap<CMIMaterial, List<Integer>>();
    private Set<CMIMaterial> bad = new HashSet<CMIMaterial>();

    private HashMap<UUID, DangerousTp> badTeleports = new HashMap<UUID, DangerousTp>();
    private int btprange = 15;

    public enum TeleportType {
        Unknown(TeleportCause.UNKNOWN),
        Elevator(TeleportCause.UNKNOWN),
        SafeLogin(TeleportCause.PLUGIN),
        Spawn(TeleportCause.COMMAND),
        NetherRoof(TeleportCause.PLUGIN),
        BelowBedrock(TeleportCause.PLUGIN),
        Back(TeleportCause.COMMAND),
        DBack(TeleportCause.COMMAND),
        Home(TeleportCause.COMMAND),
        Jump(TeleportCause.COMMAND),
        Patrol(TeleportCause.COMMAND),
        Portal(TeleportCause.PLUGIN),
        WarmUp(TeleportCause.COMMAND),
        Biome(TeleportCause.COMMAND),
        FlightCharge(TeleportCause.PLUGIN),
        InvEdit(TeleportCause.COMMAND),
        TimedCommand(TeleportCause.PLUGIN),
        TpaAll(TeleportCause.COMMAND),
        Tp(TeleportCause.COMMAND),
        Top(TeleportCause.COMMAND),
        Down(TeleportCause.COMMAND),
        TpAll(TeleportCause.COMMAND),
        TpHere(TeleportCause.COMMAND),
        TpPos(TeleportCause.COMMAND),
        Warp(TeleportCause.COMMAND),
        JoinSpawn(TeleportCause.PLUGIN),
        Totem(TeleportCause.PLUGIN),
        randomTp(TeleportCause.COMMAND),
        World(TeleportCause.COMMAND),
        HoloEdit(TeleportCause.PLUGIN);

        private CMIPresetAnimations from = null;
        private CMIPresetAnimations to = null;
        private TeleportCause cause;

        TeleportType(TeleportCause cause) {
            this.cause = cause;
        }

        public CMIPresetAnimations getFrom() {
            return from;
        }

        public void setFrom(CMIPresetAnimations from) {
            this.from = from;
        }

        public CMIPresetAnimations getTo() {
            return to;
        }

        public void setTo(CMIPresetAnimations to) {
            this.to = to;
        }

        public TeleportCause getCause() {
            return cause;
        }
    }

    public enum TpCondition {
        Lava, Void, Suffocation, Good, Unknown, Plugin, unsafeTeleportation, noPerm;

        public static String getBadLocations() {
            String all = "";
            for (TpCondition one : TpCondition.values()) {
                if (one.equals(TpCondition.Good))
                    continue;
                if (!all.isEmpty())
                    all += "/";
                all += one.name();
            }
            return all;
        }
    }

    private void fill() {

    }

    public Teleportations(CMI plugin) {
        this.plugin = plugin;
        fill();
    }

    private static boolean isImortal(Player player) {
        CMIUser user = CMI.getInstance().getPlayerManager().getUser(player);
        if (user == null)
            return false;
        return user.isGod() || player.getGameMode() == GameMode.CREATIVE || player.getGameMode().name().equalsIgnoreCase("SPECTATOR");
    }

    public boolean teleport(Player player, Location loc, TeleportType type) {
        return teleport(null, player, loc, true, false, true, type, false, null);
    }

    public boolean teleport(Player player, Location loc, boolean inform, boolean reqPerm, TeleportType type) {
        return teleport(null, player, loc, inform, reqPerm, true, type, false, null);
    }

    public boolean teleport(Player player, Location loc, boolean inform, boolean reqPerm, boolean forceTeleport, TeleportType type) {
        return teleport(null, player, loc, inform, reqPerm, forceTeleport, type, false, null);
    }

    public boolean teleport(Player player, Location loc, boolean reqPerm, TeleportType type) {
        return teleport(null, player, loc, false, reqPerm, true, type, false, null);
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, TeleportType type) {
        return teleport(sender, player, loc, true, true, true, type, false, null);
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, boolean inform, TeleportType type) {
        return teleport(sender, player, loc, inform, true, true, type, false, null);
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, boolean inform, boolean reqPerm, TeleportType type) {
        return teleport(sender, player, loc, inform, reqPerm, true, type, false, null);
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, boolean inform, boolean reqPerm, boolean forceTeleport, TeleportType type) {
        return teleport(sender, player, loc, inform, reqPerm, forceTeleport, type, false, null);
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, boolean inform, boolean reqPerm, boolean forceTeleport, TeleportType type, boolean toSpawnIfNeeded) {
        return teleport(sender, player, loc, inform, reqPerm, forceTeleport, type, toSpawnIfNeeded, null);
    }

    public boolean teleport(CommandSender sender, Player player, Location loc, boolean inform, boolean reqPerm, boolean forceTeleport, TeleportType type, boolean toSpawnIfNeeded,
        Integer maxDistanceToCheck) {

        return false;
    }

    public boolean teleportAsync(CommandSender sender, Player player, boolean inform, SafeTeleport safe, TeleportType type, boolean toSpawnIfNeeded) {

        return false;
    }

    public boolean bypassesBadLocation(Player player, TpCondition condition) {
        return CMIPerm.safeteleport_bypass_$1.hasPermission(player, condition.name());
    }

    public void addBadTeleport(UUID uuid, Location loc) {
        DangerousTp dtp = new DangerousTp(uuid, loc);
        badTeleports.put(uuid, dtp);
    }

    public void removeBadTp(UUID uuid) {
        badTeleports.remove(uuid);
    }

    public Location getBadTp(UUID uuid) {

        return null;
    }

    public SafeTeleport getSafeLocationAsync(Player player, Location loc, boolean reqPerm, boolean forceTeleport, Integer maxDistanceToCheck) {

        return null;
    }

    public SafeTeleport getSafeLocation(Player player, Location loc, boolean reqPerm, boolean forceTeleport) {
        return getSafeLocation(player, loc, reqPerm, forceTeleport, null);
    }

    private Location center(CMIHitBox hitBox, Location cloned) {

        return null;
    }

    public SafeTeleport getSafeLocation(Player player, Location loc, boolean reqPerm, boolean forceTeleport, Integer maxDistanceToCheck) {

        return null;
    }

//    private boolean finalizeTeleport(Player player, Location loc) {
//	return finalizeTeleport(player, loc, TeleportType.Unknown, true);
//    }

    public boolean directTeleport(Player player, Location loc, TeleportType type) {
        return finalizeTeleport(player, loc, type, true);
    }

    private boolean finalizeTeleport(Player player, Location loc, TeleportType t, boolean toSpawnIfNeeded) {

        return true;
    }

    private void setTeleportInvulnerability(Player player) {

    }

    public List<Entity> shakePassengers(Entity entity) {

        return null;
    }

    public boolean isBad(Block block) {
        CMILocation loc = new CMILocation(block.getLocation());
        CMIMaterial cmat = loc.getBlockCMIType();
        return bad.contains(cmat);
    }

    public boolean isEmpty(Block block) {

        return false;
    }

    public boolean isWater(Block block) {
        CMILocation loc = new CMILocation(block.getLocation());
        CMIMaterial cmat = loc.getBlockCMIType();
        return cmat.isWater();
    }

    public double getDistanceToDrop(Player player, Location loc) {
        Location down = getDownLocation(player, loc);
        return down == null ? 0 : down.distance(loc);
    }

    public boolean isSafeToDrop(Location loc, Player player) {

        return false;
    }

    public Location getDownLocationAsync(Player player, Location oloc, Integer maxDistanceToCheck) {

        return null;
    }

    public Location getDownLocation(Player player, Location oloc) {
        return getDownLocation(player, oloc, null);
    }

    public Location getDownLocation(Player player, Location oloc, Integer maxDistanceToCheck) {

        return null;
    }

    public Location getDownLocationSimple(Location oloc) {
        return getDownLocationSimple(oloc, false);
    }

    public Location getDownLocationSimple(Location oloc, boolean firstHitOnly) {

        return null;
    }

    private Location cycleDown(Location loc) {
        return cycleDown(loc, false);
    }

    private Location cycleDown(Location loc, boolean firstHitOnly) {

        return null;
    }

    public Location getUpLocation(Player player, Location oloc) {
        return getUpLocation(player, oloc, null);
    }

    public Location getUpLocation(Player player, Location oloc, Integer maxDistanceToCheck) {

        return null;
    }

    public Location getTopLocation(Location loc) {

        return null;
    }

    public boolean needToFly(Player player) {
        return true;
    }

    public Location getSafeLocation(Player player) {
        Location loc = player.getLocation();
        return getDownLocation(player, loc);
    }

    ConcurrentHashMap<String, List<CMILocation>> randomLocCache = new ConcurrentHashMap<String, List<CMILocation>>();
    Set<String> cacheFilling = new HashSet<String>();

    public void clearRLCache() {
        randomLocCache.clear();
    }

    public void fillRLCache() {

    }

    private void fillRLCache(World world) {
        fillRLCache(world.getName());
    }

    public CMILocation fillRLCache(String worldName) {

        return null;
    }

    public CMILocation getRandomCachedLocation(World world) {
        return null;
    }

    Random random = new Random(System.nanoTime());
    Random random2 = new Random(System.nanoTime() - System.currentTimeMillis());

    public Location getRandomLocation(World world) {

        return null;
    }
}
