package com.Zrips.CMI.Modules.Region;

import java.util.List;
import java.util.Map;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

public class WorldInfo {
    private transient Map<String, List<Boolean>> regionChunks;
    private CMIRegion center;
    private long totalChunks;
    private long lastChecked;
    private World world;
    private int range;

    @Override
    public WorldInfo clone() {
        return null;
    }

    public WorldInfo(World world, CMIRegion center) {
    }

    public WorldInfo(Location center, int range) {
    }

    public void setRegion(Map<String, List<Boolean>> regionChunks) {
    }

    public Map<String, List<Boolean>> getRegion() {
        return null;
    }

    private static String toString(CMIRegion cord) {
        return null;
    }

    public Boolean getRegionsChunk(CMIRegion region, int place) {
        return null;
    }

    public List<Boolean> getRegionPlaces(CMIRegion region) {
        return null;
    }

    public WorldInfo setRegionPlaces(CMIRegion region, List<Boolean> places) {
        return null;
    }

    public CMIRegion getNextChunkLoc(boolean exist) {
        return null;
    }

    public Chunk getNextChunk(boolean exist) {
        return null;
    }

    public void setRegionChunks(CMIRegion scord, List<Boolean> list) {
    }

    public CMIRegion getCenter() {
        return null;
    }

    public void setCenter(CMIRegion center) {
    }

    public long getTotalChunks() {
        return 0;
    }

    public void setTotalChunks(long totalChunks) {
    }

    public void addTotalChunks(int chunks) {
    }

    public void addTotalChunks() {
    }

    public long getLastChecked() {
        return 0;
    }

    public boolean allChecked() {
        return false;
    }

    public long getLeftToScan() {
        return 0;
    }

    public long getNextPlace() {
        return 0;
    }

    public void setLastChecked(long lastChecked) {
    }

    public void addLastChecked() {
    }

    public World getWorld() {
        return null;
    }

    public void setWorld(World world) {
    }

    public Integer getRange() {
        return null;
    }

    public void setRange(Integer range) {
    }
}
