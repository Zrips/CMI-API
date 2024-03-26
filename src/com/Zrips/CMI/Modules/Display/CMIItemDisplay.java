package com.Zrips.CMI.Modules.Display;

import org.bukkit.Location;
import org.bukkit.entity.ItemDisplay.ItemDisplayTransform;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Version.Version;
import net.Zrips.CMILib.Version.Schedulers.CMIScheduler;

public class CMIItemDisplay extends CMIDisplay {

    private org.bukkit.entity.ItemDisplay td;

    public CMIItemDisplay(Location loc) {
        super(CMIDisplayType.Item, loc);
    }

    public ItemStack getItemStack() {
        return td.getItemStack();
    }

    public void setItemStack(CMIItemStack item) {
        setItemStack(item.getItemStack().clone());
    }

    public void setItemStack(ItemStack item) {
        if (Version.isFolia()) {
            CMIScheduler.runAtLocation(getLocation(), () -> td.setItemStack(item));
        } else
            td.setItemStack(item);
    }

    public void setItemDisplayTransform(ItemDisplayTransform itemTransform) {
        if (Version.isFolia()) {
            CMIScheduler.runAtLocation(getLocation(), () -> td.setItemDisplayTransform(itemTransform));
        } else
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
