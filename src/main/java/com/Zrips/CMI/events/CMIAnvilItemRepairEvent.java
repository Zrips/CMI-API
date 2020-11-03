package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

public final class CMIAnvilItemRepairEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private ItemStack itemFrom;
    private ItemStack itemTo;
    private int repairCost;

    public CMIAnvilItemRepairEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int repairCost) {
	super(player);
	this.itemFrom = itemFrom;
	this.itemTo = itemTo;
	this.repairCost = repairCost;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired on item repair action with anvil")
    public final HandlerList getHandlers() {
	return handlers;
    }

    @Override
    public final void setCancelled(final boolean cancel) {
	this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
	return cancel;
    }

    public ItemStack getItemFrom() {
	return itemFrom;
    }

    public ItemStack getItemTo() {
	return itemTo;
    }

    public void setItemTo(ItemStack itemTo) {
	this.itemTo = itemTo;
    }

    public int getRepairCost() {
	return repairCost;
    }
}
