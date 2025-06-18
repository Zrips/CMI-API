package com.Zrips.CMI.Modules.Region;

import org.bukkit.Chunk;
import org.bukkit.Location;

public class CMIRegion {
    private int z;
    private int x;

    public CMIRegion(Location loc) {
    }

    public CMIRegion(Chunk chunk) {
    }

    public CMIRegion(int x, int z) {
    }

    public int getX() {
        return 0;
    }

    public CMIRegion setX(int x) {
        return null;
    }

    public int getZ() {
        return 0;
    }

    public CMIRegion setZ(int z) {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
