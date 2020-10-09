package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMITimeRate;
import com.Zrips.CMI.Containers.TimeInfo;

public class TimeManager {

    double tPHour = 1000d;
    double tPMin = 1000d / 60d;
    double tPSec = 1000d / 60d / 60d;
    private int schedID = -1;
    private HashMap<World, Integer> daySchedID = new HashMap<World, Integer>();

    private HashMap<World, HashMap<timeState, CMITimeRate>> dayTimeDurations = new HashMap<World, HashMap<timeState, CMITimeRate>>();

    private Set<World> froozenWorlds = new HashSet<World>();

    private CMI plugin;

    static int dayTime = 600;
    static int sunriseTime = 90;
    static int sunsetTime = 90;
    static int nightTime = 420;

    public enum timeState {
	day(0, 12000, 600), sunset(12000, 13800, 90), night(13800, 22200, 420), sunrise(22200, 24000, 90);

	private int from;
	private int until;
	private int defaultDuration;

	timeState(int from, int until, int defaultDuration) {
	    this.from = from;
	    this.until = until;
	    this.defaultDuration = defaultDuration;
	}

	public int getFrom() {
	    return from;
	}

	public int getUntil() {
	    return until;
	}

	public static timeState getTimeState(World world) {
	    return getTimeState((int) world.getTime());
	}

	public static timeState getTimeState(int ticks) {
	    for (timeState one : timeState.values()) {
		if (one.getFrom() <= ticks && one.getUntil() >= ticks)
		    return one;
	    }
	    return timeState.day;
	}

	public int getDefaultDuration() {
	    return defaultDuration;
	}
    }

    private List<String> worlds = new ArrayList<String>();

    public TimeManager(CMI plugin) {
	this.plugin = plugin;
    }

    static Pattern patern = Pattern.compile("((\\d+.)?\\d+[a-zA-Z])");

    public enum timeModifier {
	s(1), m(60), h(60 * 60), d(60 * 60 * 24), w(60 * 60 * 24 * 7), M(60 * 60 * 24 * 30), Y(60 * 60 * 24 * 365);

	private int modifier = 0;

	timeModifier(int modifier) {
	    this.modifier = modifier;
	}

	public int getModifier() {
	    return modifier;
	}

	public void setModifier(int modifier) {
	    this.modifier = modifier;
	}

	public static Long getTimeRangeFromString(String time) {
	    return null;
	}

	public static Double getDoubleTimeRangeFromString(String time) {

	    return null;
	}

    }

    public List<String> getWorlds() {
	return worlds;
    }

    public void runTimer() {

    }

    public void loadConfig() {

    }

    public void stopDayTimer(World world) {
	if (world == null)
	    return;
	Integer oldId = daySchedID.get(world);
	if (oldId != null) {
	    Bukkit.getScheduler().cancelTask(oldId);
	}
    }
//    Long time = System.currentTimeMillis();

    private void runDayTimer(World world) {

    }

    public String to24hour(Long ticks) {
	return null;
    }

    public String to24hourShort(Long ticks) {
	return to24hourShort(ticks, true);
    }

    public String to24hourShort(Long ticks, boolean trim) {

	return null;
    }

    public String toOnlyHoursShort(Long ticks, boolean trim, boolean includeMinutes) {

	return null;
    }

    public String to12hour(Long ticks) {

	return null;
    }

    private TimeInfo convertToTicks(TimeInfo tInfo) {

	return null;
    }

    public long setTime(World world, String time, boolean smooth) {
	TimeInfo tInfo = stringToTimeInfo(time);
	return setTime(world, tInfo, smooth);
    }

    public long setPTime(Player player, String time, boolean smooth) {
	TimeInfo tInfo = stringToTimeInfo(time);
	return setPTime(player, tInfo, smooth);
    }

    public TimeInfo stringToTimeInfo(String time) {

	return null;
    }

    int timeMoverId = -1;

    public static HashMap<World, String> movingmap = new HashMap<World, String>();

    public void cancelSunMove(final World world) {
    }

    private static long showTimer = 0L;

    public void moveSun(final World world, final int interval, final int updateInterval, int u, final boolean boosBar) {
    }

    public long setTime(World world, TimeInfo tInfo, boolean smooth) {
	return 0;
    }

    public long setPTime(Player player, TimeInfo tInfo, boolean smooth) {
	return 0;
    }

    public boolean isFroozenWorld(World world) {

	if (world.getGameRuleValue("doDaylightCycle").equalsIgnoreCase("true")) {
	    return false;
	}

	return froozenWorlds.contains(world);
    }

    public void addFroozenWorlds(World world) {
	this.froozenWorlds.add(world);
    }

    public void removeFroozenWorlds(World world) {
	this.froozenWorlds.add(world);
    }
}
