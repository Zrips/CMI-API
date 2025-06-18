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
    private String worldName;
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
        return false;
    }

    public CuboidArea(World world) {
    }

    public boolean isAreaWithinArea(CuboidArea area) {
        return false;
    }

    public Location getOutsideFreeLoc() {
        return null;
    }

    public boolean containsLoc(Location loc) {
        return false;
    }

    public boolean containsLoc(Vector vector) {
        return false;
    }

    public boolean containsLoc(Location loc, int extraRange) {
        return false;
    }

    public boolean containsLoc(Vector vector, int extraRange) {
        return false;
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
        return 0;
    }

    @Deprecated
    public Location getHighLoc() {
        return null;
    }

    public Vector getHighPoint() {
        return null;
    }

    @Deprecated
    public Location getLowLoc() {
        return null;
    }

    public Vector getLowPoint() {
        return null;
    }

    public World getWorld() {
        return null;
    }

    public List<ChunkRef> getChunks() {
        return null;
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
    }

    public void setLowPoint(Vector lowPoint) {
    }

    public void setWorld(World world) {
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

    public boolean shift(Player player, double amount) {
        return false;
    }

    public boolean shift(Direction d, double amount) {
        return false;
    }

    public boolean expand(Player player, double amount) {
        return false;
    }

    public boolean expand(Direction d, double amount) {
        return false;
    }

    public boolean contract(Player player, double amount) {
        return false;
    }

    public boolean contract(Direction d, double amount) {
        return false;
    }

    private int getMaxWorldHeight() {
        return 0;
    }

    private static Direction getDirection(Player player) {
        return null;
    }

    public String getWorldName() {
        return null;
    }

    public static final class ChunkRef {
        private final int z = 0;
        private final int x = 0;

        public static int getChunkCoord(int val) {
            return 0;
        }

        public ChunkRef(Location loc) {
        }

        public ChunkRef(int x, int z) {
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public String toString() {
            return null;
        }
    }

    public enum Direction {
        UP, DOWN, PLUSX, PLUSZ, MINUSX, MINUSZ;
    }
}
