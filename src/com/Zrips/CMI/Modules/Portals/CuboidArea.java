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

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Items.CMIMaterial;

public class CuboidArea {
    private Vector p1;
    private Vector p2;
    private Vector highPoints;
    private Vector lowPoints;
    private World world;
    private String worldName = null;

    private static final int MIN_HEIGHT = 0;

    public CuboidArea(World world, Vector startLoc, Vector endLoc) {
    }

    public CuboidArea(CMILocation startLoc, CMILocation endLoc) {
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

//    public CuboidArea() {
//    }

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
	if (loc == null)
	    return false;

	if (loc.getWorld() == null)
	    return false;

	if (!loc.getWorld().equals(world))
	    return false;

	return containsLoc(loc.toVector(), 0);
    }

    public boolean containsLoc(Vector vector) {
	return containsLoc(vector, 0);
    }

    public boolean containsLoc(Location loc, int extraRange) {
	if (loc == null)
	    return false;

	if (!loc.getWorld().equals(world))
	    return false;
	return containsLoc(loc.toVector(), extraRange);
    }

    public boolean containsLoc(Vector vector, int extraRange) {
	return true;
    }

    public boolean checkCollision(CuboidArea area) {
	if (area.getWorld() == null || this.getWorld() == null)
	    return false;
	if (!area.getWorld().equals(this.getWorld())) {
	    return false;
	}

	if (!this.valid())
	    return false;

	if (area.containsLoc(lowPoints) || area.containsLoc(highPoints) || this.containsLoc(area.highPoints) || this.containsLoc(area.lowPoints)) {
	    return true;
	}
	return advCuboidCheckCollision(highPoints, lowPoints, area.highPoints, area.lowPoints);
    }

    private static boolean advCuboidCheckCollision(Vector A1High, Vector A1Low, Vector A2High, Vector A2Low) {
	
	return false;
    }

    public long getSize() {
	    return 0;
    }

    public int getXSize() {
	if (!this.valid())
	    return 0;
	return (highPoints.getBlockX() - lowPoints.getBlockX()) + 1;
    }

    public int getYSize() {
	if (!this.valid())
	    return 0;
	return (highPoints.getBlockY() - lowPoints.getBlockY()) + 1;
    }

    public int getZSize() {
	if (!this.valid())
	    return 0;
	return (highPoints.getBlockZ() - lowPoints.getBlockZ()) + 1;
    }

    @Deprecated
    public Location getHighLoc() {
	if (!this.valid())
	    return null;
	return new CMILocation(this.getWorld(), highPoints.getBlockX(), highPoints.getBlockY(), highPoints.getBlockZ());
    }

    public Vector getHighPoint() {
	return highPoints;
    }

    @Deprecated
    public Location getLowLoc() {
	if (!this.valid())
	    return null;
	return new CMILocation(this.getWorld(), lowPoints.getBlockX(), lowPoints.getBlockY(), lowPoints.getBlockZ());
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
	if (highLocation == null)
	    return;
	world = highLocation.getWorld();
	setHighPoint(highLocation.toVector());
    }

    public void setHighPoint(Vector highLocation) {
	this.p1 = highLocation;
	recheck();
    }

    public void setLowLocation(Location lowLocation) {
	if (lowLocation == null)
	    return;
	world = lowLocation.getWorld();
	setLowPoint(lowLocation.toVector());
    }

    public void setLowPoint(Vector lowPoint) {
	this.p2 = lowPoint;
	recheck();
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public void setLocation(Location location) {
	if (location == null)
	    return;
	world = location.getWorld();
	setPoint(location.toVector());
    }

    public void setPoint(Vector vector) {
	if (vector == null)
	    return;
	if (this.p1 == null)
	    this.p1 = vector;
	else
	    this.p2 = vector;
	recheck();
    }

//    public void setWorld(World world) {
//	this.world = world;
//    }

    @Deprecated
    public Location getMiddleLocation() {
	if (!this.valid())
	    return null;
	return new Location(this.world,
	    (this.getLowPoint().getX() + this.getHighPoint().getX()) / 2,
	    (this.getLowPoint().getY() + this.getHighPoint().getY()) / 2,
	    (this.getLowPoint().getZ() + this.getHighPoint().getZ()) / 2);
    }

    public Vector getMiddlePoint() {
	if (!this.valid())
	    return null;
	return new Vector(
	    (this.getLowPoint().getX() + this.getHighPoint().getX()) / 2,
	    (this.getLowPoint().getY() + this.getHighPoint().getY()) / 2,
	    (this.getLowPoint().getZ() + this.getHighPoint().getZ()) / 2);
    }

    @Override
    public String toString() {
	if (!this.valid())
	    return null;
	StringBuilder sb = new StringBuilder();
	sb.append(this.lowPoints.getX()).append(":").append(this.lowPoints.getY()).append(":").append(this.lowPoints.getZ()).append(":")
	    .append(this.highPoints.getX()).append(":").append(this.highPoints.getY()).append(":").append(this.highPoints.getZ());
	return sb.toString();
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
	    StringBuilder sb = new StringBuilder();
	    sb.append("{ x: ").append(x).append(", z: ").append(z).append(" }");
	    return sb.toString();
	}
    }

    public boolean shift(Player player, double amount) {
	return shift(getDirection(player), amount);
    }

    public boolean shift(Direction d, double amount) {
	if (!valid()) {
	    return false;
	}
	if (d == null) {
	    return false;
	}
	switch (d) {
	case DOWN:
	    double oldy = getLowPoint().getBlockY() - amount;
	    if (oldy < MIN_HEIGHT) {
		oldy = MIN_HEIGHT;
	    }
	    getLowPoint().setY(oldy);
	    getHighPoint().setY(getHighPoint().getBlockY() - amount);
	    break;
	case MINUSX:
	    getLowPoint().setX(getLowPoint().getBlockX() - amount);
	    getHighPoint().setX(getHighPoint().getBlockX() - amount);
	    break;
	case MINUSZ:
	    getLowPoint().setZ(getLowPoint().getBlockZ() - amount);
	    getHighPoint().setZ(getHighPoint().getBlockZ() - amount);
	    break;
	case PLUSX:
	    getHighPoint().setX(getHighPoint().getBlockX() + amount);
	    getLowPoint().setX(getLowPoint().getBlockX() + amount);
	    break;
	case PLUSZ:
	    getHighPoint().setZ(getHighPoint().getBlockZ() + amount);
	    getLowPoint().setZ(getLowPoint().getBlockZ() + amount);
	    break;
	case UP:
	    oldy = getHighPoint().getBlockY() + amount;
	    if (oldy > getMaxWorldHeight()) {
		oldy = getMaxWorldHeight();
	    }
	    getHighPoint().setY(oldy);
	    getLowPoint().setY(getLowPoint().getBlockY() + amount);
	    break;
	default:
	    break;
	}
	return true;
    }

    public boolean expand(Player player, double amount) {
	return expand(getDirection(player), amount);
    }

    public boolean expand(Direction d, double amount) {
	if (!valid()) {
	    return false;
	}

	if (d == null) {
	    return false;
	}

	switch (d) {
	case DOWN:
	    double oldy = getLowPoint().getBlockY() - amount;
	    if (oldy < MIN_HEIGHT) {
		oldy = MIN_HEIGHT;
	    }
	    getLowPoint().setY(oldy);
	    break;
	case MINUSX:
	    getLowPoint().setX(getLowPoint().getBlockX() - amount);
	    break;
	case MINUSZ:
	    getLowPoint().setZ(getLowPoint().getBlockZ() - amount);
	    break;
	case PLUSX:
	    getHighPoint().setX(getHighPoint().getBlockX() + amount);
	    break;
	case PLUSZ:
	    getHighPoint().setZ(getHighPoint().getBlockZ() + amount);
	    break;
	case UP:
	    oldy = getHighPoint().getBlockY() + amount;
	    if (oldy > getMaxWorldHeight()) {
		oldy = getMaxWorldHeight();
	    }
	    getHighPoint().setY(oldy);
	    break;
	default:
	    break;
	}
	return true;
    }

    public boolean contract(Player player, double amount) {
	if (!this.valid()) {
	    return false;
	}
	return contract(getDirection(player), amount);
    }

    public boolean contract(Direction d, double amount) {
	if (!this.valid()) {
	    return false;
	}
	if (d == null) {
	    return false;
	}

	switch (d) {
	case DOWN:
	    double oldy = getHighPoint().getBlockY() - amount;
	    if (oldy > getMaxWorldHeight()) {
		oldy = getMaxWorldHeight();
	    }

	    oldy = getHighPoint().getBlockY() - amount;
	    oldy = getLowPoint().getY() > oldy ? getLowPoint().getY() : oldy;

	    
	    
	    getHighPoint().setY(oldy);
	    break;
	case MINUSX:
	    double res = getHighPoint().getBlockX() - amount;
	    res = getLowPoint().getX() > res ? getLowPoint().getX() : res;
	    getHighPoint().setX(res);
	    break;
	case MINUSZ:
	    res = getHighPoint().getBlockZ() - amount;
	    res = getLowPoint().getZ() > res ? getLowPoint().getZ() : res;
	    getHighPoint().setZ(res);
	    break;
	case PLUSX:
	    res = getLowPoint().getBlockX() + amount;
	    res = getHighPoint().getX() < res ? getHighPoint().getX() : res;
	    getLowPoint().setX(res);
	    break;
	case PLUSZ:
	    res = getLowPoint().getBlockZ() + amount;
	    res = getHighPoint().getZ() < res ? getHighPoint().getZ() : res;
	    getLowPoint().setZ(res);
	    break;
	case UP:
	    oldy = getLowPoint().getBlockY() + amount;
	    if (oldy < MIN_HEIGHT) {
		oldy = MIN_HEIGHT;
	    }
	    oldy = getLowPoint().getBlockY() + amount;
	    oldy = getHighPoint().getY() < oldy ? getHighPoint().getY() : oldy;
	    getLowPoint().setY(oldy);
	    break;
	default:
	    break;
	}

	return true;
    }

    private int getMaxWorldHeight() {
	if (this.getWorld() == null)
	    return 256;
	switch (this.getWorld().getEnvironment()) {
	case NETHER:
	    return 128;
	case NORMAL:
	case THE_END:
	    return 256;
	default:
	    break;
	}

	return 256;
    }

    private static Direction getDirection(Player player) {

	int yaw = (int) player.getLocation().getYaw();

	if (yaw < 0)
	    yaw += 360;

	yaw += 45;
	yaw %= 360;

	int facing = yaw / 90;

	float pitch = player.getLocation().getPitch();
	if (pitch < -50)
	    return Direction.UP;
	if (pitch > 50)
	    return Direction.DOWN;
	if (facing == 1) // east
	    return Direction.MINUSX;
	if (facing == 3) // west
	    return Direction.PLUSX;
	if (facing == 2) // north
	    return Direction.MINUSZ;
	if (facing == 0) // south
	    return Direction.PLUSZ;
	return null;
    }

    public String getWorldName() {
	return world == null ? worldName : world.getName();
    }

    public enum Direction {
	UP, DOWN, PLUSX, PLUSZ, MINUSX, MINUSZ
    }
}
