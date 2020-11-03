package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class ShulkerBoxListener implements Listener {
    private CMI plugin;

    public ShulkerBoxListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void ShulkerItemOpen(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerInteractEvent(PlayerInteractEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOW)
    public void ShulkerEdit(InventoryClickEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void ShulkerEdit(InventoryDragEvent event) {
	if (event.isCancelled())
	    return;
	if (!(event.getWhoClicked() instanceof Player))
	    return;
	final Player player = (Player) event.getWhoClicked();
	if (!plugin.getShulkerBoxManager().isEditing(player))
	    return;
	if (!plugin.getShulkerBoxManager().stillHaveItem(player)) {
	    event.setCancelled(true);
	    player.closeInventory();
	}
	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
	    @Override
	    public void run() {
		plugin.getShulkerBoxManager().updateShulkerItem(player);
	    }
	}, 1L);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void CheckForChulker(InventoryClickEvent event) {

	if (!(event.getWhoClicked() instanceof Player))
	    return;
	Player player = (Player) event.getWhoClicked();
	if (!plugin.getShulkerBoxManager().isEditing(player))
	    return;

	try {
	    if (event.getClick() == ClickType.NUMBER_KEY) {
		event.setCancelled(true);
		return; 
	    }
	} catch (Throwable e) {
	}
	
	ItemStack item = event.getCurrentItem();
	if (item == null)
	    return;
	if (CMIMaterial.isShulkerBox(item.getType())) {
	    if (event.getClickedInventory().getType() == InventoryType.PLAYER)
		event.setCancelled(true);
	    if (event.getClick() == ClickType.SHIFT_RIGHT) {

		if (!plugin.getShulkerBoxManager().isShulkerBox(item)) {
		    ItemStack clone = plugin.getNMS().tryToMakeShulkerBox(item);
		    if (!plugin.getShulkerBoxManager().isShulkerBox(clone))
			return;
		    item = clone;
		    player.getInventory().setItem(event.getSlot(), item);
		}
		event.setCancelled(true);

		plugin.getShulkerBoxManager().openShulkerBox(player, player.getInventory().getItem(event.getSlot()));
		if (player.isOnline())
		    return;

//		Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
//		    @Override
//		    public void run() {
//			plugin.getShulkerBoxManager().openShulkerBox(player, player.getInventory().getItem(event.getSlot()));
//		    }
//		}, 1);
	    }
	    return;
	}

	try {
	    if (event.getAction() == InventoryAction.HOTBAR_SWAP) {
		event.setCancelled(true);
		return;
	    }
	} catch (Exception e) {
	}
	try {
	    if (event.getAction() == InventoryAction.HOTBAR_MOVE_AND_READD) {
		event.setCancelled(true);
		return;
	    }
	} catch (Exception e) {
	}
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void InventoryCloseEvent(InventoryCloseEvent event) {
	Player player = (Player) event.getPlayer();
	if (!plugin.getShulkerBoxManager().isEditing(player))
	    return;

//	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
//	    @Override
//	    public void run() {		
	plugin.getShulkerBoxManager().updateEntireShulkerInv(player, event.getInventory().getContents());
	plugin.getShulkerBoxManager().remove(player);
//	    }
//	}, 1L);
    }
}
