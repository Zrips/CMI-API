package com.Zrips.CMI.Modules.InvRegEditor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.utils.ActionBar;
import com.Zrips.CMI.utils.DateFormat;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class RegChestManager {

    private HashMap<String, RegWatcher> WatcherList = new HashMap<String, RegWatcher>();
    private String InventoryTopLineBeforeName = "Info: ";

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
	WatcherList.remove(player.getName());
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
