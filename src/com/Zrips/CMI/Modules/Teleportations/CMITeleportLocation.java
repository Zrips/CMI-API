package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMITeleportLocation {
    private World world;
    private Vector position = null;
    private float yaw = 0;
    private float pitch = 0;
    private CMITeleportCondition condition = CMITeleportCondition.Good;
    private int fallDistance = 0;
    private CMIMaterial floor = null;

    public CMITeleportLocation(World world) {
        this.world = world;
    }

    public Vector getPosition() {
        return position;
    }

    public CMITeleportLocation setPosition(Vector position) {
        this.position = position;
        return this;
    }

    public World getWorld() {
        return world;
    }

    public Location getLocation() {
        return new Location(world, position.getX(), position.getY(), position.getZ(), yaw, pitch);
    }

    public float getYaw() {
        return yaw;
    }

    public CMITeleportLocation setYaw(float yaw) {
        this.yaw = yaw;
        return this;
    }

    public float getPitch() {
        return pitch;
    }

    public CMITeleportLocation setPitch(float pitch) {
        this.pitch = pitch;
        return this;
    }

    public CMITeleportCondition getCondition() {
        return condition;
    }

    public CMITeleportLocation setCondition(CMITeleportCondition condition) {
        this.condition = condition;
        return this;
    }

    public int getFallDistance() {
        return fallDistance;
    }

    public CMITeleportLocation setFallDistance(int fallDistance) {
        this.fallDistance = fallDistance;
        return this;
    }

    public CMIMaterial getFloor() {
        return floor;
    }

    public CMITeleportLocation setFloor(CMIMaterial floor) {
        this.floor = floor;
        return this;
    }

}
