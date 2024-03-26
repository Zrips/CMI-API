package com.Zrips.CMI.Modules.Region;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Chunk;
import org.bukkit.World;

import com.Zrips.CMI.CMI;

public class WorldInfo {

    private transient Map<String, List<Boolean>> regionChunks = Collections.synchronizedMap(new HashMap<String, List<Boolean>>());
    private CMIRegion center;
    private long totalChunks = 0;
    private long lastChecked = -1;
    private World world;
    private Integer range = null;

    @Override
    public WorldInfo clone() {
        WorldInfo wi = new WorldInfo(world, center);
        wi.setRegion(new HashMap<String, List<Boolean>>(regionChunks));
        wi.setTotalChunks(totalChunks);
        return wi;
    }

    public WorldInfo(World world, CMIRegion center) {
        this.world = world;
        this.center = center;
    }

    public void setRegion(Map<String, List<Boolean>> regionChunks) {
        this.regionChunks = regionChunks;
    }

    public Map<String, List<Boolean>> getRegion() {
        return regionChunks;
    }

    private static String toString(CMIRegion cord) {
        return cord.getX() + ":" + cord.getZ();
    }

    public Boolean getRegionsChunk(CMIRegion region, int place) {
        return null;
    }

    public List<Boolean> getRegionPlaces(CMIRegion region) {
        return null;
    }

    public WorldInfo setRegionPlaces(CMIRegion region, List<Boolean> places) {
        regionChunks.put(toString(region), places);
        return this;
    }

    public CMIRegion getNextChunkLoc(boolean exist) {
        return CMI.getInstance().getRegionManager().getNextChunkLocation(this, exist);
    }

    public Chunk getNextChunk(boolean exist) {
        return CMI.getInstance().getRegionManager().getNextChunk(this, exist);
    }

    public void setRegionChunks(CMIRegion scord, List<Boolean> list) {
        this.regionChunks.put(toString(scord), list);
    }

    public CMIRegion getCenter() {
        if (center == null)
            center = new CMIRegion(0, 0);
        return center;
    }

    public void setCenter(CMIRegion center) {
        this.center = center;
    }

    public long getTotalChunks() {
        return totalChunks;
    }

    public void setTotalChunks(long totalChunks) {
        this.totalChunks = totalChunks;
    }

    public void addTotalChunks(int chunks) {
        this.totalChunks += chunks;
    }

    public void addTotalChunks() {
        this.totalChunks++;
    }

    public long getLastChecked() {
        return lastChecked;
    }

    public boolean allChecked() {
        return lastChecked >= totalChunks;
    }

    public long getLeftToScan() {
        return totalChunks - lastChecked < 0L ? 0L : totalChunks - lastChecked;
    }

    public long getNextPlace() {
        return lastChecked + 1;
    }

    public void setLastChecked(long lastChecked) {
        this.lastChecked = lastChecked;
    }

    public void addLastChecked() {
        this.lastChecked++;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
}
