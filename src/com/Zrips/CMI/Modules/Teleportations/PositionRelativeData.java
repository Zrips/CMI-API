package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;

import net.Zrips.CMILib.Container.CMIWorld;

public class PositionRelativeData {

    private int localX = 0;
    private int localZ = 0;

    private int maxWorldY = 0;
    private int minWorldY = 0;

    public PositionRelativeData(Location loc) {
        localX = loc.getBlockX() & 0xF;
        localZ = loc.getBlockZ() & 0xF;
        maxWorldY = CMIWorld.getMaxHeight(loc.getWorld());
        minWorldY = CMIWorld.getMinHeight(loc.getWorld());
    }

    public int getLocalX() {
        return localX;
    }

    public int getLocalZ() {
        return localZ;
    }

    public int getMaxWorldY() {
        return maxWorldY;
    }

    public int getMinWorldY() {
        return minWorldY;
    }
}
