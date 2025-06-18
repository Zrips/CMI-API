package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class ShulkerBoxManager {
    HashMap<UUID, ShulkerInv> map;
    private CMI plugin;
    public static final String identifier = null;
    private boolean PreventInCombat;
    private double CostToOpen;

    public ShulkerBoxManager(CMI plugin) {
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

    public void loadConfig() {
    }

    public void openShulkerBox(Player player, ItemStack item) {
    }

    public void updateShulkerItem(Player player) {
    }

    public void remove(Player player) {
    }

    public boolean isShulkerBox(ItemStack OneItem) {
        return false;
    }

    public List<ItemStack> getShulkerBoxContents(ItemStack OneItem) {
        return null;
    }

    public void updateEntireShulkerInv(Player player, ItemStack[] cont) {
    }

    public void setShulkerInv(ItemStack shulkerBox, ItemStack[] cont) {
    }
}
