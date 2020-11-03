package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Modules.ShulkerBoxInventory.ShulkerInv;

public final class CMIBackpackOpenEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private ShulkerInv shulkerbackpack;
    private boolean cancelled;

    public CMIBackpackOpenEvent(ShulkerInv shulkerbackpack) {
	this.shulkerbackpack = shulkerbackpack;
    }

    public Player getPlayer() {
	return shulkerbackpack.getPlayer();
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
}