package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.World;

public class RandomTeleport {
    private boolean enabled = true;

    private int MaxDistance;
    private int MinDistance;
    private Location loc;
    private boolean circle = false;
    private boolean ignoreWater = true;
    private boolean ignoreLava = true;
    private int MaxY = 256;
    private int MinY = 0;

    public RandomTeleport(boolean enabled, World world, int MaxDistance, int MinDistance, int centerX, int centerZ) {
	this.loc = new Location(world, centerX, world.getMaxHeight() / 2, centerZ);
	this.MaxDistance = MaxDistance;
	this.MinDistance = MinDistance;
	this.enabled = enabled;
    }

    public RandomTeleport(World world, int MaxDistance, int MinDistance, int centerX, int centerZ) {
	this(true, world, MaxDistance, MinDistance, centerX, centerZ);
    }

    public RandomTeleport(World world) {
	this(true, world, 100, 0, 0, 0);
    }

    public Location getCenter() {
	return this.loc;
    }

    @Deprecated
    public int getMaxCord() {
	return this.MaxDistance;
    }

    public int getMaxDistance() {
	return this.MaxDistance;
    }

    @Deprecated
    public int getMinCord() {
	return this.MinDistance;
    }

    public int getMinDistance() {
	return this.MinDistance;
    }

    public boolean isCircle() {
	return circle;
    }

    public void setCircle(boolean circle) {
	this.circle = circle;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public void setMinDistance(int minDistance) {
	MinDistance = minDistance;
    }

    public void setMaxDistance(int maxDistance) {
	MaxDistance = maxDistance;
    }

    public void setCenter(Location loc) {
	this.loc = loc;
    }

    public boolean isIgnoreWater() {
	return ignoreWater;
    }

    public void setIgnoreWater(boolean ignoreWater) {
	this.ignoreWater = ignoreWater;
    }

    public boolean isIgnoreLava() {
	return ignoreLava;
    }

    public void setIgnoreLava(boolean ignoreLava) {
	this.ignoreLava = ignoreLava;
    }

    public int getMaxY() {
	return MaxY;
    }

    public void setMaxY(int maxY) {
	MaxY = maxY;
    }

    public int getMinY() {
	return MinY;
    }

    public void setMinY(int minY) {
	MinY = minY;
    }
}
