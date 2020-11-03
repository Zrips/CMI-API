package com.Zrips.CMI.Modules.InvRegEditor;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import com.Zrips.CMI.CMI;

public class RegChestListener implements Listener {
    CMI plugin;

    public RegChestListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onNormalInventoryClose(InventoryCloseEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryClickSlave(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryMoveSlave(InventoryDragEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryMoveSlave(PlayerGameModeChangeEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onitemPickup(PlayerPickupItemEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onItemDrop(PlayerDropItemEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onInventoryClickMaster(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onInventoryMoveMaster(InventoryDragEvent event) {
	
    }

}
