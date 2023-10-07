package com.Zrips.CMI.Modules.Worth;

import org.bukkit.enchantments.Enchantment;

public class WorthEnchantment {

    /**
     * The sell price.
     */
    private Double sellPrice = 0D;

    /**
     * The buy price.
     */
    private Double buyPrice = null;

    /**
     * The level.
     */
    private Integer level = null;

    /**
     * The enchantment.
     */
    private Enchantment enchant;

    /**
     * Create a new worth value for the given enchantment, level, sell price
     * and buy price.
     * 
     * @param enchant   the enchantment to use.
     * @param level     the level to use.
     * @param sellPrice the sell price.
     * @param buyPrice  the buy price.
     */
    public WorthEnchantment(Enchantment enchant, int level, double sellPrice, Double buyPrice) {
        this.enchant = enchant;
        this.level = level;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    /**
     * Return the enchantment's sell price.
     * 
     * @return the sell price.
     */
    public Double getSellPrice() {
        return sellPrice;
    }

    /**
     * Set the enchantment's sell price.
     * 
     * @param price the new sell price.
     */
    public void setSellPrice(double price) {
        this.sellPrice = price;
        if (this.sellPrice < 0D)
            this.sellPrice = 0D;
    }

    /**
     * Return the enchantment's buy price.
     * 
     * @return the buy price, or the sell price if it's null.
     */
    public Double getBuyPrice() {
        return buyPrice == null ? sellPrice : buyPrice;
    }

    /**
     * Return if the enchantment's buy price has been set.
     * 
     * @return true if the buy price has been set.
     */
    public boolean isBuyPriceSet() {
        return buyPrice != null;
    }

    /**
     * Set the enchantment's buy price.
     * 
     * @param buyPrice the new buy price.
     */
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
        if (this.buyPrice != null && this.buyPrice < 0D)
            this.buyPrice = null;
    }

    /**
     * Return the enchantment.
     * 
     * @return the enchantment.
     */
    public Enchantment getEnchant() {
        return enchant;
    }

    /**
     * Return the enchantment's level.
     * 
     * @return the level.
     */
    public Integer getLevel() {
        return level;
    }
}
