package com.Zrips.CMI.Modules.Worlds;

import java.util.TreeMap;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

public class CMIWorld {
    private World world;
    private TreeMap<Integer, CMIRegion> regions;

    public CMIWorld(Chunk chunk) {
    }

    public CMIWorld(World world) {
    }

    public World getWorld() {
        return null;
    }

    public CMIRegion addRegion(World world, int x, int z) {
        return null;
    }

    public CMIRegion addRegion(Chunk chunk) {
        return null;
    }

    public void setWorld(World world) {
    }

    public TreeMap<Integer, CMIRegion> getRegions() {
        return null;
    }

    public void setRegions(TreeMap<Integer, CMIRegion> regions) {
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
        return null;
    }

    public boolean insideWorldBorder(Location loc) {
        return false;
    }

    public static int getMinHeight(World world) {
        return 0;
    }
}
