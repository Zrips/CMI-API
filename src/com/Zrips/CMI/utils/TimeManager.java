package com.Zrips.CMI.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMISunMover;
import com.Zrips.CMI.Containers.CMITimeRate;

import net.Zrips.CMILib.Time.CMITimeManager;
import net.Zrips.CMILib.Time.TimeInfo;
import net.Zrips.CMILib.Time.timeState;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TimeManager {

    double tPHour = 1000d;
    double tPMin = 1000d / 60d;
    double tPSec = 1000d / 60d / 60d;
    private HashMap<World, CMITask> daySchedID = new HashMap<World, CMITask>();

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
        CMITask task = daySchedID.remove(world);
        if (task != null) {
            task.cancel();
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

    public static HashMap<World, CMISunMover> movingmap = new HashMap<World, CMISunMover>();

    public void cancelSunMove(final World world) {
        cancelSunMove(world, true);
    }

    public void cancelSunMove(final World world, boolean changeCycle) {

    }

    private static long showTimer = 0L;

    public void moveSun(final World world, final int interval, final int updateInterval, int u, final boolean boosBar) {

    }

    public long setTime(World world, TimeInfo tInfo, boolean smooth) {
        return -1L;

    }

    public long setPTime(Player player, TimeInfo tInfo, boolean smooth) {
        return -1L;
    }

    public boolean isFroozenWorld(World world) {

        if (world.getGameRuleValue("doDaylightCycle").equalsIgnoreCase("true")) {
            return false;
        }

        return froozenWorlds.contains(world);
    }

    public void addFroozenWorlds(World world) {
        this.froozenWorlds.add(world);
        CMISunMover mover = movingmap.get(world);
        if (mover != null) {
            mover.setMoving("false");
        }
    }

    public void removeFroozenWorlds(World world) {
        this.froozenWorlds.add(world);
        CMISunMover mover = movingmap.get(world);
        if (mover != null) {
            mover.setMoving("true");
        }
    }

    public static String to24hourAproximateShort(Long ticks, boolean trim) {

        return null;
    }
}
