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

//    public WorthEnchantment(Enchantment enchant) {
//	this(enchant, 1, 0D);
//    }

    public Double getSellPrice() {
	return sellPrice;
    }

    public void setSellPrice(double price) {
	this.sellPrice = price;
	if (this.sellPrice < 0D)
	    this.sellPrice = 0D;
    }

    public Double getBuyPrice() {
	return buyPrice == null ? sellPrice : buyPrice;
    }

    public boolean isBuyPriceSet() {
	return buyPrice != null;
    }

    public void setBuyPrice(Double buyPrice) {
	this.buyPrice = buyPrice;
	if (this.buyPrice != null && this.buyPrice < 0D)
	    this.buyPrice = null;
    }

    public Enchantment getEnchant() {
	return enchant;
    }

    public Integer getLevel() {
	return level;
    }
}
