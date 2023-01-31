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

        return true;

    }

    public static int getMinHeight(World world) {
        return 0;

    }
}
