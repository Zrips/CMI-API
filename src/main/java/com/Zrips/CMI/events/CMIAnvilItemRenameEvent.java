package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

public final class CMIAnvilItemRenameEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private ItemStack itemFrom;
    private ItemStack itemTo;
    private int cost;

    public CMIAnvilItemRenameEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int cost) {
	super(player);
	this.itemFrom = itemFrom;
	this.itemTo = itemTo;
	this.cost = cost;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired on item rename in anvil")
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

    public int getCost() {
	return cost;
    }

}
