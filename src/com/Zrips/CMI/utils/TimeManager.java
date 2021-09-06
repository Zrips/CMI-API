package com.Zrips.CMI.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.boss.BarColor;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMITimeRate;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.SleepStats;

import net.Zrips.CMILib.BossBar.BossBarInfo;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.Logs.CMIDebug;
import net.Zrips.CMILib.Time.CMITimeManager;
import net.Zrips.CMILib.Time.TimeInfo;
import net.Zrips.CMILib.Time.timeState;
import net.Zrips.CMILib.TitleMessages.CMITitleMessage;
import net.Zrips.CMILib.Version.Version;

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

    private List<String> worlds = new ArrayList<String>();

    public TimeManager(CMI plugin) {
	this.plugin = plugin;
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

    public long setTime(World world, String time, boolean smooth) {
	TimeInfo tInfo = CMITimeManager.stringToTimeInfo(time);
	return setTime(world, tInfo, smooth);
    }

    public long setPTime(Player player, String time, boolean smooth) {
	TimeInfo tInfo = CMITimeManager.stringToTimeInfo(time);
	return setPTime(player, tInfo, smooth);
    }

    int timeMoverId = -1;

    public static HashMap<World, String> movingmap = new HashMap<World, String>();

    public void cancelSunMove(final World world) {
    }

    private static long showTimer = 0L;

    public void moveSun(final World world, final int interval, final int updateInterval, int u, final boolean boosBar) {

    }

    public long setTime(World world, TimeInfo tInfo, boolean smooth) {
	if (tInfo.getHours() < 0L && tInfo.getTicks() < 0L)
	    return -1L;

	if (tInfo.getTicks() < 0L) {
	    CMITimeManager.convertToTicks(tInfo);
	}

	Long overalTicks = Long.valueOf(tInfo.getTicks());

	if (smooth) {
	    this.moveSun(world, plugin.getConfigManager().getAutoTimeSmoothSpeed(), 1, overalTicks.intValue(), false);
	} else
	    world.setTime(overalTicks);
	return overalTicks;
    }

    public long setPTime(Player player, TimeInfo tInfo, boolean smooth) {
	if (tInfo.getHours() < 0L && tInfo.getTicks() < 0L)
	    return -1L;
	if (tInfo.getTicks() < 0L) {
	    CMITimeManager.convertToTicks(tInfo);
	}
	Long overalTicks = Long.valueOf(tInfo.getTicks());
	player.setPlayerTime(overalTicks, false);
	plugin.getPlayerManager().getUser(player).setpTime(overalTicks, false);
	if (!player.isOnline())
	    player.saveData();
	return overalTicks;
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
