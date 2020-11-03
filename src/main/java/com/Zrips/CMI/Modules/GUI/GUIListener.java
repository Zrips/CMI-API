package com.Zrips.CMI.Modules.GUI;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import com.Zrips.CMI.CMI;

public class GUIListener implements Listener {
    CMI plugin;

    public GUIListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onNormalInventoryClose(InventoryCloseEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
    }

    private void clearIconItems(Player player) {
    }

    private HashMap<UUID, Long> LastClick = new HashMap<UUID, Long>();

    private boolean canClickByTimer(UUID uuid) {
	return true;
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onInventoryOpenEvent(InventoryOpenEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onInventoryMoveItemEvent(InventoryMoveItemEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onItemDrop(PlayerDropItemEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onInventoryClick(final InventoryClickEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onInventoryMove(final InventoryDragEvent event) {

    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {

    }
}
