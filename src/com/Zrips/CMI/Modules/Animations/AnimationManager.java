package com.Zrips.CMI.Modules.Animations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class AnimationManager {
    private CMI plugin;
    CMITask task;
    public static final String CMIArmorStandForSit = null;
    public static final String CMIRainbowArmor = null;
    public static final String CMISoulBound = null;
    public static final String CMIFakeSlime = null;
    HashMap<UUID, Long> doubleClick;
    HashMap<UUID, LeatherAnimation> leatherArmor;
    HashMap<UUID, Chair> playerSittingMap;
    HashMap<String, UUID> chairLoc;
    private HashMap<UUID, UUID> riding;
    private ConcurrentHashMap<UUID, Location> ridingNonSteerable;
    private HashMap<UUID, UUID> beingRidden;
    private boolean SitOnStairs;
    private boolean StairsAsChairs;
    private boolean SlabsAsChairs;
    private boolean CarpetsAsChairs;
    private boolean RemoveFromChairOnDamage;
    private boolean DoubleClick;
    private int DoubleClickDelay;
    private int chairRange;
    List<CMIInventorySlot> armorTypes;
    private CMITask autoTimerBukkitId;
    private Runnable autoTimer;
    private static Method method;
    private static Field field;
    CMITask ridingTask;

    public AnimationManager(CMI plugin) {
    }

    public void clearCache(UUID uuid) {
    }

    public void addLeatherArmor(Player player) {
    }

    public void stopLeatherUpdate() {
    }

    private void checkLeatherArmors() {
    }

    private static double getMaxHealth(Player player) {
        return 0.0;
    }

    private static void setColor(CMIUser user, LeatherAnimationType type, List<CMIInventorySlot> slot, LeatherAnimation anim) {
    }

    public static int getIntFromColor(int Red, int Green, int Blue) {
        return 0;
    }

    public boolean isDoubleClickWait(Player player) {
        return false;
    }

    public void loadConfig() {
    }

    public boolean isValidChairBlock(Block block) {
        return false;
    }

    public void sit(Player player) {
    }

    public void sit(Player player, boolean persistent) {
    }

    public void sit(Player player, Location location, boolean persistent) {
    }

    public boolean isSomeOneSittingHere(Block block) {
        return false;
    }

    private static Vector getStairLedgeDirection(Block block) {
        return null;
    }

    public void sit(Player player, Block block) {
    }

    public void sit(Player player, Block block, boolean persistent) {
    }

    public boolean isSitting(Player player) {
        return false;
    }

    public Entity getChair(Player player) {
        return null;
    }

    public void sitOnPlayer(Player player, Player target) {
    }

    private boolean sit(Player player, Chair chair) {
        return false;
    }

    @Deprecated
    public void removePlayer(UUID uuid) {
    }

    @Deprecated
    public void removePlayer(Player player) {
    }

    @Deprecated
    public void removePlayer(Player player, boolean delay) {
    }

    public void removePlayerFromChair(UUID uuid) {
    }

    public void removePlayerFromChair(Player player) {
    }

    public void removePlayerFromChair(Player player, boolean delay) {
    }

    public void removePlayerFromChair(Player player, boolean delay, boolean center) {
    }

    public void removePlayerFromChair(Player player, boolean delay, boolean center, boolean teleport) {
    }

    private void tpPlayer(Player player, Chair chair, boolean center) {
    }

    private void updateSitTask() {
    }

    private void modifyArmorStandDirection(ArmorStand armorStand) {
    }

    public boolean isSitOnStairs() {
        return false;
    }

    public void setSitOnStairs(boolean sitOnStairs) {
    }

    public boolean isSlabsAsChairs() {
        return false;
    }

    public boolean isStairsAsChairs() {
        return false;
    }

    public UUID removeRiding(UUID uuid) {
        return null;
    }

    public CompletableFuture<List<Entity>> removePassengers(Player player, String playerName) {
        return null;
    }

    public boolean isRiding(UUID uuid) {
        return false;
    }

    public HashMap<UUID, UUID> getRidingList() {
        return null;
    }

    public boolean isBeingRiden(UUID uuid) {
        return false;
    }

    public boolean isRidingNonSteerable(UUID uuid) {
        return false;
    }

    public UUID getBeingRiden(UUID uuid) {
        return null;
    }

    @Deprecated
    public void addRiding(UUID riding, UUID vehicle) {
    }

    public void addRiding(Player player, Entity vehicle) {
    }

    private void runRidingTasker() {
    }

    public boolean isDoubleClick() {
        return false;
    }

    public int getChairRange() {
        return 0;
    }

    public boolean isRemoveFromChairOnDamage() {
        return false;
    }

    public enum LeatherAnimationType {
        Rainbow(1), Health(2), Biome(3), Day(4);

        private Integer id;

        LeatherAnimationType(Integer id) {
        }

        public Integer getId() {
            return null;
        }

        public void setId(Integer id) {
        }

        public static LeatherAnimationType getById(int id) {
            return null;
        }

        public static LeatherAnimationType getByName(String name) {
            return null;
        }
    }

    public class Chair {
        private Entity ent;
        private Location ChairBlockLoc;
        private Location armorStandLoc;
        private long lastCheck;
        private boolean persistent;

        public Entity getEnt() {
            return null;
        }

        public Chair setEnt(Entity ent) {
            return null;
        }

        public Location getChairLoc() {
            return null;
        }

        public Chair setChairLoc(Location chairLoc) {
            return null;
        }

        public Location getArmorStandLoc() {
            return null;
        }

        public Chair setArmorStandLoc(Location armorStandLoc) {
            return null;
        }

        public long getLastCheck() {
            return 0;
        }

        public void setLastCheck(long lastCheck) {
        }

        public boolean isPersistent() {
            return false;
        }

        public void setPersistent(boolean persistent) {
        }
    }
}
