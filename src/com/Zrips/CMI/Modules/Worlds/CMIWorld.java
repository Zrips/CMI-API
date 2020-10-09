package com.Zrips.CMI.Modules.Worlds;

import java.util.TreeMap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

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
	return null;
    }

    public CMIRegion addRegion(Chunk chunk) {
	return null;
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
	return null;
    }

    public CMIRegion getRegionByChunkCoord(int x, int z) {
	return null;
    }

    public CMIRegion getRegion(int x, int z) {
	return null;
    }

    private static Integer coordinatesToPlace(int x, int z) {
	return x + (z * 1024);
    }

    public boolean insideWorldBorder(Location loc) {
	return true;

    }
}
