package com.Zrips.CMI.Modules.Display;

import org.bukkit.Location;
import org.bukkit.entity.ItemDisplay.ItemDisplayTransform;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.CMIItemStack;

public class CMIItemDisplay extends CMIDisplay {
    private org.bukkit.entity.ItemDisplay td;

    public CMIItemDisplay(Location loc) {
        super(CMIDisplayType.Item, loc);
    }

    public ItemStack getItemStack() {
        return null;
    }

    public void setItemStack(CMIItemStack item) {
    }

    public void setItemStack(ItemStack item) {
    }

    public void setItemDisplayTransform(ItemDisplayTransform itemTransform) {
    }

    public ItemDisplayTransform getItemDisplayTransform() {
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
