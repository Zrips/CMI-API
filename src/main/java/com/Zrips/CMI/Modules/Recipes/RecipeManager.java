package com.Zrips.CMI.Modules.Recipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;

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
    private Integer GUIRecipeSmithingSlot = 21;
    private Integer GUIRecipeResultSlot = 24;

    private List<CMIRecipe> recipes = new ArrayList<CMIRecipe>();
    private Integer lastId = 0;

    public enum CMIRecipeType {
	Shaped, Shapeless, Furnace, Blasting, Campfire, Cooking, Merchant, Smoking, Stonecutting, Smithing, Complex, Unknown;

	public static CMIRecipeType getByName(String name) {
	    return null;
	}
    }

    public CMIRecipe getById(Integer id) {
	if (id == null)
	    return null;
	for (CMIRecipe one : recipes) {
	    if (one.getIdentificator() == id)
		return one;
	}
	return null;
    }

    public boolean removeRecipe(CMIRecipe recipe) {
	recipes.remove(recipe);
	this.saveRecipes();
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
	return MakeFurnaceRecipe(result, Recipe, null);
    }

    public Recipe MakeFurnaceRecipe(ItemStack result, ItemStack Recipe, FurnaceTempData temp) {

	return null;
    }

    public Recipe createRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, ItemStack> Recipe) {
	return createRecipe(type, result, Recipe, null);
    }

    public Recipe createRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, ItemStack> Recipe, FurnaceTempData temp) {

	return null;
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, ItemStack> Recipe) {
	return addRecipe(type, result, Recipe, null);
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, ItemStack> Recipe, FurnaceTempData temp) {

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

    public List<Integer> getGUIRecipeIngridientsSlots(CMIRecipeType type) {
	return null;
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

    public List<ItemStack> getIngredientsList(Recipe recipe) {

	return null;
    }

    public Boolean openRecipeUI(Player player, CMIItemStack cm, int page) {

	return null;
    }

    public Integer getGUIRecipeSmithingSlot() {
	return GUIRecipeSmithingSlot;
    }
}
