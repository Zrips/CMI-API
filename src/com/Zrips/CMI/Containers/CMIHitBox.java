package com.Zrips.CMI.Containers;

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
    }

    public CMIHitBox(Block block) {

    }

    public CMIHitBox(Entity ent) {
    }

    public Vector getMax() {
	return null;
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
	return null;
    }

    public double getHitBoxHeight() {
	return this.getMax().getY() - this.getMin().getY();
    }

    public Vector getMinGlobal() {
	return null;
    }

    public void byExactXYZ(double x, double y, double z) {
	byExactXYZ(x, y, z, 0.2);
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
	return false;
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
	return true;
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
