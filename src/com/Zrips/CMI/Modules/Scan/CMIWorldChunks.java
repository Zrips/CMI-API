package com.Zrips.CMI.Modules.Scan;

import java.util.BitSet;
import java.util.Map;

import javax.annotation.Nullable;

import org.bukkit.World;

import net.Zrips.CMILib.Container.CMIVectorInt2D;

public class CMIWorldChunks {
    protected World world;
    protected Map<Long, BitSet> regionChunks;
    protected long totalChunks;

    public CMIWorldChunks(World world) {
    }

    @Override
    public CMIWorldChunks clone() {
        return null;
    }

    public void setRegion(Map<Long, BitSet> regionChunks) {
    }

    public static long packRegionCoords(CMIVectorInt2D region) {
        return 0;
    }

    public static long packRegionCoords(int regionX, int regionZ) {
        return 0;
    }

    public static int getRegionX(long packed) {
        return 0;
    }

    public static int getRegionZ(long packed) {
        return 0;
    }

    public static CMIVectorInt2D getRegion(long packed) {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public void setRegionChunks(CMIVectorInt2D region, BitSet list) {
    }

    public void setRegionChunks(long region, BitSet list) {
    }

    public Map<Long, BitSet> getRegionChunks() {
        return null;
    }

    public boolean getRegionsChunk(CMIVectorInt2D region, int place) {
        return false;
    }

    public boolean getRegionsChunk(long region, int place) {
        return false;
    }

    public BitSet getRegionChunks(CMIVectorInt2D region) {
        return null;
    }

    public BitSet getRegionChunks(long region) {
        return null;
    }

    @Nullable
    public BitSet getChunks(long region) {
        return null;
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
}
