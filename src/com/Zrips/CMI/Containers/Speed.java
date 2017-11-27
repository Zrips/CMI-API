package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Speed {
    private Player player;
    private Location loc;

    private boolean allowBoost = false;
    private boolean allowSuperBoost = false;
    private boolean speedometer = false;

    private Long time = 0L;
    private Long boost = 0L;
    private Long superBoost = 0L;

    public Speed(Player player) {
    }

    public double getSpeed() {	
	return 0D;
    }

    public Location getLoc() {
	return loc;
    }

    public void setLoc(Location loc) {
	this.loc = loc;
    }

    public boolean isGoodTime() {
	return System.currentTimeMillis() - time > 1000;
    }

    public Long getTime() {
	return time;
    }

    public void setTime(Long time) {
	this.time = time;
    }

    public Long getBoost() {
	return boost;
    }

    public void setBoost(Long boost) {
	this.boost = boost;
    }

    public boolean isBoosting() {
	return System.currentTimeMillis() - boost < 250;
    }

    public Long getSuperBoost() {
	return superBoost;
    }

    public void setSuperBoost(Long superBoost) {
	this.superBoost = superBoost;
    }

    public boolean isSuperBoosting() {
	return System.currentTimeMillis() - superBoost < 1000;
    }

    public boolean isAllowBoost() {
	return allowBoost;
    }

    public boolean isAllowSuperBoost() {
	return allowSuperBoost;
    }

    public boolean isSpeedometer() {
	return speedometer;
    }
}
