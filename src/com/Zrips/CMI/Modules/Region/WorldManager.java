package com.Zrips.CMI.Modules.Region;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitTask;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Container.CMIVectorInt2D;

public class WorldManager {
    private CMI plugin;
    public Pattern regionPattern;
    private static Map<String, WorldInfo> worldMap;
    BukkitTask task;

    public void cancelLoading() {
    }

    public boolean stillLoading(World world) {
        return false;
    }

    public boolean stillLoading() {
        return false;
    }

    public WorldManager(CMI plugin) {
    }

    public void removeWorldInfo(World world) {
    }

    public void loadWorldChunksInfo(World world) {
    }

    public void addChunk(Chunk chunk) {
    }

    public WorldInfo getWorldInfoInRange(World world, CMIVectorInt2D center, int range) {
        return null;
    }

    public WorldInfo getWorldInfoInRange(World world, CMIRegion center, Integer range) {
        return null;
    }

    public WorldInfo getWorldInfoFromWorld(World world) {
        return null;
    }

    public CMIRegion getNextInSpiral(long place) {
        return null;
    }

    public CMIRegion getNextChunkLocation(WorldInfo info, boolean existing) {
        return null;
    }

    public Chunk getNextChunk(WorldInfo info, boolean existing) {
        return null;
    }

    public WorldInfo getWorldInfo(World world, CMIRegion center, Integer range) {
        return null;
    }

    public WorldInfo fillEmpty(World world, CMIRegion center, Integer range) {
        return null;
    }

    public WorldInfo getWorldInfo(World world, CMIRegion center) {
        return null;
    }

    private static boolean inRange(CMIRegion center, CMIRegion scord, Integer range) {
        return false;
    }

    public HashMap<String, CMIRegion> getRegionFiles(World world) {
        return null;
    }

    public HashMap<String, CMIRegion> getRegionFiles(CMIRegion center, Integer range) {
        return null;
    }

    private static CMIRegion getRegionCord(CMIRegion scord) {
        return null;
    }

    private static CMIRegion getRegionCord(int x, int z) {
        return null;
    }

    private static CMIRegion getRealChunkFromPlace(CMIRegion region, int place) {
        return null;
    }

    private static CMIRegion getCordFromPlace(int place) {
        return null;
    }

    private static int CoordToChunkPlace(int x, int z) {
        return 0;
    }
}
