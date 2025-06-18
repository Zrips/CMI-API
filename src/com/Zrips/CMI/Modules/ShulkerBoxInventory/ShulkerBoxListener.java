package com.Zrips.CMI.Modules.ShulkerBoxInventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class ShulkerBoxListener implements Listener {
    private CMI plugin;

    public ShulkerBoxListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void CheckForChulker(InventoryClickEvent event) {
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
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void InventoryCloseEvent(InventoryCloseEvent event) {
    }
}
