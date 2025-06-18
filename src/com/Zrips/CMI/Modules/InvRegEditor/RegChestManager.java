package com.Zrips.CMI.Modules.InvRegEditor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.GUIManager.GUIClickType;

public class RegChestManager {
    private HashMap<UUID, CMIInvSee> watcherList;
    private HashMap<UUID, CMIInvSee> slaveList;
    private static final int HELMET_SLOT = 0;
    private static final int LEGGINGS_SLOT = 0;
    private static final int CHESTPLATE_SLOT = 0;
    private static final int BOOTS_SLOT = 0;
    private static final int OFFHAND_SLOT = 0;
    private static final int CURSOR_SLOT = 0;
    private CMI plugin;

    public RegChestManager(CMI plugin) {
    }

    public boolean isWatching(Player player) {
        return false;
    }

    public CMIInvSee getInformation(Player player) {
        return null;
    }

    public void remove(Player player) {
    }

    public CMIInvSee removeWatcher(Player player) {
        return null;
    }

    public CMIInvSee removeSlave(Player player) {
        return null;
    }

    public boolean isSlave(Player player) {
        return false;
    }

    public boolean openInventory(Player watcher, Player target) {
        return false;
    }

    public void tempLockWatcher(Player target) {
    }

    public void recheckPlayerInventory(Player target) {
    }

    private void updateWatcherInventory(Player watcher) {
    }

    private boolean invClick(GUIClickType type, sectionType sectionType, UUID uuid, int slot, int realSlot) {
        return false;
    }

    private void addInventoryButton(CMIGui gui, ItemStack item, int slot, int realSlot) {
    }

    private double cleanNumber(double number) {
        return 0.0;
    }

    private static ItemStack[] hideItems(ItemStack[] items) {
        return null;
    }

    private static boolean areItemStacksEqual(ItemStack item1, ItemStack item2) {
        return false;
    }

    private static boolean validInventoryClick(Player watcher, Player target, int slot, ItemStack currentItem) {
        return false;
    }

    public CMIGui createGui(Player watcher, Player target) {
        return null;
    }

    private ItemStack[] getCraftingInventory(Player player) {
        return null;
    }

    enum sectionType {
        inventory, armor, offhand, cursor, crafting;
    }
}
