package com.Zrips.CMI.Modules.Worth;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Items.CMIMaterial;
import net.Zrips.CMILib.Logs.CMIDebug;

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
//    public Material getMaterial() {
//	return material;
//    }
//
//    public void setMaterial(Material material) {
//	this.material = material;
//    }

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
	return null;
    }

    public static double getEnchantSellPrice(ItemStack item) {
	    return 0D;
    }

    public void setSellPrice(double price) {
    }

    public ItemStack getItem() {
	return null;
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
}
