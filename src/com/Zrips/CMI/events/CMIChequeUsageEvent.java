package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public final class CMIChequeUsageEvent extends CMIPlayerCancellableEvent {

    private ItemStack cheque;
    private double price;

    public CMIChequeUsageEvent(final Player player, final ItemStack cheque, double price) {
        super(player);
        this.cheque = cheque;
        this.price = price;
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
