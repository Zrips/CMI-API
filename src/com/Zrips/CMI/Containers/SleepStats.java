package com.Zrips.CMI.Containers;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Config;

public class SleepStats {

    private World world;
    private int speed;
    private double sleeping;
    private double total;
    private double percent;
    private int online;

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
	int min = Config.SleepingMinBeforeSpeeding;
	if (Config.SleepingPercentage) {
	    double perc = min / 100D;
	    int needed = (int) Math.ceil(getTotal() * perc);
	    return needed;
	}
	return min;
    }

    public void setSleeping(double sleeping) {
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
//	    if (CMIPerm.sleepignore.hasSetPermission(one))
//		continue;
	    if (one.getWorld().equals(world))
		count++;
	}
	return count;
    }

    public void setOnline(int online) {
	this.online = online;
    }
}
