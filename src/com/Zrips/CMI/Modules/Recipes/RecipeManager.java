package com.Zrips.CMI.Modules.Recipes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import com.Zrips.CMI.CMI;

public class RecipeManager {

    private CMI plugin;

    public RecipeManager(CMI plugin) {
	this.plugin = plugin;
	try {
	    loadRecipes();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    private List<Integer> GUIRecipeIngridientsSlots = new ArrayList<Integer>(Arrays.asList(11, 12, 13, 20, 21, 22, 29, 30, 31));
    private Integer GUIRecipeFurnacetSlot = 20;
    private Integer GUIRecipeResultSlot = 24;

    private List<CMIRecipe> recipes = new ArrayList<CMIRecipe>();
    private Integer lastId = 0;

    public enum CMIRecipeType {
	Shaped, Shapeless, Furnace;
	public static CMIRecipeType getByName(String name) {
	    for (CMIRecipeType one : CMIRecipeType.values()) {
		if (one.name().equalsIgnoreCase(name))
		    return one;
	    }
	    return null;
	}
    }

    public CMIRecipe getById(Integer id) {
	return null;
    }

    public boolean removeRecipe(CMIRecipe recipe) {
	return true;
    }

    public static int getIndex(LinkedHashMap<String, ItemStack> itemsused, Object value) {
	return -1;
    }

    @SuppressWarnings("deprecation")
    public Recipe MakeShapedRecipe(ItemStack result, HashMap<Integer, ItemStack> Recipe) {

	return null;
    }

    @SuppressWarnings("deprecation")
    public Recipe MakeShaplessRecipe(ItemStack result, HashMap<Integer, ItemStack> Recipe) {

	return null;
    }

    public Recipe MakeFurnaceRecipe(ItemStack result, ItemStack Recipe) {

	return null;
    }

    public Recipe createRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, ItemStack> Recipe) {

	return null;
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, ItemStack> Recipe) {

	return null;
    }

    public Recipe addRecipe(CMIRecipeType type, Recipe recipe) {

	return null;
    }

    public Recipe exist(Recipe recipe) {

	return null;
    }

    public Recipe getRecipe(HashMap<Integer, ItemStack> ingridients) {

	return null;
    }

    private void saveRecipes() {
	
    }

    private void loadRecipes() {
	
    }

    public List<Integer> getGUIRecipeIngridientsSlots() {
	return GUIRecipeIngridientsSlots;
    }

    public void setGUIRecipeIngridientsSlots(List<Integer> gUIRecipeIngridientsSlots) {
	GUIRecipeIngridientsSlots = gUIRecipeIngridientsSlots;
    }

    public Integer getGUIRecipeResultSlot() {
	return GUIRecipeResultSlot;
    }

    public void setGUIRecipeResultSlot(Integer gUIRecipeResultSlot) {
	GUIRecipeResultSlot = gUIRecipeResultSlot;
    }

    public List<CMIRecipe> getRecipes() {
	return recipes;
    }

    public void setRecipes(List<CMIRecipe> recipes) {
	this.recipes = recipes;
    }

    public Integer getLastId() {
	return lastId;
    }

    public void setLastId(Integer lastId) {
	this.lastId = lastId;
    }

    public Integer getGUIRecipeFurnacetSlot() {
	return GUIRecipeFurnacetSlot;
    }

    public void setGUIRecipeFurnacetSlot(Integer gUIRecipeFurnacetSlot) {
	GUIRecipeFurnacetSlot = gUIRecipeFurnacetSlot;
    }
}
