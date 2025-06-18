package com.Zrips.CMI.Modules.Worth;

import java.util.Set;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

public class WorthItem {
    private Material material;
    private Integer data;
    private Double sellPrice;
    private Double buyPrice;
    private ItemStack item;
    private Recipe recipe;
    private Recipe exploitRecipe;
    private Set<Recipe> recipesFor;
    private Set<Recipe> recipesFrom;
    private Integer modelData;

    @Deprecated
    public WorthItem(ItemStack item, Integer data, double price) {
    }

    public WorthItem(ItemStack item, double price) {
    }

    public WorthItem(ItemStack item) {
    }

    public Integer getData() {
        return null;
    }

    public void setData(Integer data) {
    }

    public Double getSellPrice() {
        return null;
    }

    public Double getPlayerSellPrice(ItemStack item, boolean includeEnchants, boolean includeDurability) {
        return null;
    }

    public static double getEnchantSellPrice(ItemStack item) {
        return 0.0;
    }

    public void setSellPrice(double price) {
    }

    public ItemStack getItem() {
        return null;
    }

    public void setItem(ItemStack item) {
    }

    public Double getBuyPrice() {
        return null;
    }

    public boolean isBuyPriceSet() {
        return false;
    }

    public void setBuyPrice(Double buyPrice) {
    }

    public Recipe getExploitRecipe() {
        return null;
    }

    public Recipe updateExploitRecipe() {
        return null;
    }

    public void resetRecipes() {
    }

    public void setExploitRecipe(Recipe exploitRecipe) {
    }

    public void updateRecipes() {
    }

    public Recipe getRecipe() {
        return null;
    }

    public void setRecipe(Recipe recipe) {
    }

    public void setModelData(Integer modelData) {
    }

    public Integer getModelData() {
        return null;
    }
}
