package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CMIPlayerInventory {

    private CMIUser user;

    public static enum CMIInventorySlot {
	Helmet(39), ChestPlate(38), Pants(37), Boots(36), OffHand(40), MainHand(-1), QuickBar(0, 8), PartInventory(9, 35), MainInventory(0, 35), CraftingIngredients(1, 4), CraftingResult(0);
	private List<Integer> slot = new ArrayList<Integer>();

	CMIInventorySlot(Integer from, Integer to) {
	    for (int i = from; i <= to; i++) {
		this.slot.add(i);
	    }
	}

	CMIInventorySlot(Integer slot) {
	    this.slot.add(slot);
	}

	CMIInventorySlot(List<Integer> slot) {
	    this.slot.addAll(slot);
	}

	public List<Integer> getSlots() {
	    return slot;
	}
    }

    public CMIPlayerInventory(CMIUser user) {
	this.user = user;
    }

    public void setItem(CMIInventorySlot type, ItemStack item) {
	Player player = user.getPlayer();
	player.getInventory().setItem(type.getSlots().get(0), item);
    }

    public ItemStack getItem(CMIInventorySlot type) {
	List<ItemStack> items = getItems(type);
	return items.get(0);
    }

    public List<ItemStack> getItems(CMIInventorySlot type) {
	List<ItemStack> items = new ArrayList<ItemStack>();
	return items;
    }

}
