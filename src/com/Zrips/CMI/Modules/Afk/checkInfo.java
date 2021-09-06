package com.Zrips.CMI.Modules.Afk;

import org.bukkit.Location;

public class checkInfo {
    private Long time = 0L;
    Location loc;

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
	return time + 1000 < System.currentTimeMillis();
    }

    public Long getTime() {
	return time;
    }
}
