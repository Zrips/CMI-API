package com.Zrips.CMI.Modules.Worth;

import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class WorthItemCheck {

    private WorthItem worth = null;
    private ItemStack item;

    public WorthItemCheck(ItemStack item) {
        this.item = item.clone();
        worth = CMI.getInstance().getWorthManager().getWorth(item);
    }

    public Double getSellPrice() {
        return getSellPrice(true);
    }

    public Double getSellPrice(boolean includeEnchants) {
        return getSellPrice(includeEnchants, true);
    }

    public Double getSellPrice(boolean includeEnchants, boolean includeDurability) {

        if (item == null)
            return worth.getSellPrice();
        return worth.getPlayerSellPrice(item, includeEnchants, includeDurability);
    }

    public Double getEnchantSellPrice() {

        return null;
    }

    public ItemStack getItem() {
        return item;
    }

    public Double getBuyPrice() {
        return worth.getBuyPrice();
    }

    public boolean isBuyPriceSet() {
        return worth.getBuyPrice() != null;
    }

    public WorthItem getWorth() {
        return worth;
    }

    public void setWorth(WorthItem worth) {
        this.worth = worth;
    }

}
