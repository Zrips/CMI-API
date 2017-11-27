package com.Zrips.CMI.Modules.Portals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.block.Block;

public class CuboidArea {
    private Location highPoints;
    private Location lowPoints;
    private World world;

    public CuboidArea(Location startLoc, Location endLoc) {
    }

    public CuboidArea() {
    }

    public boolean isAreaWithinArea(CuboidArea area) {
	return (this.containsLoc(area.highPoints) && this.containsLoc(area.lowPoints));
    }

    public Location getOutsideFreeLoc() {


	return null;
    }

    public boolean containsLoc(Location loc) {
	return true;
    }

    public boolean containsLoc(Location loc, int extraRange) {
	

	return true;
    }

    public boolean checkCollision(CuboidArea area) {
	    return true;
    }

    private static boolean advCuboidCheckCollision(Location A1High, Location A1Low, Location A2High, Location A2Low) {
	return false;
    }

    public long getSize() {
	int xsize = (highPoints.getBlockX() - lowPoints.getBlockX()) + 1;
	int zsize = (highPoints.getBlockZ() - lowPoints.getBlockZ()) + 1;
	int ysize = (highPoints.getBlockY() - lowPoints.getBlockY()) + 1;
	return xsize * ysize * zsize;
    }

    public int getXSize() {
	return (highPoints.getBlockX() - lowPoints.getBlockX()) + 1;
    }

    public int getYSize() {
	return (highPoints.getBlockY() - lowPoints.getBlockY()) + 1;
    }

    public int getZSize() {
	return (highPoints.getBlockZ() - lowPoints.getBlockZ()) + 1;
    }

    public Location getHighLoc() {
	return highPoints;
    }

    public Location getLowLoc() {
	return lowPoints;
    }

    public World getWorld() {
	return highPoints.getWorld();
    }

    public List<ChunkRef> getChunks() {
	List<ChunkRef> chunks = new ArrayList<>();
	return chunks;
    }

    public List<ChunkRef> getChunks(int range) {
	List<ChunkRef> chunks = new ArrayList<>();
	return chunks;
    }

    public void setHighLocation(Location highLocation) {
	this.highPoints = highLocation;
    }

    public void setLowLocation(Location lowLocation) {
	this.lowPoints = lowLocation;
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public Location getMiddlePoint() {
	return null;
    }

    @Override
    public String toString() {
	return null;
    }

    public static final class ChunkRef {

	public static int getChunkCoord(final int val) {
	    return val >> 4;
	}

	private final int z;
	private final int x;

	public ChunkRef(Location loc) {
	    this.x = getChunkCoord(loc.getBlockX());
	    this.z = getChunkCoord(loc.getBlockZ());
	}

	public ChunkRef(int x, int z) {
	    this.x = x;
	    this.z = z;
	}

	@Override
	public boolean equals(final Object obj) {
	    if (this == obj) {
		return true;
	    }
	    if (obj == null) {
		return false;
	    }
	    if (getClass() != obj.getClass()) {
		return false;
	    }
	    ChunkRef other = (ChunkRef) obj;
	    return this.x == other.x && this.z == other.z;
	}

	@Override
	public int hashCode() {
	    return x ^ z;
	}

	@Override
	public String toString() {
		return null;
	}
    }
}
