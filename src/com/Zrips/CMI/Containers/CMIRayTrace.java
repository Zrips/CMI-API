package com.Zrips.CMI.Containers;

import java.util.ArrayList;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class CMIRayTrace {

    Vector origin;
    Vector direction;
    World world;

    public CMIRayTrace(Player player) {
	this.origin = player.getEyeLocation().toVector();
	this.direction = player.getLocation().getDirection();
	this.world = player.getWorld();
    }

    public CMIRayTrace(World world, Vector origin, Vector direction) {
	this.origin = origin;
	this.direction = direction;
	this.world = world;
    }

    //get a point on the raytrace at X blocks away
    public Vector getPostion(double blocksAway) {
	return origin.clone().add(direction.clone().multiply(blocksAway));
    }

    public ArrayList<Vector> traverse(double blocksAway, double accuracy) {
        return null;
    }

    public ArrayList<Block> getBlocks(double blocksAway) {
	return getBlocks(blocksAway, 0.01);
    }

    public ArrayList<Block> getBlocks(double blocksAway, double accuracy) {
	
        return null;
    }

    public ArrayList<Block> getLastTwoBlocks(double blocksAway) {
	return getLastTwoBlocks(blocksAway, 0.05);
    }

    public ArrayList<Block> getLastTwoBlocks(double blocksAway, double accuracy) {
        return null;
    }
}
