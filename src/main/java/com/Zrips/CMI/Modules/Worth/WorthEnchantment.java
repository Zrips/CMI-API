package com.Zrips.CMI.Modules.Worth;

import org.bukkit.enchantments.Enchantment;

public class WorthEnchantment {

    private Double sellPrice = 0D;
    private Double buyPrice = null;
    private Integer level = null;
    private Enchantment enchant;

    public WorthEnchantment(Enchantment enchant, int level, double sellPrice, Double buyPrice) {
	this.enchant = enchant;
	this.level = level;
	this.sellPrice = sellPrice;
	this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
	return null;
    }

    public void setSellPrice(double price) {
    }

    public Double getBuyPrice() {
	return null;
    }

    public boolean isBuyPriceSet() {
	return buyPrice != null;
    }

    public void setBuyPrice(Double buyPrice) {
    }

    public Enchantment getEnchant() {
	return enchant;
    }

    public Integer getLevel() {
	return level;
    }
}
