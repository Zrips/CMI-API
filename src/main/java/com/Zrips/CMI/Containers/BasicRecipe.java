package com.Zrips.CMI.Containers;

import org.bukkit.inventory.ItemStack;

public class BasicRecipe {
    private ItemStack result;
    private ItemStack input;

    public BasicRecipe(ItemStack result, ItemStack input) {
	this.result = result;
	this.input = input;
    }

    public ItemStack getResult() {
	return result.clone();
    }

    public ItemStack getInput() {
	return input.clone();
    }

}
