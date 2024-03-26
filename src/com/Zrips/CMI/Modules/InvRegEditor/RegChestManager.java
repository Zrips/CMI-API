package com.Zrips.CMI.Modules.InvRegEditor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.GUIManager.GUIClickType;

public class RegChestManager {

    private HashMap<UUID, CMIInvSee> watcherList = new HashMap<UUID, CMIInvSee>();
    private HashMap<UUID, CMIInvSee> slaveList = new HashMap<UUID, CMIInvSee>();

    private CMI plugin;

    public RegChestManager(CMI plugin) {
        this.plugin = plugin;
    }

    public boolean isWatching(Player player) {
        return watcherList.containsKey(player.getUniqueId());
    }

    public CMIInvSee getInformation(Player player) {
        return null;
    }

    public void remove(Player player) {
    }

    public CMIInvSee removeWatcher(Player player) {
        return watcherList.remove(player.getUniqueId());
    }

    public CMIInvSee removeSlave(Player player) {
        return slaveList.remove(player.getUniqueId());
    }

    public boolean isSlave(Player player) {
        if (slaveList.isEmpty())
            return false;
        return slaveList.containsKey(player.getUniqueId());
    }

    public boolean openInventory(Player watcher, Player target) {

        return true;
    }

    public void tempLockWatcher(Player target) {

    }

    public void recheckPlayerInventory(Player target) {

    }

    private void updateWatcherInventory(Player watcher) {

    }

    enum sectionType {
        inventory, armor, offhand, cursor, crafting;
    }

    private boolean invClick(GUIClickType type, sectionType sectionType, UUID uuid, int slot, int realSlot) {

        return true;
    }

    private void addInventoryButton(CMIGui gui, ItemStack item, int slot, int realSlot) {

    }

    private double cleanNumber(double number) {
        return number * 100 / 100D;
    }

    private static ItemStack[] hideItems(ItemStack[] items) {

        return null;
    }

    public CMIGui createGui(Player watcher, Player target) {

        return null;
    }

    private ItemStack[] getCraftingInventory(Player player) {

        return null;
    }
}
