package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.World;

import net.Zrips.CMILib.Container.CMILocation;

public class RandomTeleport {
    private boolean enabled = true;

    private int MaxDistance;
    private int MinDistance;
    private CMILocation loc;
    private boolean circle = false;
    private boolean ignoreWater = true;
    private boolean ignoreLava = true;
    private boolean ignorePowderSnow = true;
    private boolean surfaceOnly = false;
    private int MaxY = 256;
    private int MinY = 0;

    public RandomTeleport(boolean enabled, int MaxDistance, int MinDistance, CMILocation center) {
        this.loc = center;
        this.MaxDistance = MaxDistance;
        this.MinDistance = MinDistance;
        this.enabled = enabled;
    }

    public RandomTeleport(World world, int MaxDistance, int MinDistance, int centerX, int centerZ) {
        this(true, MaxDistance, MinDistance, new CMILocation(world, centerX, 63, centerZ));
    }

    public RandomTeleport(World world) {
        this(true, 100, 0, new CMILocation(world, 0, 63, 0));
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

    public RandomTeleport setCircle(boolean circle) {
        this.circle = circle;
        return this;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public RandomTeleport setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public RandomTeleport setMinDistance(int minDistance) {
        MinDistance = minDistance;
        return this;
    }

    public RandomTeleport setMaxDistance(int maxDistance) {
        MaxDistance = maxDistance;
        return this;
    }

    public RandomTeleport setCenter(CMILocation loc) {
        this.loc = loc;
        return this;
    }

    public boolean isIgnoreWater() {
        return ignoreWater;
    }

    public RandomTeleport setIgnoreWater(boolean ignoreWater) {
        this.ignoreWater = ignoreWater;
        return this;
    }

    public boolean isIgnoreLava() {
        return ignoreLava;
    }

    public RandomTeleport setIgnoreLava(boolean ignoreLava) {
        this.ignoreLava = ignoreLava;
        return this;
    }

    public int getMaxY() {
        return MaxY;
    }

    public RandomTeleport setMaxY(int maxY) {
        MaxY = maxY;
        return this;
    }

    public int getMinY() {
        return MinY;
    }

    public RandomTeleport setMinY(int minY) {
        MinY = minY;
        return this;
    }

    public boolean isIgnorePowderedSnow() {
        return ignorePowderSnow;
    }

    public RandomTeleport setIgnorePowderSnow(boolean ignorePowderSnow) {
        this.ignorePowderSnow = ignorePowderSnow;
        return this;
    }

    public boolean isSurfaceOnly() {
        return surfaceOnly;
    }

    public RandomTeleport setSurfaceOnly(boolean surfaceOnly) {
        this.surfaceOnly = surfaceOnly;
        return this;
    }
}
