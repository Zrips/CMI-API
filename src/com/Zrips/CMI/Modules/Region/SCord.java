package com.Zrips.CMI.Modules.Region;

import org.bukkit.Chunk;
import org.bukkit.Location;

public class SCord {

    private int z = 0;
    private int x = 0;

    public SCord(Location loc) {
	this.x = loc.getChunk().getX();
	this.z = loc.getChunk().getZ();
    }

    public SCord(Chunk chunk) {
	this.x = chunk.getX();
	this.z = chunk.getZ();
    }

    public SCord(int x, int z) {
	this.x = x;
	this.z = z;
    }

    public int getX() {
	return x;
    }

    public SCord setX(int x) {
	this.x = x;
	return this;
    }

    public int getZ() {
	return z;
    }

    public SCord setZ(int z) {
	this.z = z;
	return this;
    }

}
