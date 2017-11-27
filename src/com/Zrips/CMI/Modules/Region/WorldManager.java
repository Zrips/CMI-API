package com.Zrips.CMI.Modules.Region;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
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
    }

//    public void save() {
//
//	File destination = new File(plugin.getDataFolder(), "ChunkData.txt");
//
//	List<String> list = new ArrayList<String>();
//
//	for (Entry<String, WorldInfo> one : worldMap.entrySet()) {
//	    list.add(one.getKey());
//	    for (Chunk oneC : one.getValue().getWorld().getLoadedChunks()) {
//		list.add(oneC.getX() + ":" + oneC.getZ());
//	    }
//	}
//
//	try {
//	    Files.write(destination.toPath(), list, Charset.forName("UTF-8"));
//	} catch (IOException e) {
//	}
//
//    }

    public void addChunk(Chunk chunk) {
    }

    public WorldInfo getWorldInfoInRange(World world, SCord center, Integer range) {
	return null;
    }

    public WorldInfo getWorldInfoFromWorld(World world) {
	return worldMap.get(world.getName());
    }

    public SCord getNextInSpiral(long place) {
	return null;
    }

    public SCord getNextChunkLocation(WorldInfo info, boolean existing) {
	return null;
    }

    public Chunk getNextChunk(WorldInfo info, boolean existing) {
	return null;
    }

    public WorldInfo getWorldInfo(World world, SCord center, Integer range) {

	return null;
    }

    public WorldInfo fillEmpty(World world, SCord center, Integer range) {

	return null;
    }

    public WorldInfo getWorldInfo(World world, SCord center) {

	return null;
    }

    private static boolean inRange(SCord center, SCord scord, Integer range) {
	return false;
    }

    public HashMap<String, SCord> getRegionFiles(World world) {

	return null;
    }

    public HashMap<String, SCord> getRegionFiles(SCord center, Integer range) {

	return null;
    }

    private static SCord getRegionCord(SCord scord) {
	return null;
    }

    private static SCord getRegionCord(int x, int z) {
	return null;
    }

    private static SCord getRealChunkFromPlace(SCord region, int place) {
	return null;
    }

    private static SCord getCordFromPlace(int place) {
	return null;
    }


    private static int CoordToChunkPlace(int x, int z) {
	return x + (z * 32);
    }

}
