package com.Zrips.CMI.Modules.Scan;

import org.bukkit.Chunk;
import org.bukkit.World;

import net.Zrips.CMILib.Container.CMIVectorInt2D;

public class CMIWorldChunksRanged extends CMIWorldChunks {
    private CMIVectorInt2D center;
    private long lastChecked;
    private int range;

    public CMIWorldChunksRanged(World world, CMIVectorInt2D center, int range) {
        super(world);
    }

    public int getRange() {
        return 0;
    }

    public void setRange(int range) {
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

    public CMIVectorInt2D getCenter() {
        return null;
    }

    public void setCenter(CMIVectorInt2D center) {
    }

    public CMIVectorInt2D getNextInSpiral(long place) {
        return null;
    }

    public CMIVectorInt2D getNextChunkLocation(boolean existing) {
        return null;
    }

    protected static CMIVectorInt2D getRegionCord(CMIVectorInt2D scord) {
        return null;
    }

    public static CMIVectorInt2D getRegionCord(Chunk chunk) {
        return null;
    }

    public static CMIVectorInt2D getRegionCord(int x, int z) {
        return null;
    }

    public static CMIVectorInt2D getRealChunkFromPlace(CMIVectorInt2D region, int place) {
        return null;
    }

    protected static CMIVectorInt2D getCordFromPlace(int place) {
        return null;
    }

    protected static int coordToChunkPlace(int x, int z) {
        return 0;
    }

    public static int chunkCoordToPlace(Chunk chunk) {
        return 0;
    }

    public static CMIVectorInt2D chunkPlaceToCoords(int index) {
        return null;
    }
}
