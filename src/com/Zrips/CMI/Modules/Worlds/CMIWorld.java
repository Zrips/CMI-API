package com.Zrips.CMI.Modules.Worlds;

import java.util.TreeMap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

import net.Zrips.CMILib.Version.Version;

public class CMIWorld {

    private World world;

    private TreeMap<Integer, CMIRegion> regions = new TreeMap<Integer, CMIRegion>();

    public CMIWorld(Chunk chunk) {
	this.world = chunk.getWorld();
    }

    public CMIWorld(World world) {
	this.world = world;
    }

    public World getWorld() {
	return world;
    }

    public CMIRegion addRegion(World world, int x, int z) {
	CMIRegion c = new CMIRegion(world, x, z);
	regions.put(coordinatesToPlace(x, z), c);
	return c;
    }

    public CMIRegion addRegion(Chunk chunk) {
	CMIRegion c = new CMIRegion(chunk);
	regions.put(coordinatesToPlace(chunk.getX() >> 5, chunk.getZ() >> 5), c);
	return c;
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public TreeMap<Integer, CMIRegion> getRegions() {
	return regions;
    }

    public void setRegions(TreeMap<Integer, CMIRegion> regions) {
	this.regions = regions;
    }

    public CMIRegion getRegion(Chunk chunk) {
	return getRegionByChunkCoord(chunk.getX(), chunk.getZ());
    }

    public CMIRegion getRegionByChunkCoord(int x, int z) {
	return getRegion(x >> 5, z >> 5);
    }

    public CMIRegion getRegion(int x, int z) {
	Integer place = coordinatesToPlace(x, z);
	return regions.get(place);
    }

    private static Integer coordinatesToPlace(int x, int z) {
	return x + (z * 1024);
    }

    public boolean insideWorldBorder(Location loc) {
	try {
	    Location center = this.world.getWorldBorder().getCenter();
	    double size = this.world.getWorldBorder().getSize() / 2D;
	    double minX = center.getX() - size;
	    double maxX = center.getX() + size;
	    double minZ = center.getZ() - size;
	    double maxZ = center.getZ() + size;
	    return loc.getX() >= minX && loc.getX() < maxX && loc.getZ() >= minZ && loc.getZ() < maxZ;
	} catch (Throwable e) {
	    e.printStackTrace();
	    return true;
	}
    }

    public static int getMinHeight(World world) {
	if (Version.isCurrentEqualOrLower(Version.v1_16_R3))
	    return 0;
	return world.getMinHeight();
    }
}
