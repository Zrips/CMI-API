package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.World;
import org.bukkit.event.Listener;

public class FlyListener1_17 implements Listener {

    private class flightData {
	private boolean canFly = false;
	private boolean flying = false;
	private World world;
	private Long time = 0l;

	public flightData(World world, boolean canFly, boolean flying) {
	    this.world = world;
	    this.canFly = canFly;
	    this.flying = flying;
	    this.time = System.currentTimeMillis();
	}

	public boolean isCanFly() {
	    return canFly;
	}

	public void setCanFly(boolean canFly) {
	    this.canFly = canFly;
	}

	public boolean isFlying() {
	    return flying;
	}

	public void setFlying(boolean flying) {
	    this.flying = flying;
	}

	public Long getTime() {
	    return time;
	}

	public void setTime(Long time) {
	    this.time = time;
	}

	public World getWorld() {
	    return world;
	}

	public void setWorld(World world) {
	    this.world = world;
	}
    }

    HashMap<UUID, flightData> map = new HashMap<UUID, flightData>();
}
