package com.Zrips.CMI.Modules.Region;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.bukkit.Chunk;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitTask;

import com.Zrips.CMI.CMI;

public class WorldManager {

    private CMI plugin;
    public Pattern regionPattern = Pattern.compile("r\\.(.+)\\.(.+)\\.mca");
    private Map<String, WorldInfo> worldMap = Collections.synchronizedMap(new HashMap<String, WorldInfo>());
    BukkitTask task = null;

    public void cancelLoading() {
        if (task != null)
            task.cancel();
    }

    public boolean stillLoading(World world) {
        if (world == null)
            return stillLoading();
        if (!worldMap.containsKey(world.getName()) && stillLoading())
            return true;
        return false;
    }

    public boolean stillLoading() {
        return task != null;
    }

    public WorldManager(final CMI plugin) {
        this.plugin = plugin;

    }

    public void removeWorldInfo(World world) {
        worldMap.remove(world.getName());
    }

    public void loadWorldChunksInfo(final World world) {
    }

    public void addChunk(Chunk chunk) {

    }

    public WorldInfo getWorldInfoInRange(World world, CMIRegion center, Integer range) {

        return null;
    }

    public WorldInfo getWorldInfoFromWorld(World world) {
        return worldMap.get(world.getName());
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
        return getRegionCord(scord.getX(), scord.getZ());
    }

    private static CMIRegion getRegionCord(int x, int z) {
        return new CMIRegion(x >> 5, z >> 5);
    }

    private static CMIRegion getRealChunkFromPlace(CMIRegion region, int place) {
        CMIRegion t = getCordFromPlace(place);
        return new CMIRegion(region.getX() * 32 + t.getX(), region.getZ() * 32 + t.getZ());
    }

    private static CMIRegion getCordFromPlace(int place) {
        return new CMIRegion(place % 32, place / 32);
    }

    private static int CoordToChunkPlace(int x, int z) {
        return x + (z * 32);
    }

}
