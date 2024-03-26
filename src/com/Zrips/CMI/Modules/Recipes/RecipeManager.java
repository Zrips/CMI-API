package com.Zrips.CMI.Modules.Recipes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Recipes.CMIRecipe;
import net.Zrips.CMILib.Recipes.CMIRecipeCraftData;
import net.Zrips.CMILib.Recipes.CMIRecipeIngredient;
import net.Zrips.CMILib.Recipes.CMIRecipeType;

public class RecipeManager {

    private CMI plugin;

    public RecipeManager(CMI plugin) {
        this.plugin = plugin;
    }

    private boolean RecipesRequireBackwards;
    private boolean Recipes4Sized;

    public void loadConfig() {
    }

    private HashMap<String, Recipe> disabledRecipes = new HashMap<String, Recipe>();

    private Integer GUIRecipeResultSlot = 24;

    private List<CMIRecipe> recipes = new ArrayList<CMIRecipe>();

    public CMIRecipe getById(String id) {
        return null;
    }

    public boolean removeRecipe(CMIRecipe recipe) {
        recipes.remove(recipe);
        this.saveRecipes();
        return true;
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe) {
        return addRecipe(type, result, Recipe, null);
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe, CMIRecipeCraftData temp) {
        return addRecipe(type, result, Recipe, temp, null);
    }

    public Recipe addRecipe(CMIRecipeType type, ItemStack result, HashMap<Integer, CMIRecipeIngredient> Recipe, CMIRecipeCraftData temp, String customKey) {
        Recipe recipe = CMIRecipe.createRecipe(type, result, Recipe, temp, customKey);
        if (recipe == null)
            return null;
        addRecipe(type, recipe, temp);
        return recipe;
    }

    @Deprecated
    public Recipe addRecipe(CMIRecipeType type, Recipe recipe) {
        return addRecipe(type, recipe, null);
    }

    public Recipe addRecipe(CMIRecipeType type, Recipe recipe, CMIRecipeCraftData data) {
        return addRecipe(type, recipe, data, null);
    }

    public Recipe addRecipe(CMIRecipeType type, Recipe recipe, CMIRecipeCraftData data, String customKey) {

        return null;
    }

    public Recipe exist(Recipe recipe) {

        return null;
    }

    public Recipe getRecipe(HashMap<Integer, ItemStack> ingredients) {

        return null;
    }

    private void saveRecipes() {

    }

    private String fileName = "Recipes.yml";

    public void load() {

    }

    public Integer getGUIRecipeResultSlot() {
        return GUIRecipeResultSlot;
    }

    public List<CMIRecipe> getRecipes() {
        return recipes;
    }

    @Deprecated
    public void setRecipes(List<CMIRecipe> recipes) {
        this.recipes = recipes;
    }

    public Boolean openRecipeUI(Player player, CMIItemStack cm, int page) {
        return openRecipeUI(player, cm, page, false);
    }

    public Boolean openRecipeUI(Player player, CMIItemStack cm, int page, boolean onlyCustom) {

        return null;
    }

    public Boolean openRecipeUI(Player player, CMIItemStack cm, int page, List<Recipe> recipes) {

        return null;
    }

    private Set<Recipe> getDisabled(ItemStack item) {

        return null;
    }

    public boolean isRecipesRequireBackwards() {
        return RecipesRequireBackwards;
    }

    public boolean isRecipes4Sized() {
        return Recipes4Sized;
    }
}
