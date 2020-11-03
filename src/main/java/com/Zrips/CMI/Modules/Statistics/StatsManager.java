package com.Zrips.CMI.Modules.Statistics;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class StatsManager {

    private CMI plugin;

    public enum svt {
	Time, Distance, Damage, Number
    }

    public enum CMIType {
	None, Material, Block, Entity
    }

    public enum CMIStatistic {

	LEAVE_GAME("Game quit", svt.Number, false, false, CMIType.None),
	PLAY_ONE_TICK("Play time", svt.Time, false, false, CMIType.None, "PLAY_ONE_MINUTE"),
	TIME_SINCE_DEATH("From last death", svt.Time, false, false, CMIType.None),
	TIME_SINCE_REST("From last rest", svt.Time, false, false, CMIType.None),
	SNEAK_TIME("Sneak time", svt.Time, false, false, CMIType.None),
	ACOUNT_AGE("Account age", svt.Time, false, false, CMIType.None),

	TRAVEL("Travel", svt.Distance, false, false, CMIType.None),
	WALK_ONE_CM("Walk", svt.Distance, false, false, CMIType.None),
	CROUCH_ONE_CM("Sneak", svt.Distance, false, false, CMIType.None),
	SPRINT_ONE_CM("Sprint", svt.Distance, false, false, CMIType.None),
	SWIM_ONE_CM("Swim", svt.Distance, false, false, CMIType.None),
	FALL_ONE_CM("Fall", svt.Distance, false, false, CMIType.None),
	CLIMB_ONE_CM("Climb", svt.Distance, false, false, CMIType.None),
	FLY_ONE_CM("Fly", svt.Distance, false, false, CMIType.None),
	DIVE_ONE_CM("Dive", svt.Distance, false, false, CMIType.None),
	WALK_UNDER_WATER_ONE_CM("Walk under water", svt.Distance, false, false, CMIType.None),
	WALK_ON_WATER_ONE_CM("Walk on water", svt.Distance, false, false, CMIType.None),
	MINECART_ONE_CM("Minecart travel", svt.Distance, false, false, CMIType.None),
	BOAT_ONE_CM("Boat travel", svt.Distance, false, false, CMIType.None),
	PIG_ONE_CM("Pig travel", svt.Distance, false, false, CMIType.None),
	HORSE_ONE_CM("Horse travel", svt.Distance, false, false, CMIType.None),
	AVIATE_ONE_CM("Elytra travel", svt.Distance, false, false, CMIType.None),

	JUMP("Jump", svt.Number, false, false, CMIType.None),
	DAMAGE_DEALT("Damage dealt", svt.Damage, false, false, CMIType.None),
	DAMAGE_TAKEN("Damage taken", svt.Damage, false, false, CMIType.None),
	DAMAGE_DEALT_ABSORBED("Damage dealt absorbed", svt.Damage, false, false, CMIType.None),
	DAMAGE_DEALT_RESISTED("Damage dealt resisted", svt.Damage, false, false, CMIType.None),
	DAMAGE_BLOCKED_BY_SHIELD("Damage blocked by shield", svt.Damage, false, false, CMIType.None),
	DAMAGE_ABSORBED("Damage absorbed", svt.Damage, false, false, CMIType.None),
	DAMAGE_RESISTED("Damage resisted", svt.Damage, false, false, CMIType.None),
	DEATHS("Deaths", svt.Number, false, false, CMIType.None),
	ENTITY_KILLED_BY("Killed by", svt.Number, false, true, CMIType.Entity),
	MOB_KILLS("Mob kills", svt.Number, false, false, CMIType.None),
	PLAYER_KILLS("Player kills", svt.Number, false, false, CMIType.None),
	ITEM_ENCHANTED("Item enchanted", svt.Number, false, false, CMIType.None),
	ANIMALS_BRED("Animals bred", svt.Number, false, false, CMIType.None),
	FISH_CAUGHT("Fish caught", svt.Number, false, false, CMIType.None),
	TALKED_TO_VILLAGER("Talked to villager", svt.Number, false, false, CMIType.None),
	TRADED_WITH_VILLAGER("Traded with villager", svt.Number, false, false, CMIType.None),
	CAKE_SLICES_EATEN("Cake slices eaten", svt.Number, false, false, CMIType.None),
	CAULDRON_FILLED("Cauldron filled", svt.Number, false, false, CMIType.None),
	CAULDRON_USED("Couldron used", svt.Number, false, false, CMIType.None),
	ARMOR_CLEANED("Armor cleaned", svt.Number, false, false, CMIType.None),
	BANNER_CLEANED("Banner cleaned", svt.Number, false, false, CMIType.None),
	BREWINGSTAND_INTERACTION("Brewing stand interactions", svt.Number, false, false, CMIType.None),
	BEACON_INTERACTION("Beacon interactions", svt.Number, false, false, CMIType.None),
	CRAFTING_TABLE_INTERACTION("Crafting table interactions", svt.Number, false, false, CMIType.None),
	FURNACE_INTERACTION("Furnace interactions", svt.Number, false, false, CMIType.None),
	DISPENSER_INSPECTED("Dispenser inspected", svt.Number, false, false, CMIType.None),
	DROPPER_INSPECTED("Dropper inspected", svt.Number, false, false, CMIType.None),
	HOPPER_INSPECTED("Hopper inspected", svt.Number, false, false, CMIType.None),
	CHEST_OPENED("Chest open", svt.Number, false, false, CMIType.None),
	TRAPPED_CHEST_TRIGGERED("Trapped chest triggered", svt.Number, false, false, CMIType.None),
	ENDERCHEST_OPENED("Ender chest opened", svt.Number, false, false, CMIType.None),
	NOTEBLOCK_PLAYED("Noteblock played", svt.Number, false, false, CMIType.None),
	NOTEBLOCK_TUNED("Noteblock tuned", svt.Number, false, false, CMIType.None),
	FLOWER_POTTED("Flower potted", svt.Number, false, false, CMIType.None),
	RECORD_PLAYED("Record played", svt.Number, false, false, CMIType.None),
	SLEEP_IN_BED("Slept in bed", svt.Number, false, false, CMIType.None),
	SHULKER_BOX_OPENED("Shulker box opened", svt.Number, false, false, CMIType.None),
	CLEAN_SHULKER_BOX("Shulker box cleaned", svt.Number, false, false, CMIType.None),

	DROP("Item dropped", svt.Number, false, true, CMIType.Material),
	MINE_BLOCK("Blocks mined", svt.Number, true, true, CMIType.Block),
	PLACE_BLOCK("Blocks placed", svt.Number, true, true, CMIType.Block, Statistic.USE_ITEM),
	BREAK_ITEM("Item breaks", svt.Number, false, true, CMIType.Material),
	CRAFT_ITEM("Item crafts", svt.Number, false, true, CMIType.Material),
	USE_ITEM("Items used", svt.Number, false, true, CMIType.Material),
	PICKUP("Item pickups", svt.Number, false, true, CMIType.Material),
	KILL_ENTITY("Monster kills", svt.Number, false, true, CMIType.Entity);

	private svt type;
	private boolean isBlock;
	private boolean isSubSatistic;
	private CMIType subType;
	private String name;
	private String newName;
	private Statistic bukkit;

	CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType, Statistic stat) {
	    this(name, type, isBlock, isSubSatistic, subType, "");
	    bukkit = stat;
	}

	CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType, String newName) {
	    this.name = name;
	    this.type = type;
	    this.isBlock = isBlock;
	    this.isSubSatistic = isSubSatistic;
	    this.subType = subType;
	    this.newName = newName.isEmpty() ? null : newName;
	}

	CMIStatistic(String name, svt type, boolean isBlock, boolean isSubSatistic, CMIType subType) {
	    this(name, type, isBlock, isSubSatistic, subType, "");
	}

	public svt getType() {
	    return type;
	}

	public boolean isBlock() {
	    return isBlock;
	}

	public void setBlock(boolean isBlock) {
	    this.isBlock = isBlock;
	}

	public boolean isSubSatistic() {
	    return isSubSatistic;
	}

	public void setSubSatistic(boolean isSubSatistic) {
	    this.isSubSatistic = isSubSatistic;
	}

	public CMIType getSubType() {
	    return subType;
	}

	public Statistic getBukkitStat() {
	    if (bukkit == null)
		for (Statistic one : Statistic.values()) {
		    if (one.name().equalsIgnoreCase(this.name()))
			bukkit = one;
		    if (getNewName() != null && one.name().equalsIgnoreCase(getNewName()))
			bukkit = one;
		}
	    return bukkit;
	}

	public String getName() {
	    return name;
	}

	public String getNewName() {
	    return newName;
	}

	public static CMIStatistic getByName(String name) {
	    return null;
	}
    }

    private int autoTimerBukkitId = 0;

    public StatsManager(CMI plugin) {
	this.plugin = plugin;
	autoTimerBukkitId = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, autoTimer, 100L, 100L);
    }

    public void stop() {
	if (autoTimerBukkitId > 0)
	    Bukkit.getScheduler().cancelTask(autoTimerBukkitId);
    }

    public CMIStatistic getStatisticByName(String name) {
	return null;
    }

    public Statistic getStatistic(CMIStatistic type) {
	return null;
    }

    public synchronized boolean changeTo(Player player, CMIStatistic st, String extra, Long amount) {

	return true;
    }

    private BukkitTask task;
    SortedMap<Long, CMIUser> sm = Collections.synchronizedSortedMap(new TreeMap<Long, CMIUser>(Collections.reverseOrder()));
    SortedMap<UUID, Long> smt = Collections.synchronizedSortedMap(new TreeMap<UUID, Long>());
    private boolean loaded = false;

    public boolean isScanning() {
	return task != null;
    }

    public boolean isDataLoaded() {
	return loaded;
    }

    public int getTotalCount() {
	return sm.size();
    }

    public int getPages() {
	return sm.size() / 10;
    }

    public void addUserData(CMIUser user) {
    }

    long lastUpdate = 0L;

    public SortedMap<Long, CMIUser> getTop() {
	return null;
    }

    public int getPlace(CMIUser user) {
	return 0;
    }

    private Runnable autoTimer = new Runnable() {
	@Override
	public void run() {
	}
    };

    public void loadStats(final CommandSender sender, final String targetName) {

    }
}
