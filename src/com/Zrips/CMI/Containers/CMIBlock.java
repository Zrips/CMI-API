package com.Zrips.CMI.Containers;

import org.bukkit.block.Block;

public class CMIBlock {
    public static enum blockDirection {
	none(-1), upWest(0), upEast(1), upNorth(2), upSouth(3), downWest(4), downEast(5), downNorth(6), downSouth(7);
	private int dir;

	blockDirection(int dir) {
	    this.dir = dir;
	}

	public int getDir() {
	    return dir;
	}

	public static blockDirection getByDir(int dir) {
	    for (blockDirection one : blockDirection.values()) {
		if (one.getDir() == dir)
		    return one;
	    }
	    return null;
	}
    }

    public static enum FlipDirection {
	NORTH_SOUTH,
	WEST_EAST,
	UP_DOWN
    }

    private Block block;
    private Integer data = null;

    public CMIBlock(Block block) {
	this.block = block;
    }

    public blockDirection getDirection() {
	return blockDirection.getByDir(block.getData()) == null ? blockDirection.none : blockDirection.getByDir(block.getData());
    }

    public CMIBlock flip(FlipDirection direction) {	
	return this;
    }

    public CMIBlock rotate90() {

	return this;
    }

    public CMIBlock rotate90Reverse() {

	return this;
    }

    public byte getData() {
	return data.byteValue();
    }

    public CMIBlock setData(Integer data) {
	return this;
    }

}
