package com.Zrips.CMI.Containers;

import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Utility;
import org.bukkit.World;
import org.bukkit.block.Block;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;

public class CMILocation extends Location {

    public CMILocation(World world, double x, double y, double z, float yaw, float pitch) {
	super(world, x, y, z, yaw, pitch);
	this.worldName = world.getName();
    }

    public CMILocation(World world, double x, double y, double z) {
	super(world, x, y, z);
	if (world != null)
	    this.worldName = world.getName();
    }

    private String worldName;

    public CMILocation(Location loc) {
	super(loc.getWorld(), loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());
    }

    public CMILocation(String world, double x, double y, double z, float yaw, float pitch) {
	super(Bukkit.getWorld(world), x, y, z, yaw, pitch);
    }

    public CMILocation(String world, double x, double y, double z) {
	super(Bukkit.getWorld(world), x, y, z);
	}

    public void recheck() {
	updateWorld();
    }

    private void updateWorld() {
    }

    public String getWorldName() {
	return this.worldName != null ? this.worldName : this.getWorld() == null ? null : this.getWorld().getName();
    }

    public Location getBukkitLoc() {
	updateWorld();
	return this;
    }

    public boolean isValid() {
	updateWorld();
	return this.getWorld() != null && this.getWorld().getName() != null && Bukkit.getWorld(this.getWorld().getUID()) != null;
    }

    @Override
    public World getWorld() {
	updateWorld();
	return super.getWorld();
    }

    @Override
    public Chunk getChunk() {
	updateWorld();
	return super.getChunk();
    }

    @Override
    public Block getBlock() {
	updateWorld();
	if (super.getWorld() == null)
	    return null;
	return super.getBlock();
    }

    @Override
    public Location add(Location vec) {
	updateWorld();
	return super.add(vec);
    }

    @Override
    public Location subtract(Location vec) {
	updateWorld();
	return super.subtract(vec);
    }

    @Override
    public double distanceSquared(Location o) {
	updateWorld();
	return super.distanceSquared(o);
    }

    @Override
    public boolean equals(Object obj) {
	updateWorld();
	return super.equals(obj);
    }

    @Override
    public int hashCode() {
	updateWorld();
	return super.hashCode();
    }

    @Override
    public String toString() {
	updateWorld();
	return super.toString();
    }

    @Override
    public CMILocation clone() {
	updateWorld();
	return new CMILocation(super.clone());
    }

    @Override
    @Utility
    public Map<String, Object> serialize() {
	updateWorld();
	return super.serialize();
    }

    public int getHighestBlockYAt() {
	return 0;
    }

    public Material getBlockType() {
	return null;
    }

    public CMIMaterial getBlockCMIType() {
	return null;
    }

    public static CMILocation fromString(String map) {
	return fromString(map, ";");
    }

    public static CMILocation fromString(String map, String separator) {
	return null;
    }
}
