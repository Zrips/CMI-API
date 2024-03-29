package com.Zrips.CMI.Containers;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

public class CMIHitBox {
    private Vector max;
    private Vector min;
    private Block block;
    private Entity ent;
    private World world;

    CMIHitBox(World world, Vector min, Vector max) {
        this.world = world;
        this.max = max;
        this.min = min;
    }

    public CMIHitBox(Block block) {

    }

    public CMIHitBox(Entity ent) {

    }

    public Vector getMax() {
        if (max == null)
            max = new Vector(0, 0, 0);
        return max;
    }

    public Location getCenterLocation() {
        return null;
    }

    public Double getHeightAtLocation(Location loc) {
        return null;
    }


    public Vector getMaxGlobal() {
        return null;
    }

    public Vector getMin() {
        if (min == null)
            min = new Vector(1, 1, 1);
        return min;
    }

    public double getHitBoxHeight() {
        return Math.abs(this.getMax().getY() - this.getMin().getY());
    }

    public double getHitBoxWidth() {
        return Math.abs(this.getMax().getX() - this.getMin().getX());
    }

    public double getHitBoxLength() {
        return Math.abs(this.getMax().getZ() - this.getMin().getZ());
    }

    public Vector getMinGlobal() {
        return null;
    }

    public void byExactXYZ(double x, double y, double z) {
        byExactXYZ(x, y, z, 0.2);
    }

    private static HashMap<BlockStateType, String> getBlockStates(Block block) {
        return null;
    }

    public boolean byExactXYZ(double x, double y, double z, double tolerance) {
        return false;
    }

    private boolean checkBlock(Block block, boolean resize) {
      
        return false;
    }

    public boolean isPassable() {
        return this.getMin().getBlockX() >= this.getMax().getBlockX();
    }

    public boolean isEmptySpace(Location loc) {
        Double width = this.getMaxGlobal().getX() - this.getMinGlobal().getX();
        Double height = this.getMaxGlobal().getY() - this.getMinGlobal().getY();
        Double length = this.getMaxGlobal().getZ() - this.getMinGlobal().getZ();
        Vector mn = new Vector(loc.getX() - (width / 2D), loc.getY(), loc.getZ() - (length / 2D));
        Vector mx = new Vector(loc.getX() + (width / 2D), loc.getY() + height, loc.getZ() + (length / 2D));
        return isEmptySpace(loc.getWorld(), mn, mx, true);
    }

    public boolean isEmptySpace() {
        return isEmptySpace(this.world, this.getMinGlobal(), this.getMaxGlobal(), true);
    }

    public boolean isEmptySpace(World world, Vector minimal, Vector maximum, boolean resize) {
        return getCollidingdBlock(world, minimal, maximum, resize) == null;
    }

    public Block getCollidingdBlock() {
        return getCollidingdBlock(this.world, this.getMinGlobal(), this.getMaxGlobal(), true);
    }

    public Block getCollidingdBlock(World world, Vector minimal, Vector maximum) {
        return getCollidingdBlock(world, minimal, maximum, true);
    }

    public Block getCollidingdBlock(World world, Vector minimal, Vector maximum, boolean resize) {

        return null;
    }

    public boolean collides(Entity ent) {
            return false;
    }

    public boolean canPlayerStand(Location loc) {
      

        return true;
    }

    public boolean collides(Vector position) {
        return !(position.getX() < getMinGlobal().getX() || position.getX() > getMaxGlobal().getX() ||
            position.getY() < getMinGlobal().getY() || position.getY() > getMaxGlobal().getY() ||
            position.getZ() < getMinGlobal().getZ() || position.getZ() > getMaxGlobal().getZ());
    }

    public Block getBlock() {
        return block;
    }

    public void setMax(Vector max) {
        this.max = max;
    }

    public void setMin(Vector min) {
        this.min = min;
    }

    public Entity getEntity() {
        return ent;
    }

    public void setEntity(Entity ent) {
        this.ent = ent;
    }

    public World getWorld() {
        return world;
    }
}
