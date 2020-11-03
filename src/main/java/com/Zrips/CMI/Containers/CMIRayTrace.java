package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;

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
	return null;
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
