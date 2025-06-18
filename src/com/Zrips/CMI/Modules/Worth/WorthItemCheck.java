package com.Zrips.CMI.Modules.Worth;

import org.bukkit.inventory.ItemStack;

public class WorthItemCheck {
    private WorthItem worth;
    private ItemStack item;

    public WorthItemCheck(ItemStack item) {
    }

    public Double getSellPrice() {
        return null;
    }

    public Double getSellPrice(boolean includeEnchants) {
        return null;
    }

    public Double getSellPrice(boolean includeEnchants, boolean includeDurability) {
        return null;
    }

    public Double getEnchantSellPrice() {
        return null;
    }

    public ItemStack getItem() {
        return null;
    }

    public Double getBuyPrice() {
        return null;
    }

    public boolean isBuyPriceSet() {
        return false;
    }

    public WorthItem getWorth() {
        return null;
    }

    public void setWorth(WorthItem worth) {
    }
}
