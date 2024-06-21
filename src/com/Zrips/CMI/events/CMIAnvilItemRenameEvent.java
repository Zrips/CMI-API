package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public final class CMIAnvilItemRenameEvent extends CMIPlayerCancellableEvent {

    private ItemStack itemFrom;
    private ItemStack itemTo;
    private int cost;

    public CMIAnvilItemRenameEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int cost) {
        super(player);
        this.itemFrom = itemFrom;
        this.itemTo = itemTo;
        this.cost = cost;
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
