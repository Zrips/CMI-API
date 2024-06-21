package com.Zrips.CMI.events;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerInv;

public final class CMIBackpackOpenEvent extends CMIPlayerCancellableEvent {

    private ShulkerInv shulkerbackpack;
    private double costToOpen = 0D;

    public CMIBackpackOpenEvent(ShulkerInv shulkerbackpack) {
        super(shulkerbackpack.getPlayer());
        this.shulkerbackpack = shulkerbackpack;
    }

    public CMIBackpackOpenEvent(ShulkerInv shulkerbackpack, double costToOpen) {
        super(shulkerbackpack.getPlayer());
        this.shulkerbackpack = shulkerbackpack;
        this.costToOpen = costToOpen;
    }

    public ItemStack getShulkerBox() {
        return shulkerbackpack.getShulkerBox();
    }

    public Inventory getGuiInv() {
        return shulkerbackpack.getCustomInv();
    }

    public ShulkerInv getShulkerbackpack() {
        return shulkerbackpack;
    }

    public double getCostToOpen() {
        return costToOpen;
    }

    public void setCostToOpen(double costToOpen) {
        this.costToOpen = costToOpen;
    }
}