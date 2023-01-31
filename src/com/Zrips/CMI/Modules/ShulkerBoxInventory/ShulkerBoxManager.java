package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class ShulkerBoxManager {

    HashMap<UUID, ShulkerInv> map = new HashMap<UUID, ShulkerInv>();

    private CMI plugin;

    public ShulkerBoxManager(CMI plugin) {
        this.plugin = plugin;
    }

    public final static String identifier = "CMIBackPack";

    public boolean stillHaveItem(Player player) {

        return false;
    }

    public void closeAll() {

    }

    public boolean isEditing(Player player) {
        if (map.isEmpty())
            return false;
        return map.containsKey(player.getUniqueId());
    }

    private Inventory getExisting(Player player) {

        return null;
    }

    private boolean PreventInCombat = true;

    public void loadConfig() {

    }

    public void openShulkerBox(Player player, ItemStack item) {

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
