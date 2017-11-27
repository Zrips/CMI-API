package com.Zrips.CMI.Modules.Kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Zrips.CMI.CMI;

public class KitEditorListener implements Listener {
    private CMI plugin;

    public KitEditorListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerFirstLogin(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void AsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void InventoryClickEvent(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void InventoryDragEvent(InventoryDragEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void InventoryCloseEvent(InventoryCloseEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void InventoryClickEventPreview(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void InventoryDragEventPreview(InventoryDragEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void InventoryCloseEventPreview(InventoryCloseEvent event) {
    }
}
