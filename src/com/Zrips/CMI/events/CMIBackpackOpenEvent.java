package com.Zrips.CMI.events;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerInv;

public class CMIBackpackOpenEvent extends CMIPlayerCancellableEvent {
    private ShulkerInv shulkerbackpack;
    private double costToOpen;

    public CMIBackpackOpenEvent(ShulkerInv shulkerbackpack) {
        super(shulkerbackpack.getPlayer());
    }

    public CMIBackpackOpenEvent(ShulkerInv shulkerbackpack, double costToOpen) {
        super(shulkerbackpack.getPlayer());
    }

    public ItemStack getShulkerBox() {
        return null;
    }

    public Inventory getGuiInv() {
        return null;
    }

    public ShulkerInv getShulkerbackpack() {
        return null;
    }

    public double getCostToOpen() {
        return 0.0;
    }

    public void setCostToOpen(double costToOpen) {
    }
}
