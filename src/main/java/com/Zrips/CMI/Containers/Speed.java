package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Modules.BossBar.BossBarInfo;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class Speed {
    private BossBarInfo bb;
    private Player player;
    private Location loc;

    private boolean allowBoost = false;
    private boolean allowSuperBoost = false;
    private boolean speedometer = false;

    private Long time = 0L;
    private Long boost = 0L;
    private Long superBoost = 0L;
    
    private boolean free = false;

    public Speed(Player player) {
    }

    public double getSpeed() {	
	return 0;
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

    public boolean isFree() {
	return free;
    }

    public void setFree(boolean free) {
	this.free = free;
    }

    public BossBarInfo getBb() {
	return bb;
    }

    public void setBb(BossBarInfo bb) {
	this.bb = bb;
    }
}
