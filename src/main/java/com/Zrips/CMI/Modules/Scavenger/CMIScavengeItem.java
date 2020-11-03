package com.Zrips.CMI.Modules.Scavenger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Worth.WorthEnchantment;
import com.Zrips.CMI.Modules.Worth.WorthItem;

public class CMIScavengeItem {

    private ItemStack item;
    private Player player;
    private Map<Enchantment, Integer> enchants = new HashMap<Enchantment, Integer>();
    int maxDurability = 1;
    int durability = 1;
    private int recipeResultAmount = 1;
    Recipe recipe = null;

    CMIScavengeItem(ItemStack item) {
	this(item, null);
    }

    CMIScavengeItem(ItemStack item, Player player) {
    }

    public boolean canScavenge() {
	return true;
    }

    public boolean isBlackListedItem() {
	return false;
    }

    public ItemStack getItem() {
	return item;
    }

    public Player getPlayer() {
	return player;
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public Map<Enchantment, Integer> getEnchants() {
	return enchants;
    }

    public double getEnchantExtractionFailChance(Enchantment enchant) {
	return 0;
    }

    private double format(double number) {
	return (int) (number * 100) / 100D;
    }

    public double getExtractionCost() {
	return 0D;
    }

    public double getIngredientReturnChance() {

	double chance = ScavengeManager.IngredientReturnBase;

	return format(chance);
    }

    public double getEnchantLevelLowerChance(Enchantment enchant) {
	return 0;
    }

    public double getItemBreakChance() {
	return 0;
    }

    public double getBreakChanceByItemDurability() {
	if (ScavengeManager.ItemBreakDurabilityChange > 0 && this.maxDurability != this.durability) {
	    return format(ScavengeManager.ItemBreakDurabilityChange - (Math.ceil((getLeftDurabilityPercentage() * ScavengeManager.ItemBreakDurabilityChange) / 100D)));
	}
	return 0D;
    }

    public List<ItemStack> getIngredients() {
	return getIngredients(ScavengeManager.ItemMaterialDurabilityCheck, false);
    }

    public List<ItemStack> getIngredients(boolean checkDurability) {
	return getIngredients(checkDurability, false);
    }

    public List<ItemStack> getIngredients(boolean checkDurability, boolean considerEndResultAmount) {

	return null;
    }

    public double getLeftDurabilityPercentage() {
	return format(durability * 100 / maxDurability);
    }

    public List<ItemStack> enchantsToBooks() {

	return null;
    }

    public ItemStack createBook(Enchantment enchant) {

	return null;
    }

    public ItemStack createBook(Enchantment enchant, int level) {

	return null;
    }

    public int getRecipeResultAmount() {
	return recipeResultAmount;
    }
}
