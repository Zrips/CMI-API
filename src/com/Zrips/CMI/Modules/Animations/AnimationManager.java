package com.Zrips.CMI.Modules.Animations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Steerable;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Version;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class AnimationManager {

    private CMI plugin;

    RotateStand task = null;

    public static final String CMIArmorStandForSit = "CMIArmorStandForSit";
    public static final String CMIRainbowArmor = "CMIRainbowArmor";
    public static final String CMISoulBound = "CMISoulBound";
    public static final String CMIFakeSlime = "CMIFakeSlime";

    HashMap<UUID, Long> doubleClick = new HashMap<UUID, Long>();

    HashMap<UUID, LeatherAnimation> leatherArmor = new HashMap<UUID, LeatherAnimation>();

    HashMap<UUID, Chair> map = new HashMap<UUID, Chair>();
    HashMap<String, UUID> chairLoc = new HashMap<String, UUID>();

    private HashMap<UUID, UUID> riding = new HashMap<UUID, UUID>();
    private ConcurrentHashMap<UUID, Location> ridingNonSteerable = new ConcurrentHashMap<UUID, Location>();
    private HashMap<UUID, UUID> beingRidden = new HashMap<UUID, UUID>();

//    Set<UUID> sleeping = new HashSet<UUID>();

//    private DeadBodies deadmanager;

    public AnimationManager(CMI plugin) {
        this.plugin = plugin;
//	this.deadmanager = new DeadBodies();
    }

    public void clearCache(UUID uuid) {

    }

    private boolean SitOnStairs = true;
    private boolean StairsAsChairs = true;
    private boolean SlabsAsChairs = true;
    private boolean CarpetsAsChairs = true;
    private boolean RemoveFromChairOnDamage = true;
    private boolean DoubleClick = true;
    private int DoubleClickDelay = 200;
    private int chairRange = 200;

    List<CMIInventorySlot> armorTypes = new ArrayList<CMIInventorySlot>(Arrays.asList(CMIInventorySlot.Helmet, CMIInventorySlot.ChestPlate, CMIInventorySlot.Pants, CMIInventorySlot.Boots));

    public enum LeatherAnimationType {
        Rainbow(1), Health(2), Biome(3), Day(4);

        private Integer id;

        LeatherAnimationType(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public static LeatherAnimationType getById(int id) {
            for (LeatherAnimationType one : values()) {
                if (one.getId() == id)
                    return one;
            }
            return null;
        }

        public static LeatherAnimationType getByName(String name) {
            for (LeatherAnimationType one : values()) {
                if (one.name().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }

    }

    public void addLeatherArmor(Player player) {

    }

    private CMITask autoTimerBukkitId = null;

    public void stopLeatherUpdate() {
        if (autoTimerBukkitId != null) {
            autoTimerBukkitId.cancel();
            autoTimerBukkitId = null;
        }
    }

    private Runnable autoTimer = new Runnable() {
        @Override
        public void run() {
            try {
                checkLeatherArmors();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };

    private void checkLeatherArmors() {

    }

    private static double getMaxHealth(Player player) {
        if (Version.isCurrentEqualOrHigher(Version.v1_9_R1)) {
            return player.getAttribute(org.bukkit.attribute.Attribute.GENERIC_MAX_HEALTH).getBaseValue();
        }
        return player.getMaxHealth();
    }

    private static void setColor(CMIUser user, LeatherAnimationType type, List<CMIInventorySlot> slot, LeatherAnimation anim) {

    }

    public static int getIntFromColor(int Red, int Green, int Blue) {
        Red = (Red << 16) & 0x00FF0000;
        Green = (Green << 8) & 0x0000FF00;
        Blue = Blue & 0x000000FF;

        return 0xFF000000 | Red | Green | Blue;
    }

    public boolean isDoubleClickWait(Player player) {

        return false;
    }

    public void loadConfig() {

    }

    public class Chair {
        private Entity ent = null;
        private Location ChairBlockLoc = null;
        private Location armorStandLoc = null;
        private long lastCheck = 0L;
        private boolean persistent = false;

        public Entity getEnt() {
            return ent;
        }

        public Chair setEnt(Entity ent) {
            this.ent = ent;
            return this;
        }

        public Location getChairLoc() {
            return ChairBlockLoc;
        }

        public Chair setChairLoc(Location chairLoc) {
            this.ChairBlockLoc = chairLoc;
            return this;
        }

        public Location getArmorStandLoc() {
            return armorStandLoc;
        }

        public Chair setArmorStandLoc(Location armorStandLoc) {
            this.armorStandLoc = armorStandLoc;
            return this;
        }

        public long getLastCheck() {
            return lastCheck;
        }

        public void setLastCheck(long lastCheck) {
            this.lastCheck = lastCheck;
        }

        public boolean isPersistent() {
            return persistent;
        }

        public void setPersistent(boolean persistent) {
            this.persistent = persistent;
        }

    }

    public boolean isValidChairBlock(Block block) {

        return true;
    }

    public void sit(Player player) {
        sit(player, false);
    }

    public void sit(Player player, boolean persistent) {
        sit(player, player.getLocation(), persistent);
    }

    public void sit(Player player, Location location, boolean persistent) {

    }

    public boolean isSomeOneSittingHere(Block block) {
        UUID who = chairLoc.get(plugin.getUtilManager().convertLocToStringShort(block.getLocation().clone()));
        return who != null;
    }

    private static Vector getStairLedgeDirection(Block block) {

        return null;
    }

    public void sit(Player player, Block block) {
        sit(player, block, false);
    }

    public void sit(Player player, Block block, boolean persistent) {

    }

    public boolean isSitting(Player player) {
        if (player == null)
            return false;
        if (map.isEmpty())
            return false;
        return map.containsKey(player.getUniqueId());
    }

    public Entity getChair(Player player) {
        if (map.isEmpty())
            return null;
        Chair chair = map.get(player.getUniqueId());
        return chair == null ? null : chair.getEnt();
    }

    public void sitOnPlayer(Player player, Player target) {

    }

    private boolean sit(Player player, Chair chair) {

        return true;
    }

    @Deprecated
    public void removePlayer(UUID uuid) {
        Player player = CMIUser.getOnlinePlayer(uuid);
        if (player != null)
            removePlayer(player);
    }

    @Deprecated
    public void removePlayer(final Player player) {
        removePlayer(player, true);
    }

    @Deprecated
    public void removePlayer(final Player player, boolean delay) {
        removePlayerFromChair(player, delay, false);
    }

    public void removePlayerFromChair(UUID uuid) {
        Player player = CMIUser.getOnlinePlayer(uuid);
        if (player != null)
            removePlayerFromChair(player);
    }

    public void removePlayerFromChair(final Player player) {
        removePlayerFromChair(player, true);
    }

    public void removePlayerFromChair(final Player player, boolean delay) {
        removePlayerFromChair(player, delay, false);
    }

    public void removePlayerFromChair(final Player player, boolean delay, boolean center) {

    }

    private void tpPlayer(Player player, Chair chair, boolean center) {

    }

    private void updateSitTask() {
        if (task == null && !map.isEmpty()) {
            task = new RotateStand();
            return;
        }
        if (task != null && map.isEmpty()) {
            task.stop();
            task = null;
            return;
        }
    }

    public boolean isSitOnStairs() {
        return SitOnStairs;
    }

    public void setSitOnStairs(boolean sitOnStairs) {
        SitOnStairs = sitOnStairs;
    }

    public boolean isSlabsAsChairs() {
        return SlabsAsChairs;
    }

    public boolean isStairsAsChairs() {
        return StairsAsChairs;
    }

    public UUID removeRiding(UUID uuid) {
        UUID removed = riding.remove(uuid);
        ridingNonSteerable.remove(uuid);

        if (removed != null)
            beingRidden.remove(removed);

        return removed;
    }

    public List<Entity> removePassengers(Player player, String playerName) {

        return null;
    }

    public boolean isRiding(UUID uuid) {
        return riding.containsKey(uuid);
    }

    public HashMap<UUID, UUID> getRidingList() {
        return riding;
    }

    public boolean isBeingRiden(UUID uuid) {
        return beingRidden.containsKey(uuid);
    }

    public boolean isRidingNonSteerable(UUID uuid) {
        return ridingNonSteerable.containsKey(uuid);
    }

    public UUID getBeingRiden(UUID uuid) {
        return beingRidden.get(uuid);
    }

    @Deprecated
    public void addRiding(UUID riding, UUID vehicle) {
        this.riding.put(riding, vehicle);
        this.beingRidden.put(vehicle, riding);
    }

    CMITask ridingTask = null;

    public void addRiding(Player player, Entity vehicle) {

        if (!(vehicle instanceof Steerable)) {
            ridingNonSteerable.put(player.getUniqueId(), player.getLocation());
            runRidingTasker();
        }

        this.riding.put(player.getUniqueId(), vehicle.getUniqueId());
        this.beingRidden.put(vehicle.getUniqueId(), player.getUniqueId());
    }

    private void runRidingTasker() {

    }

    public boolean isDoubleClick() {
        return DoubleClick;
    }

    public int getChairRange() {
        return chairRange;
    }

    public boolean isRemoveFromChairOnDamage() {
        return RemoveFromChairOnDamage;
    }

    private class RotateStand extends BukkitRunnable {
        private BukkitTask id = null;

        public void stop() {
            if (id != null)
                id.cancel();
        }

        public RotateStand() {
            id = runTaskTimerAsynchronously(plugin, 0L, 1L);
        }

        private Method method = null;
        private Field field = null;

        @Override
        public void run() {

        }
    }

}
