package com.Zrips.CMI.Modules.Display;

import org.bukkit.Location;
import org.bukkit.entity.ItemDisplay.ItemDisplayTransform;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.CMIItemStack;

public class CMIItemDisplay extends CMIDisplay {

    private org.bukkit.entity.ItemDisplay td;

    public CMIItemDisplay(Location loc) {
        super(CMIDisplayType.Item, loc.getWorld());
    }

    public ItemStack getItemStack() {
        return td.getItemStack();
    }

    public void setItemStack(CMIItemStack item) {
        setItemStack(item.getItemStack().clone());
    }

    public void setItemStack(ItemStack item) {
        td.setItemStack(item);
    }

    public void setItemDisplayTransform(ItemDisplayTransform itemTransform) {
        this.td.setItemDisplayTransform(itemTransform);
    }

    public ItemDisplayTransform getItemDisplayTransform() {
        return this.td.getItemDisplayTransform();
    }

    public void setFacing(double pitchRadians, double yawRadians) {
    }

    public void setDepth(double depth) {
    }

    public void setScale(double s) {
    }

    public float getDisplayHeight() {
        return td.getDisplayHeight();
    }

}
