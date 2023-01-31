package com.Zrips.CMI.Modules.Portals;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Container.CMILocation;

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
        if (!this.valid())
            return 0;
        int xsize = (highPoints.getBlockX() - lowPoints.getBlockX()) + 1;
        int zsize = (highPoints.getBlockZ() - lowPoints.getBlockZ()) + 1;
        int ysize = (highPoints.getBlockY() - lowPoints.getBlockY()) + 1;
        return xsize * ysize * zsize;
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

        return true;
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

        return null;
    }

    public String getWorldName() {
        return world == null ? worldName : world.getName();
    }

    public enum Direction {
        UP, DOWN, PLUSX, PLUSZ, MINUSX, MINUSZ
    }
}
