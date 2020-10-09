package com.Zrips.CMI.Modules.Recipes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import com.Zrips.CMI.Modules.Recipes.RecipeManager.CMIRecipeType;

public class CMIRecipe {

    private Recipe recipe = null;
    private Integer identificator = null;
    private CMIRecipeType type = null;

    public CMIRecipe(Integer identificator, CMIRecipeType type) {
	this.identificator = identificator;
	this.type = type;
    }

    public Integer getIdentificator() {
	return identificator;
    }

    public CMIRecipe setIdentificator(Integer identificator) {
	this.identificator = identificator;
	return this;
    }

    public Recipe getRecipe() {
	return recipe;
    }

    public CMIRecipe setRecipe(Recipe recipe) {
	this.recipe = recipe;
	return this;
    }

    public CMIRecipeType getType() {
	return type;
    }

    public CMIRecipe setType(CMIRecipeType type) {
	this.type = type;
	return this;
    }

    public ItemStack getResult() {
	return this.recipe.getResult();
    }

    public HashMap<Integer, ItemStack> getIngridients() {
	
	return null;
    }

}
