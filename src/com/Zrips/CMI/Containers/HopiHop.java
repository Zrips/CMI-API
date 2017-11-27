package com.Zrips.CMI.Containers;

import org.bukkit.Location;

public class HopiHop {

    Location loc;
    int tick;
    long lastThick;

    public HopiHop(Location loc) {
	this.loc = loc;
	this.tick = 1;
	this.lastThick = System.currentTimeMillis();
    }

    public void addTick() {
	this.tick++;
	this.lastThick = System.currentTimeMillis();
    }

    public int getTick() {
	return this.tick;
    }

    public Location getLocation() {
	return this.loc;
    }

    public long getLastTick(){
	return this.lastThick;
    }
}
