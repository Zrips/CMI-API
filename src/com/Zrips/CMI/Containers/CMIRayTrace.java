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
    }

    public CMIRayTrace(World world, Vector origin, Vector direction) {
    }

    public Vector getPostion(double blocksAway) {
        return null;
    }

    public ArrayList<Vector> traverse(double blocksAway, double accuracy) {
        return null;
    }

    public ArrayList<Block> getBlocks(double blocksAway) {
        return null;
    }

    public ArrayList<Block> getBlocks(double blocksAway, double accuracy) {
        return null;
    }

    public ArrayList<Block> getLastTwoBlocks(double blocksAway) {
        return null;
    }

    public ArrayList<Block> getLastTwoBlocks(double blocksAway, double accuracy) {
        return null;
    }
}
