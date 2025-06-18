package com.Zrips.CMI.Modules.InvEndEditor;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class EnderChestListener implements Listener {
    private CMI plugin;

    public EnderChestListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onEnderChestClick(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerLoginEnder(PlayerLoginEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerLoginEnder(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerQuitEnder(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onEnderChestDrag(InventoryDragEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onNormalInventoryClose(InventoryCloseEvent event) {
    }
}
