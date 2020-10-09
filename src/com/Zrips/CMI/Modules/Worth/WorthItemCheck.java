package com.Zrips.CMI.Modules.Worth;

import org.bukkit.inventory.ItemStack;

public class WorthItemCheck {

    private WorthItem worth = null;
    private ItemStack item;

    public WorthItemCheck(ItemStack item) {
    }

    public Double getSellPrice(boolean includeEnchants) {
	return null;
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
