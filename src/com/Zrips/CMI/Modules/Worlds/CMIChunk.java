package com.Zrips.CMI.Modules.Worlds;

import java.awt.Color;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.World;

public class CMIChunk {
    private Integer x;
    private Integer z;
    private World world;
    private boolean generated;
    private Color color;
    private Color mostCommonColor;
    private List<CMIBiome> biomes;

    public CMIChunk(Chunk chunk) {
    }

    public CMIChunk(World world, int x, int z) {
    }

    public int getRelativeX() {
        return 0;
    }

    public int getRelativeZ() {
        return 0;
    }

    public Integer getPlace() {
        return null;
    }

    private static Integer convertBiomePlace(int x, int z) {
        return null;
    }

    public Integer getX() {
        return null;
    }

    public Integer getZ() {
        return null;
    }

    public CMIChunk recheckBiomes(Chunk chunk) {
        return null;
    }

    public CMIChunk recheckBiomes() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public ChunkSnapshot getEmptyChunkSnapshot() {
        return null;
    }

    public boolean isGenerated() {
        return false;
    }

    public CMIChunk setGenerated(boolean generated) {
        return null;
    }

    public Chunk getChunk() {
        return null;
    }

    public List<CMIBiome> getBiomes() {
        return null;
    }

    public String getBiomeColorCodes() {
        return null;
    }

    public Color getUnbluredColor() {
        return null;
    }

    private static Color blend(Color c0, Color c1) {
        return null;
    }

    public void setBiomes(List<CMIBiome> biomes) {
    }
}
