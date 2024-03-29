package com.Zrips.CMI.Modules.Afk;

import org.bukkit.Location;

public class checkInfo {
    private Long time = 0L;
    private Location loc;
    private double prevAngle = 0;

    checkInfo(Location loc) {
        this.loc = loc;
        updateTime();
    }

    public void updateTime() {
        time = System.currentTimeMillis();
    }

    public void updateLocation(Location loc) {
        this.loc = loc.clone();
    }

    public boolean isSameDirection(Location loc) {
        return this.loc.getPitch() == loc.getPitch() && this.loc.getYaw() == loc.getYaw();
    }

    public boolean isOnlyPitchChange(Location loc) {
        return this.loc.getX() == loc.getX() && this.loc.getY() == loc.getY() && this.loc.getZ() == loc.getZ();
    }

    public boolean timeToCheck() {
        return time + 400L < System.currentTimeMillis();
    }

    public Long getTime() {
        return time;
    }

    public Location getLocation() {
        return loc;
    }

    public double getPrevAngle() {
        return prevAngle;
    }

    public void setPrevAngle(double prevAngle) {
        this.prevAngle = prevAngle;
    }
}
