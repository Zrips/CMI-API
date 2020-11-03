package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BlockStateMeta;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.events.CMIBackpackOpenEvent;

public class ShulkerBoxManager {

    HashMap<UUID, ShulkerInv> map = new HashMap<UUID, ShulkerInv>();

    private CMI plugin;

    public ShulkerBoxManager(CMI plugin) {
	this.plugin = plugin;
    }

    public boolean stillHaveItem(Player player) {
	return false;
    }

    public void closeAll() {
    }

    public boolean isEditing(Player player) {
	return false;
    }

    private Inventory getExisting(Player player) {
	return null;
    }

    private boolean PreventInCombat = true;

    public void loadConfig() {
    }

    public void openShulkerBox(Player player, ItemStack item) {

    }

    public void replaceShulkerBox(Player player, ItemStack item) {

    }

    public void updateShulkerItem(Player player) {

    }

    public void remove(Player player) {
	map.remove(player.getUniqueId());
    }

    public boolean isShulkerBox(ItemStack OneItem) {

	return true;
    }

    public List<ItemStack> getShulkerBoxContents(ItemStack OneItem) {

	return null;
    }

    public void updateEntireShulkerInv(Player player, ItemStack[] cont) {

    }

    public void setShulkerInv(ItemStack shulkerBox, ItemStack[] cont) {

    }

}
