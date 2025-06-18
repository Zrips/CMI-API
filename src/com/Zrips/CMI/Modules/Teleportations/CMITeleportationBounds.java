package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CMIVector3D;

public class CMITeleportationBounds {
    private World world;
    private CMIVector3D position;
    private int maxY;
    private int minY;
    private float yaw;
    private float pitch;
    private boolean imortal;
    private boolean canFly;
    private boolean flying;
    private Player player;
    private boolean ignoreYLimits;

    CMITeleportationBounds(Location loc) {
    }

    public World getWorld() {
        return null;
    }

    public CMITeleportationBounds setUpRange(double range) {
        return null;
    }

    public CMITeleportationBounds setDownRange(double range) {
        return null;
    }

    public CMITeleportationBounds setRange(double range) {
        return null;
    }

    public CMITeleportationBounds setWorld(World world) {
        return null;
    }

    public int getMaxY() {
        return 0;
    }

    public CMITeleportationBounds setMaxY(int maxY) {
        return null;
    }

    public int getMinY() {
        return 0;
    }

    public CMITeleportationBounds setMinY(int minY) {
        return null;
    }

    public CMIVector3D getPosition() {
        return null;
    }

    public CMITeleportationBounds setPosition(CMIVector3D position) {
        return null;
    }

    public float getYaw() {
        return 0.0f;
    }

    public CMITeleportationBounds setYaw(float yaw) {
        return null;
    }

    public float getPitch() {
        return 0.0f;
    }

    public CMITeleportationBounds setPitch(float pitch) {
        return null;
    }

    public boolean isCanFly() {
        return false;
    }

    public CMITeleportationBounds setCanFly(boolean canFly) {
        return null;
    }

    public boolean isFlying() {
        return false;
    }

    public void setFlying(boolean flying) {
    }

    public boolean isImortal() {
        return false;
    }

    public CMITeleportationBounds setImortal(boolean imortal) {
        return null;
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player player) {
    }

    public boolean isIgnoreYLimits() {
        return false;
    }

    public void setIgnoreYLimits(boolean ignoreYLimits) {
    }
}
