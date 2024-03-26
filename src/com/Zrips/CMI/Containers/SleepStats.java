package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
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
    CMITask task = null;

    public static List<String> timeSpeedUpWorlds = new ArrayList<String>();
    private static boolean SleepingPercentage;
    public static boolean SleepingExcludeAfk, SleepingSpeedup, SleepingOnlyDurringNight, SleepingInform;
    private static int SleepingBaseSpeed, SleepingMinBeforeSpeeding, SleepingMinSpeed;
    public static int SleepingInformDelay;
    public static String SleepingSpeedupInfoType;
    public static HashMap<UUID, Long> informMap = new HashMap<UUID, Long>();

    public static void loadConfig() {

    }

    public SleepStats(World world) {
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getSleeping() {
        return sleeping;
    }

    public int needToBeSleeping() {
        int min = SleepingMinBeforeSpeeding;
        if (SleepingPercentage) {
            double perc = min / 100D;
            int needed = (int) Math.ceil(getTotal() * perc);
            return needed;
        }
        return min;
    }

    public void setSleeping(double sleeping) {

        this.sleeping = sleeping;

        percent = (sleeping) / total;

        speed = (int) (SleepingBaseSpeed * percent);

        if (speed < SleepingMinSpeed)
            speed = SleepingMinSpeed;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public int getOnline() {
        return online;
    }

    public int getWorldOnline() {
        int count = 0;
        for (Player one : Bukkit.getOnlinePlayers()) {
            if (one.getWorld().equals(world))
                count++;
        }
        return count;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public void onBedEnter(Player player) {

    }

    public void onBedLeave(Player player) {

    }
}
