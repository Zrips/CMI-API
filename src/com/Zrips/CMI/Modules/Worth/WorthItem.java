package com.Zrips.CMI.Modules.Worth;

import java.util.Map.Entry;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import com.Zrips.CMI.CMI;

public class WorthItem {

    private Material material;
    private Integer data = null;
    private Double sellPrice = 0D;
    private Double buyPrice = null;
    private ItemStack item;
    private Recipe recipe = null;
    private Recipe exploitRecipe = null;
    private Set<Recipe> recipesFor;
    private Set<Recipe> recipesFrom;
    private Integer modelData;

    @Deprecated
    public WorthItem(ItemStack item, Integer data, double price) {
        this.item = item;
        material = item.getType();
        this.data = data;
        this.sellPrice = price;
    }

    public WorthItem(ItemStack item, double price) {
        this.item = item;
        material = item.getType();
        this.sellPrice = price;
    }

    public WorthItem(ItemStack item) {
        this(item, 0D);
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public Double getPlayerSellPrice(ItemStack item, boolean includeEnchants, boolean includeDurability) {
        double sell = sellPrice;
        if (includeDurability) {
            sell = CMI.getInstance().getWorthManager().getWorthByDurability(item, sell);
        }

        if (includeEnchants)
            sell += WorthItem.getEnchantSellPrice(item);

        return sell;
    }

    public static double getEnchantSellPrice(ItemStack item) {

        if (item == null)
            return 0D;

        Double extra = 0D;
        for (Entry<Enchantment, Integer> one : item.getEnchantments().entrySet()) {
            if (one == null)
                continue;
            extra += CMI.getInstance().getWorthManager().getEnchantSellPrice(one.getKey(), one.getValue());
        }
        return extra;
    }

    public void setSellPrice(double price) {

        this.sellPrice = Math.round(price * 100) / 100D;

        if (this.sellPrice < 0D)
            this.sellPrice = 0D;
    }

    public ItemStack getItem() {
//	if (item == null)
//	    item = CMIMaterial.get(material).newItemStack();
        return item;
    }

    public void setItem(ItemStack item) {
        if (this.item == null)
            this.item = item.clone();
    }

    public Double getBuyPrice() {
        return buyPrice == null ? sellPrice : buyPrice;
    }

    public boolean isBuyPriceSet() {
        return buyPrice != null;
    }

    public void setBuyPrice(Double buyPrice) {

        this.buyPrice = buyPrice == null ? null : Math.round(buyPrice * 100) / 100D;

        if (this.buyPrice != null && this.buyPrice < 0D)
            this.buyPrice = null;
    }

    public Recipe getExploitRecipe() {
        return exploitRecipe;
    }

    public Recipe updateExploitRecipe() {

        return null;
    }

    public void resetRecipes() {
        this.exploitRecipe = null;
        this.recipe = null;

        this.recipesFor = null;
        this.recipesFrom = null;
    }

    public void setExploitRecipe(Recipe exploitRecipe) {
        this.exploitRecipe = exploitRecipe;
    }

    public void updateRecipes() {

    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setModelData(Integer modelData) {
        this.modelData = modelData;
    }

    public Integer getModelData() {
        return modelData;
    }
}
