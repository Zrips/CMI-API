package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.BossBar.BossBarInfo;

public class Speed {
    private BossBarInfo bb;
    private Player player;
//    private Location loc;

    private boolean allowBoost = false;
    private boolean allowSuperBoost = false;
    private boolean speedometer = false;

    private List<Long> time = new ArrayList<Long>();
    private List<Location> loc = new ArrayList<Location>();
    private Long boost = 0L;
    private Long superBoost = 0L;

    private boolean free = false;
    private boolean dura = false;

    private static int amount = 5;
    private static int timeRange = (1000 / amount);

    public Speed(Player player) {
    }

    private long getTime() {
        while (this.time.size() > amount) {
            this.time.remove(0);
        }
        if (this.time.isEmpty())
            return System.currentTimeMillis();
        return this.time.get(0);
    }

    private Location getLocation() {
        while (this.loc.size() > amount) {
            this.loc.remove(0);
        }
        if (this.loc.isEmpty())
            return null;
        return this.loc.get(0);
    }

    public double getSpeed() {
        Location lc = getLocation();
        if (lc == null)
            return 0D;

        if (!player.getWorld().equals(lc.getWorld()))
            return 0D;

        double dis = player.getLocation().distance(lc);
        long time = System.currentTimeMillis() - getTime();
        return (int) (((dis / time) * 100D * 6 * 6) * 100) / 100D;
    }

    public void setLoc(Location loc) {
        this.loc.add(loc);
        while (this.loc.size() > amount) {
            this.loc.remove(0);
        }
    }

    public boolean isGoodTime() {
        if (time.isEmpty())
            return true;
        return System.currentTimeMillis() - this.time.get(this.time.size() - 1) > timeRange;
    }

    public void setTime(Long time) {
        this.time.add(time);
        while (this.time.size() > amount) {
            this.time.remove(0);
        }
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

    public boolean isShowDurability() {
        return dura;
    }
}
