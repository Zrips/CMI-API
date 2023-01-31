package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

public final class CMIChequeUsageEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private ItemStack cheque;
    private double price;

    public CMIChequeUsageEvent(final Player player, final ItemStack cheque, double price) {
        super(player);
        this.cheque = cheque;
        this.price = price;
    }

    public final static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired on cheque usage")
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemStack getCheque() {
        return cheque;
    }

    public void setCheque(ItemStack cheque) {
        this.cheque = cheque;
    }

}
