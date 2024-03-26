package com.Zrips.CMI.Modules.Scavenger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

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
        Integer level = this.enchants.get(enchant);
        if (level == null)
            level = 1;
        Double chance = ScavengeManager.baseEnchantFailPercentage;
        int max = enchant.getMaxLevel();
        chance += (level * ScavengeManager.levelEnchantFailPercentage) / max;
        chance = chance > ScavengeManager.levelEnchantFailMaxChance ? ScavengeManager.levelEnchantFailMaxChance : chance;
        return format(chance);
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
        return 100D;
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
        Integer level = this.enchants.get(enchant);
        if (level == null)
            level = 1;
        return createBook(enchant, level);
    }

    public ItemStack createBook(Enchantment enchant, int level) {

        return null;
    }

    public int getRecipeResultAmount() {
        return recipeResultAmount;
    }
}
