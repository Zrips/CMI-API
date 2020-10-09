package com.Zrips.CMI.Modules.Portals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.World.Environment;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;

public class CuboidArea {
    private Vector p1;
    private Vector p2;
    private Vector highPoints;
    private Vector lowPoints;
    private World world;

    private static final int MIN_HEIGHT = 0;

    public CuboidArea(World world, Vector startLoc, Vector endLoc) {
    }

    public CuboidArea(Location startLoc, Location endLoc) {
    }

    @Override
    public CuboidArea clone() {
	return null;
    }

    private void recheck() {
    }

    public boolean valid() {
	return p1 != null && p2 != null;
    }

    public CuboidArea(World world) {
	this.world = world;
    }

    public boolean isAreaWithinArea(CuboidArea area) {
	return (this.containsLoc(area.highPoints) && this.containsLoc(area.lowPoints));
    }

    public Location getOutsideFreeLoc() {

	return null;
    }

    public boolean containsLoc(Location loc) {
	return false;
    }

    public boolean containsLoc(Vector vector) {
	return containsLoc(vector, 0);
    }

    public boolean containsLoc(Location loc, int extraRange) {
	return false;
    }

    public boolean containsLoc(Vector vector, int extraRange) {
	return true;
    }

    public boolean checkCollision(CuboidArea area) {
	return false;
    }

    private static boolean advCuboidCheckCollision(Vector A1High, Vector A1Low, Vector A2High, Vector A2Low) {

	return false;
    }

    public long getSize() {
	return 0;
    }

    public int getXSize() {
	return 0;
    }

    public int getYSize() {
	return 0;
    }

    public int getZSize() {
	if (!this.valid())
	    return 0;
	return (highPoints.getBlockZ() - lowPoints.getBlockZ()) + 1;
    }

    @Deprecated
    public Location getHighLoc() {
	return null;
    }

    public Vector getHighPoint() {
	return highPoints;
    }

    @Deprecated
    public Location getLowLoc() {
	if (!this.valid())
	    return null;
	return new Location(this.getWorld(), lowPoints.getBlockX(), lowPoints.getBlockY(), lowPoints.getBlockZ());
    }

    public Vector getLowPoint() {
	return lowPoints;
    }

    public World getWorld() {
	return this.world;
    }

    public List<ChunkRef> getChunks() {
	return getChunks(0);
    }

    public List<ChunkRef> getChunks(int range) {
	return null;
    }

    public void setArea(CuboidArea area) {
    }

    public void setHighLocation(Location highLocation) {
    }

    public void setHighPoint(Vector highLocation) {
    }

    public void setLowLocation(Location lowLocation) {
	if (lowLocation == null)
	    return;
	world = lowLocation.getWorld();
	setLowPoint(lowLocation.toVector());
    }

    public void setLowPoint(Vector lowPoint) {
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public void setLocation(Location location) {
    }

    public void setPoint(Vector vector) {
    }

    @Deprecated
    public Location getMiddleLocation() {
	return null;
    }

    public Vector getMiddlePoint() {
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
	    this.z = 0;
	    this.x = 0;
	}

	public ChunkRef(int x, int z) {
	    this.x = x;
	    this.z = z;
	}

	@Override
	public boolean equals(final Object obj) {
	    return true;
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

    public boolean shift(Player player, double amount) {
	return shift(getDirection(player), amount);
    }

    public boolean shift(Direction d, double amount) {

	return false;

    }

    public boolean expand(Player player, double amount) {
	return expand(getDirection(player), amount);
    }

    public boolean expand(Direction d, double amount) {

	return true;
    }

    public boolean contract(Player player, double amount) {
	if (!this.valid()) {
	    return false;
	}
	return contract(getDirection(player), amount);
    }

    public boolean contract(Direction d, double amount) {

	return true;
    }

    private int getMaxWorldHeight() {

	return 256;
    }

    private static Direction getDirection(Player player) {

	return null;
    }

    public enum Direction {
	UP, DOWN, PLUSX, PLUSZ, MINUSX, MINUSZ
    }
}
