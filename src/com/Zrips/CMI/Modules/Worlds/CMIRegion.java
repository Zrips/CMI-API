package com.Zrips.CMI.Modules.Worlds;

import java.util.TreeMap;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.World;

public class CMIRegion {

    private int z = 0;
    private int x = 0;
    private World world;

    private TreeMap<Integer, CMIChunk> chunks = new TreeMap<Integer, CMIChunk>();

    public CMIRegion(Location loc) {
        this(loc.getWorld(), loc.getChunk().getX() >> 5, loc.getChunk().getZ() >> 5);
    }

    public CMIRegion(Chunk chunk) {
        this(chunk.getWorld(), chunk.getX() >> 5, chunk.getZ() >> 5);
    }

    public CMIRegion(World world, int x, int z) {
        this.x = x;
        this.z = z;
        this.world = world;
    }

    public int getX() {
        return x;
    }

    public CMIRegion setX(int x) {
        this.x = x;
        return this;
    }

    public int getZ() {
        return z;
    }

    public CMIRegion setZ(int z) {
        this.z = z;
        return this;
    }

    public CMIChunk getChunk(Chunk chunk) {
        return getChunk(chunk.getX(), chunk.getZ()).setGenerated(true).recheckBiomes();
    }

    public Integer getPlace() {
        return x + (z * 1024);
    }

    public CMIChunk getRelativeChunk(int x, int z) {
        return getChunk((this.x * 32) + x, (this.z * 32) + z);
    }

    private int getChunkRelativePlace(int x, int z) {
        x = x - (this.x * 32);
        z = z - (this.z * 32);
        return x + (z * 32);
    }

    public boolean exists(int place) {
        CMIChunk c2 = chunks.get(place);
        return c2 != null;
    }

    public boolean exists(int x, int z) {
        CMIChunk c2 = chunks.get(getChunkRelativePlace(x, z));
        return c2 != null;
    }

    public CMIChunk getChunk(int x, int z) {
        CMIChunk c2 = chunks.get(getChunkRelativePlace(x, z));
        return c2;
    }

    public TreeMap<Integer, CMIChunk> getChunks() {
        return chunks;
    }

    public void setChunks(TreeMap<Integer, CMIChunk> chunks) {
        this.chunks = chunks;
    }

    public CMIChunk addChunk(World world, int x, int z) {
        CMIChunk c = new CMIChunk(world, x, z);
        chunks.put(c.getPlace(), c);
        return c;
    }

    public CMIChunk addChunk(Chunk chunk) {
        CMIChunk c = new CMIChunk(chunk);
        chunks.put(c.getPlace(), c);
        return c;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

}
