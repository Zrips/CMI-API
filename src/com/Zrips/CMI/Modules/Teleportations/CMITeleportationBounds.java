package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;
import org.bukkit.World;

import com.Zrips.CMI.Modules.Portals.CMIVector3D;

import net.Zrips.CMILib.Container.CMINumber;
import net.Zrips.CMILib.Container.CMIWorld;

public class CMITeleportationBounds {
    private World world;
    private CMIVector3D position;
    private int maxY;
    private int minY;
    private float yaw;
    private float pitch;
    private boolean imortal = false;
    private boolean canFly = false;
    private boolean flying = false;

    CMITeleportationBounds(Location loc) {
        this.world = loc.getWorld();
        this.yaw = loc.getYaw();
        this.pitch = loc.getPitch();
        this.position = new CMIVector3D(loc.getX(), loc.getY(), loc.getZ());
        this.maxY = loc.getBlockY();
        this.minY = loc.getBlockY() - 2;
    }

    public World getWorld() {
        return world;
    }

    public CMITeleportationBounds setUpRange(double range) {                
        this.maxY = CMINumber.clamp((int) (position.getY() + range), CMIWorld.getMinHeight(world), CMIWorld.getMaxHeight(world));        
        return this;
    }

    public CMITeleportationBounds setDownRange(double range) {
        this.minY = CMINumber.clamp((int) (position.getY() - range), CMIWorld.getMinHeight(world), CMIWorld.getMaxHeight(world));
        return this;
    }

    public CMITeleportationBounds setRange(double range) {
        setUpRange(range);
        setDownRange(range);
        return this;
    }

    public CMITeleportationBounds setWorld(World world) {
        this.world = world;
        return this;
    }

    public int getMaxY() {
        return maxY;
    }

    public CMITeleportationBounds setMaxY(int maxY) {
        this.maxY = maxY;
        return this;
    }

    public int getMinY() {
        return minY;
    }

    public CMITeleportationBounds setMinY(int minY) {
        this.minY = minY;
        return this;
    }

    public CMIVector3D getPosition() {
        return position;
    }

    public CMITeleportationBounds setPosition(CMIVector3D position) {
        this.position = position;
        return this;
    }

    public float getYaw() {
        return yaw;
    }

    public CMITeleportationBounds setYaw(float yaw) {
        this.yaw = yaw;
        return this;
    }

    public float getPitch() {
        return pitch;
    }

    public CMITeleportationBounds setPitch(float pitch) {
        this.pitch = pitch;
        return this;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public CMITeleportationBounds setCanFly(boolean canFly) {
        this.canFly = canFly;
        return this;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }

    public boolean isImortal() {
        return imortal;
    }

    public CMITeleportationBounds setImortal(boolean imortal) {
        this.imortal = imortal;
        return this;
    }

}
