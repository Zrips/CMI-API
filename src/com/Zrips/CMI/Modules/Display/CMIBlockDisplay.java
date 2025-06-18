package com.Zrips.CMI.Modules.Display;

import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.util.Transformation;

public class CMIBlockDisplay extends CMIDisplay {
    private org.bukkit.entity.BlockDisplay td;

    public CMIBlockDisplay(Location loc) {
        super(CMIDisplayType.Block, loc);
    }

    public BlockData getBlockData() {
        return null;
    }

    public void setBlockData(BlockData data) {
    }

    public void setItemDisplayTransform(Transformation itemTransform) {
    }

    public Transformation getBlockTransform() {
        return null;
    }

    public void setFacing(double pitchRadians, double yawRadians) {
    }

    public void setDepth(double depth) {
    }

    public void setScale(double s) {
    }

    public float getDisplayHeight() {
        return 0.0f;
    }
}
