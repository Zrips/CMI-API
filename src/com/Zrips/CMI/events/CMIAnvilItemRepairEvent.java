package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public final class CMIAnvilItemRepairEvent extends CMIPlayerCancellableEvent {

    private ItemStack itemFrom;
    private ItemStack itemTo;
    private int repairCost;

    public CMIAnvilItemRepairEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int repairCost) {
        super(player);
        this.itemFrom = itemFrom;
        this.itemTo = itemTo;
        this.repairCost = repairCost;
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
