package com.Zrips.CMI.Modules.Statistics;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Statistic;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class StatsManager {
    private CMI plugin;
    private static HashMap<String, CMIStatistic> cache;
    private CMITask autoTimerBukkitId;
    private CompletableFuture<Void> task;
    SortedMap<Long, CMIUser> sm;
    SortedMap<UUID, Long> smt;
    private boolean loaded;
    long lastUpdate;
    private Runnable autoTimer;

    public StatsManager(CMI plugin) {
    }

    public void stop() {
    }

    public CMIStatistic getStatisticByName(String name) {
        return null;
    }

    public Statistic getStatistic(CMIStatistic type) {
        return null;
    }

    public synchronized boolean changeTo(Player player, CMIStatistic st, String extra, Long amount) {
        return false;
    }

    public boolean isScanning() {
        return false;
    }

    public boolean isDataLoaded() {
        return false;
    }

    public int getTotalCount() {
        return 0;
    }

    public int getPages() {
        return 0;
    }

    public void addUserData(CMIUser user) {
    }

    public Long getPlaytimeFromCache(CMIUser user) {
        return null;
    }

    public SortedMap<Long, CMIUser> getTop() {
        return null;
    }

    public synchronized SortedMap<Long, CMIUser> getTop(int count) {
        return null;
    }

    public synchronized Long getTimeByPlace(int place) {
        return null;
    }

    public synchronized CMIUser getUserByPlace(int place) {
        return null;
    }

    public int getPlace(CMIUser user) {
        return 0;
    }

    public void loadStats(CommandSender sender, String targetName) {
    }

    public enum svt {
        Time, Distance, Damage, Number;
    }

    public enum CMIType {
        None, Material, Block, Entity;
    }

    public enum CMIStatistic {
        LEAVE_GAME("Game quit", svt.Number, false, false, CMIType.None), PLAY_ONE_TICK("Play time", svt.Time, false, false, CMIType.None, "PLAY_ONE_MINUTE"), TIME_SINCE_DEATH("From last death", svt.Time,
            false, false, CMIType.None), TIME_SINCE_REST("From last rest", svt.Time, false, false, CMIType.None), SNEAK_TIME("Sneak time", svt.Time, false, false, CMIType.None), ACOUNT_AGE("Account age",
                svt.Time, false, false, CMIType.None), TRAVEL("Travel", svt.Distance, false, false, CMIType.None), WALK_ONE_CM("Walk", svt.Distance, false, false, CMIType.None), CROUCH_ONE_CM("Sneak",
                    svt.Distance, false, false, CMIType.None), SPRINT_ONE_CM("Sprint", svt.Distance, false, false, CMIType.None), SWIM_ONE_CM("Swim", svt.Distance, false, false, CMIType.None), FALL_ONE_CM(
                        "Fall", svt.Distance, false, false, CMIType.None), CLIMB_ONE_CM("Climb", svt.Distance, false, false, CMIType.None), FLY_ONE_CM("Fly", svt.Distance, false, false, CMIType.None),
        DIVE_ONE_CM("Dive", svt.Distance, false, false, CMIType.None), WALK_UNDER_WATER_ONE_CM("Walk under water", svt.Distance, false, false, CMIType.None), WALK_ON_WATER_ONE_CM("Walk on water",
            svt.Distance, false, false, CMIType.None), MINECART_ONE_CM("Minecart travel", svt.Distance, false, false, CMIType.None), BOAT_ONE_CM("Boat travel", svt.Distance, false, false, CMIType.None),
        PIG_ONE_CM("Pig travel", svt.Distance, false, false, CMIType.None), HORSE_ONE_CM("Horse travel", svt.Distance, false, false, CMIType.None), AVIATE_ONE_CM("Elytra travel", svt.Distance, false,
            false, CMIType.None), JUMP("Jump", svt.Number, false, false, CMIType.None), DAMAGE_DEALT("Damage dealt", svt.Damage, false, false, CMIType.None), DAMAGE_TAKEN("Damage taken", svt.Damage, false,
                false, CMIType.None), DAMAGE_DEALT_ABSORBED("Damage dealt absorbed", svt.Damage, false, false, CMIType.None), DAMAGE_DEALT_RESISTED("Damage dealt resisted", svt.Damage, false, false,
                    CMIType.None), DAMAGE_BLOCKED_BY_SHIELD("Damage blocked by shield", svt.Damage, false, false, CMIType.None), DAMAGE_ABSORBED("Damage absorbed", svt.Damage, false, false, CMIType.None),
        DAMAGE_RESISTED("Damage resisted", svt.Damage, false, false, CMIType.None), DEATHS("Deaths", svt.Number, false, false, CMIType.None), ENTITY_KILLED_BY("Killed by", svt.Number, false, true,
            CMIType.Entity), MOB_KILLS("Mob kills", svt.Number, false, false, CMIType.None), PLAYER_KILLS("Player kills", svt.Number, false, false, CMIType.None), ITEM_ENCHANTED("Item enchanted",
                svt.Number, false, false, CMIType.None), ANIMALS_BRED("Animals bred", svt.Number, false, false, CMIType.None), FISH_CAUGHT("Fish caught", svt.Number, false, false, CMIType.None),
        TALKED_TO_VILLAGER("Talked to villager", svt.Number, false, false, CMIType.None), TRADED_WITH_VILLAGER("Traded with villager", svt.Number, false, false, CMIType.None), CAKE_SLICES_EATEN(
            "Cake slices eaten", svt.Number, false, false, CMIType.None), CAULDRON_FILLED("Cauldron filled", svt.Number, false, false, CMIType.None), CAULDRON_USED("Couldron used", svt.Number, false,
                false, CMIType.None), ARMOR_CLEANED("Armor cleaned", svt.Number, false, false, CMIType.None), BANNER_CLEANED("Banner cleaned", svt.Number, false, false, CMIType.None),
        BREWINGSTAND_INTERACTION("Brewing stand interactions", svt.Number, false, false, CMIType.None), BEACON_INTERACTION("Beacon interactions", svt.Number, false, false, CMIType.None),
        CRAFTING_TABLE_INTERACTION("Crafting table interactions", svt.Number, false, false, CMIType.None), FURNACE_INTERACTION("Furnace interactions", svt.Number, false, false, CMIType.None),
        DISPENSER_INSPECTED("Dispenser inspected", svt.Number, false, false, CMIType.None), DROPPER_INSPECTED("Dropper inspected", svt.Number, false, false, CMIType.None), HOPPER_INSPECTED(
            "Hopper inspected", svt.Number, false, false, CMIType.None), CHEST_OPENED("Chest open", svt.Number, false, false, CMIType.None), TRAPPED_CHEST_TRIGGERED("Trapped chest triggered", svt.Number,
                false, false, CMIType.None), ENDERCHEST_OPENED("Ender chest opened", svt.Number, false, false, CMIType.None), NOTEBLOCK_PLAYED("Noteblock played", svt.Number, false, false, CMIType.None),
        NOTEBLOCK_TUNED("Noteblock tuned", svt.Number, false, false, CMIType.None), FLOWER_POTTED("Flower potted", svt.Number, false, false, CMIType.None), RECORD_PLAYED("Record played", svt.Number, false,
            false, CMIType.None), SLEEP_IN_BED("Slept in bed", svt.Number, false, false, CMIType.None), SHULKER_BOX_OPENED("Shulker box opened", svt.Number, false, false, CMIType.None), CLEAN_SHULKER_BOX(
                "Shulker box cleaned", svt.Number, false, false, CMIType.None), DROP("Item dropped", svt.Number, false, true, CMIType.Material), MINE_BLOCK("Blocks mined", svt.Number, true, true,
                    CMIType.Block), PLACE_BLOCK("Blocks placed", svt.Number, true, true, CMIType.Block, Statistic.USE_ITEM), BREAK_ITEM("Item breaks", svt.Number, false, true, CMIType.Material),
        CRAFT_ITEM("Item crafts", svt.Number, false, true, CMIType.Material), USE_ITEM("Items used", svt.Number, false, true, CMIType.Material), PICKUP("Item pickups", svt.Number, false, true,
            CMIType.Material), KILL_ENTITY("Monster kills", svt.Number, false, true, CMIType.Entity), STRIDER_ONE_CM("Strider travel", svt.Distance, false, false, CMIType.None),
        INTERACT_WITH_BLAST_FURNACE("Interaction with blast furnace", svt.Number, false, false, CMIType.None), INTERACT_WITH_SMOKER("Interaction with smoker", svt.Number, false, false, CMIType.None),
        INTERACT_WITH_LECTERN("Interaction with lectern", svt.Number, false, false, CMIType.None), INTERACT_WITH_CAMPFIRE("Interaction with campfire", svt.Number, false, false, CMIType.None),
        INTERACT_WITH_CARTOGRAPHY_TABLE("Interaction with cartography table", svt.Number, false, false, CMIType.None), INTERACT_WITH_LOOM("Interaction with loom", svt.Number, false, false, CMIType.None),
        INTERACT_WITH_STONECUTTER("Interaction with stonecutter", svt.Number, false, false, CMIType.None), INTERACT_WITH_ANVIL("Interaction with anvil", svt.Number, false, false, CMIType.None),
        INTERACT_WITH_GRINDSTONE("Interaction with grindstone", svt.Number, false, false, CMIType.None), INTERACT_WITH_SMITHING_TABLE("Interaction with smithing table", svt.Number, false, false,
            CMIType.None), BELL_RING("Bell rings", svt.Number, false, false, CMIType.None), RAID_TRIGGER("Raid triggers", svt.Number, false, false, CMIType.None), RAID_WIN("Raid wins", svt.Number, false,
                false, CMIType.None), TARGET_HIT("Target hits", svt.Number, false, false, CMIType.None), OPEN_BARREL("Opened barrels", svt.Number, false, false, CMIType.None), DROP_COUNT("Drop count",
                    svt.Number, false, false, CMIType.None), TOTAL_WORLD_TIME("Time in world", svt.Time, false, false, CMIType.None);

        private svt type;
        private boolean isBlock;
        private boolean isSubSatistic;
        private CMIType subType;
        private String name;
        private String newName;
        private Statistic bukkit;
        private boolean checked = false;

        CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType, Statistic stat) {
        }

        CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType, String newName) {
        }

        CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType) {
        }

        public svt getType() {
            return null;
        }

        public boolean isBlock() {
            return false;
        }

        public void setBlock(boolean isBlock) {
        }

        public boolean isSubSatistic() {
            return false;
        }

        public void setSubSatistic(boolean isSubSatistic) {
        }

        public CMIType getSubType() {
            return null;
        }

        public Statistic getBukkitStat() {
            return null;
        }

        public String getName() {
            return null;
        }

        public String getNewName() {
            return null;
        }

        public static CMIStatistic getByName(String name) {
            return null;
        }
    }
}
