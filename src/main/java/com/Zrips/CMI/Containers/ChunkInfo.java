package com.Zrips.CMI.Containers;

import org.bukkit.World;

public class ChunkInfo {

    private int x;
    private int z;
    private World w;

    public ChunkInfo(int x, int z) {
	this.x = x;
	this.z = z;
    }

    public int getX() {
	return x;
    }

    public int getZ() {
	return z;
    }

    public World getW() {
	return w;
    }

    public void setW(World w) {
	this.w = w;
    }
}
