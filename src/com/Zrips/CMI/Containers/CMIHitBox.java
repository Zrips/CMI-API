package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.bukkit.ChunkSnapshot;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.util.Vector;

import net.Zrips.CMILib.Items.CMIMaterial;

public class CMIHitBox {
    private Vector max;
    private Vector min;
    private Block block;
    private Entity ent;
    private World world;
    private ChunkSnapshot snapshot;
    static Method getBlockTypeId;

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
        return 0.0;
    }

    public double getHitBoxWidth() {
        return 0.0;
    }

    public double getHitBoxLength() {
        return 0.0;
    }

    public Vector getMinGlobal() {
        return null;
    }

    public void byExactXYZ(double x, double y, double z) {
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
        return false;
    }

    public boolean isEmptySpace(Location loc) {
        return false;
    }

    public boolean isEmptySpace() {
        return false;
    }

    public boolean isEmptySpace(World world, Vector minimal, Vector maximum, boolean resize) {
        return false;
    }

    public Block getCollidingdBlock() {
        return null;
    }

    public Block getCollidingdBlock(World world, Vector minimal, Vector maximum) {
        return null;
    }

    public Block getCollidingdBlock(World world, Vector minimal, Vector maximum, boolean resize) {
        return null;
    }

    public boolean collides(Entity ent) {
        return false;
    }

    public boolean canPlayerStand(Location loc) {
        return false;
    }

    private CMIMaterial getBlockType(int x, int y, int z) {
        return null;
    }

    public boolean collides(Vector position) {
        return false;
    }

    public Block getBlock() {
        return null;
    }

    public void setMax(Vector max) {
    }

    public void setMin(Vector min) {
    }

    public Entity getEntity() {
        return null;
    }

    public void setEntity(Entity ent) {
    }

    public World getWorld() {
        return null;
    }

    public ChunkSnapshot getSnapshot() {
        return null;
    }

    public void setSnapshot(ChunkSnapshot snapshot) {
    }
}
