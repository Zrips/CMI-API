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
    }

    public CMIRegion(Chunk chunk) {
    }

    public CMIRegion(World world, int x, int z) {
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
	return null;
    }

    public Integer getPlace() {
	return null;
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
	return null;
    }

    public TreeMap<Integer, CMIChunk> getChunks() {
	return chunks;
    }

    public void setChunks(TreeMap<Integer, CMIChunk> chunks) {
	this.chunks = chunks;
    }

    public CMIChunk addChunk(World world, int x, int z) {
	return null;
    }

    public CMIChunk addChunk(Chunk chunk) {
	return null;
    }

    public World getWorld() {
	return world;
    }

    public void setWorld(World world) {
	this.world = world;
    }

}
