package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIChequeUsageEvent extends CMIPlayerCancellableEvent {
    private ItemStack cheque;
    private double price;

    public CMIChequeUsageEvent(Player player, ItemStack cheque, double price) {
        super(player);
    }

    public double getPrice() {
        return 0.0;
    }

    public void setPrice(double price) {
    }

    public ItemStack getCheque() {
        return null;
    }

    public void setCheque(ItemStack cheque) {
    }
}
