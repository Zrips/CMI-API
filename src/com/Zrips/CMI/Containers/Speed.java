package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.BossBar.BossBarInfo;

public class Speed {
    private BossBarInfo bb;
    private Player player;
    private boolean allowBoost;
    private boolean allowSuperBoost;
    private boolean speedometer;
    private List<Long> time;
    private List<Location> loc;
    private Long boost;
    private Long superBoost;
    private boolean free;
    private boolean dura;
    private static int amount;
    private static int timeRange;

    public Speed(Player player) {
    }

    private long getTime() {
        return 0;
    }

    private Location getLocation() {
        return null;
    }

    public double getSpeed() {
        return 0.0;
    }

    public void setLoc(Location loc) {
    }

    public boolean isGoodTime() {
        return false;
    }

    public void setTime(Long time) {
    }

    public Long getBoost() {
        return null;
    }

    public void setBoost(Long boost) {
    }

    public boolean isBoosting() {
        return false;
    }

    public Long getSuperBoost() {
        return null;
    }

    public void setSuperBoost(Long superBoost) {
    }

    public boolean isSuperBoosting() {
        return false;
    }

    public boolean isAllowBoost() {
        return false;
    }

    public boolean isAllowSuperBoost() {
        return false;
    }

    public boolean isSpeedometer() {
        return false;
    }

    public boolean isFree() {
        return false;
    }

    public void setFree(boolean free) {
    }

    public BossBarInfo getBb() {
        return null;
    }

    public void setBb(BossBarInfo bb) {
    }

    public boolean isShowDurability() {
        return false;
    }
}
