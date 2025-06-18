package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIAnvilItemRepairEvent extends CMIPlayerCancellableEvent {
    private ItemStack itemFrom;
    private ItemStack itemTo;
    private int repairCost;

    public CMIAnvilItemRepairEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int repairCost) {
        super(player);
    }

    public ItemStack getItemFrom() {
        return null;
    }

    public ItemStack getItemTo() {
        return null;
    }

    public void setItemTo(ItemStack itemTo) {
    }

    public int getRepairCost() {
        return 0;
    }
}
