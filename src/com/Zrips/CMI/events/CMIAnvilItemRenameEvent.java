package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIAnvilItemRenameEvent extends CMIPlayerCancellableEvent {
    private ItemStack itemFrom;
    private ItemStack itemTo;
    private int cost;

    public CMIAnvilItemRenameEvent(Player player, ItemStack itemFrom, ItemStack itemTo, int cost) {
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

    public int getCost() {
        return 0;
    }
}
