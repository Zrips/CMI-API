package com.Zrips.CMI.Modules.Region;

import org.bukkit.Chunk;
import org.bukkit.Location;

public class CMIRegion {

    private int z = 0;
    private int x = 0;

    public CMIRegion(Location loc) {
	this.x = loc.getChunk().getX();
	this.z = loc.getChunk().getZ();
    }

    public CMIRegion(Chunk chunk) {
	this.x = chunk.getX();
	this.z = chunk.getZ();
    }

    public CMIRegion(int x, int z) {
	this.x = x;
	this.z = z;
    }

    public int getX() {
	return x;
    }

    public CMIRegion setX(int x) {
	this.x = x;
	return this;
    }

    public int getZ() {
	return z;
    }

    public CMIRegion setZ(int z) {
	this.z = z;
	return this;
    }

}
