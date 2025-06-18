package com.Zrips.CMI.utils;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMISunMover;
import com.Zrips.CMI.Containers.CMITimeRate;

import net.Zrips.CMILib.Time.TimeInfo;
import net.Zrips.CMILib.Time.timeState;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class TimeManager {
    double tPHour;
    double tPMin;
    double tPSec;
    private HashMap<String, CMITask> daySchedID;
    private HashMap<String, HashMap<timeState, CMITimeRate>> dayTimeDurations;
    private Set<World> froozenWorlds;
    private CMI plugin;
    static int dayTime;
    static int sunriseTime;
    static int sunsetTime;
    static int nightTime;
    private List<String> worlds;
    private static SimpleDateFormat dateFormat;
    public static HashMap<World, CMISunMover> movingmap;
    private static long showTimer;

    public TimeManager(CMI plugin) {
    }

    public List<String> getWorlds() {
        return null;
    }

    public void runTimer() {
    }

    public void loadConfig() {
    }

    public void stopDayTimer(World world) {
    }

    public void stopDayTimer(String worldName) {
    }

    private void runDayTimer(World world) {
    }

    private void runDayTimer(String worldName) {
    }

    public long setTime(World world, String time, boolean smooth) {
        return 0;
    }

    public long setPTime(Player player, String time, boolean smooth) {
        return 0;
    }

    public void cancelSunMove(World world) {
    }

    public void cancelSunMove(World world, boolean changeCycle) {
    }

    public void moveSun(World world, int interval, int updateInterval, int u, boolean boosBar) {
    }

    public long setTime(World world, TimeInfo tInfo, boolean smooth) {
        return 0;
    }

    public long setPTime(Player player, TimeInfo tInfo, boolean smooth) {
        return 0;
    }

    public boolean isFroozenWorld(World world) {
        return false;
    }

    public void addFroozenWorlds(World world) {
    }

    public void removeFroozenWorlds(World world) {
    }

    public static String to24hourAproximateShort(Long ticks, boolean trim) {
        return null;
    }
}
