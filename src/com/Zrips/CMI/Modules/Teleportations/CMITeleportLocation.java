package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMITeleportLocation {
    private World world;
    private Vector position;
    private float yaw;
    private float pitch;
    private CMITeleportCondition condition;
    private double fallDistance;
    private CMIMaterial floor;
    private CMITeleportType type;

    public CMITeleportLocation(World world) {
    }

    public Vector getPosition() {
        return null;
    }

    public CMITeleportLocation setPosition(Vector position) {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public float getYaw() {
        return 0.0f;
    }

    public CMITeleportLocation setYaw(float yaw) {
        return null;
    }

    public float getPitch() {
        return 0.0f;
    }

    public CMITeleportLocation setPitch(float pitch) {
        return null;
    }

    public CMITeleportCondition getCondition() {
        return null;
    }

    public CMITeleportLocation setCondition(CMITeleportCondition condition) {
        return null;
    }

    public double getFallDistance() {
        return 0.0;
    }

    public CMITeleportLocation setFallDistance(double fallDistance) {
        return null;
    }

    public CMIMaterial getFloor() {
        return null;
    }

    public CMITeleportLocation setFloor(CMIMaterial floor) {
        return null;
    }

    public CMITeleportType getType() {
        return null;
    }

    public void setType(CMITeleportType type) {
    }
}
