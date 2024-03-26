package com.Zrips.CMI.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerInv;

public final class CMIBackpackOpenEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private ShulkerInv shulkerbackpack;
    private boolean cancelled;
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

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        cancelled = cancel;
    }

    @Override
    @EventAnnotation(info = "Fired when opens shulker backpack")
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
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