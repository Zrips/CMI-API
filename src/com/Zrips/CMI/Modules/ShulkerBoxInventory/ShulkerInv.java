package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShulkerInv {

    private Player player;
    private ItemStack source;
    private Inventory customInv;

    public ShulkerInv(Player player, ItemStack source, Inventory customInv) {
	this.player = player;
	this.source = source;
	this.customInv = customInv;
    }

    public Player getPlayer() {
	return player;
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public ItemStack getSource() {
	return source;
    }

    public void setSource(ItemStack source) {
	this.source = source;
    }

    public Inventory getCustomInv() {
	return customInv;
    }

    public void setCustomInv(Inventory customInv) {
	this.customInv = customInv;
    }

}
