package com.Zrips.CMI.Modules.SavedItems;

import org.bukkit.inventory.ItemStack;

public class SavedItem {

    private ItemStack item;
    private String name;

    public SavedItem(String name) {
	this.name = name;
    }

    public SavedItem(String name, ItemStack item) {
	this.name = name;
	this.item = item;
    }

    public ItemStack getItem() {
	return item;
    }

    public void setItem(ItemStack item) {
	this.item = item;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void reset() {
	item = null;	
    }

}
