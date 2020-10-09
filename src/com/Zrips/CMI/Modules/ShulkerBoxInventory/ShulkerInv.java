package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShulkerInv {

    private Player player;
    private ItemStack shulkerBox;
    private Inventory customInv;

    private Integer sourceId = null;

    public ShulkerInv(Player player, int sourceId, Inventory customInv) {
	this.player = player;
	this.sourceId = sourceId;
	this.customInv = customInv;
    }

    public Player getPlayer() {
	return player;
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public Inventory getCustomInv() {
	return customInv;
    }

    public void setCustomInv(Inventory customInv) {
	this.customInv = customInv;
    }

    public Integer getSourceId() {
	return sourceId;
    }

    public void setSourceId(Integer sourceId) {
	this.sourceId = sourceId;
    }

    public ItemStack getShulkerBox() {
	return shulkerBox;
    }

    public void setShulkerBox(ItemStack shulkerBox) {
	this.shulkerBox = shulkerBox;
    }

}
