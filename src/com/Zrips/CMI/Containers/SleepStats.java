package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SleepStats {
    private World world;
    private int speed;
    private double sleeping;
    private double total;
    private double percent;
    private int online;
    CMITask task;
    public static List<String> timeSpeedUpWorlds;
    private static boolean SleepingPercentage;
    public static boolean SleepingExcludeAfk;
    public static boolean SleepingSpeedup;
    public static boolean SleepingOnlyDurringNight;
    public static boolean SleepingInform;
    private static int SleepingBaseSpeed;
    private static int SleepingMinBeforeSpeeding;
    private static int SleepingMinSpeed;
    public static int SleepingInformDelay;
    public static int SleepingNightStartsAt;
    public static String SleepingSpeedupInfoType;
    public static HashMap<UUID, Long> informMap;

    public static void loadConfig() {
    }

    public SleepStats(World world) {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public int getSpeed() {
        return 0;
    }

    public void setSpeed(int speed) {
    }

    public double getSleeping() {
        return 0.0;
    }

    public int needToBeSleeping() {
        return 0;
    }

    public void setSleeping(double sleeping) {
    }

    public double getTotal() {
        return 0.0;
    }

    public void setTotal(double total) {
    }

    public double getPercent() {
        return 0.0;
    }

    public void setPercent(double percent) {
    }

    public int getOnline() {
        return 0;
    }

    public int getWorldOnline() {
        return 0;
    }

    public void setOnline(int online) {
    }

    public void onBedEnter(Player player) {
    }

    public void onBedLeave(Player player) {
    }
}
