package com.Zrips.CMI.Modules.InvRegEditor;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class RegChestManager {

    private HashMap<String, RegWatcher> WatcherList = new HashMap<String, RegWatcher>();

    private CMI plugin;

    public RegChestManager(CMI plugin) {
	this.plugin = plugin;
    }

    public boolean isWatching(Player player) {
	return WatcherList.containsKey(player.getName());
    }

    public RegWatcher getWatcher(Player player) {
	return WatcherList.get(player.getName());
    }

    public void ReopenNormalChest(final Player player, final Player Target) {
    }

    public void removeWatcher(Player player) {
    }

    public boolean isThisSlave(Player player) {
	return false;
    }

    public RegWatcher getWatcherInfoBySlave(Player player) {
	return null;
    }

    public boolean CheckInvClick(Player player, int slot, String actionName) {

	return false;
    }

    public boolean openInventory(Player player, Player Target) {

	return true;
    }

    public void UpdateSlaveContents(final Player player) {

    }

    public void UpdateMaster(Player player) {
    }

    public void UpdateMasterContents(final Player player) {

    }

    public void UpdateMasterCrafting(final Player player) {

    }

    public void UpdateSlaveCrafting(final Player player) {

    }

    public void UpdateMasterCraftingResult(final Player player) {

    }

    public void UpdateMasterArmor(final Player player) {

    }

    public void UpdateMasterItemInHand(final Player player) {

    }

    public void UpdateSlaveItemInHand(final Player player) {

    }

    public void UpdateMasterOffHand(final Player player) {

    }

    public void UpdateSlaveOffHand(final Player player) {

    }

    public void UpdateSlaveArmor(final Player player) {

    }

    @SuppressWarnings("deprecation")
    public Inventory CreateGui(Player source, Player player) {
	return null;
    }

    public ItemStack SlaveCraftInv(Player player, int Slot) {
	return null;
    }

}
