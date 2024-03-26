package com.Zrips.CMI.Modules.Worlds;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.ChunkSnapshot;
import org.bukkit.World;

import com.Zrips.CMI.Modules.Worlds.WorldManager.CMIBiome;

public class CMIChunk {

    private Integer x;
    private Integer z;
    private World world;
    private boolean generated = false;

    private Color color = null;
    private Color mostCommonColor = null;

    private List<CMIBiome> biomes = new ArrayList<CMIBiome>();

    public CMIChunk(Chunk chunk) {
        this(chunk.getWorld(), chunk.getX(), chunk.getZ());
        this.setGenerated(true);
        recheckBiomes(chunk);
    }

    public CMIChunk(World world, int x, int z) {
        this.x = x;
        this.z = z;
        this.world = world;
    }

    public int getRelativeX() {
        return this.x - ((this.x >> 5) * 32);
    }

    public int getRelativeZ() {
        return this.z - ((this.z >> 5) * 32);
    }

    public Integer getPlace() {
        return getRelativeX() + (getRelativeZ() * 32);
    }

    private static Integer convertBiomePlace(int x, int z) {
        return x + (z * 16);
    }

    public Integer getX() {
        return x;
    }

    public Integer getZ() {
        return z;
    }

    public CMIChunk recheckBiomes(Chunk chunk) {
        return null;
    }

    public CMIChunk recheckBiomes() {
        return null;
    }

    public World getWorld() {
        return world;
    }

    public ChunkSnapshot getEmptyChunkSnapshot() {
        return this.world.getEmptyChunkSnapshot(x, z, true, false);
    }

    public boolean isGenerated() {
        return generated;
    }

    public CMIChunk setGenerated(boolean generated) {
        this.generated = generated;
        return this;
    }

    public Chunk getChunk() {
        return this.getWorld().getChunkAt(x, z);
    }

    public CMIBiome getBiome() {
        for (CMIBiome one : biomes) {
            return one;
        }
        return CMIBiome.PLAINS;
    }

    public List<CMIBiome> getBiomes() {
        return biomes;
    }

    public String getBiomeColorCodes() {
        return null;
    }

    public Color getUnbluredColor() {
        return null;
    }

    public Color getColor() {
        return null;
    }

    public void setBiomes(List<CMIBiome> biomes) {
        this.biomes = new ArrayList<CMIBiome>(biomes);
    }

}
