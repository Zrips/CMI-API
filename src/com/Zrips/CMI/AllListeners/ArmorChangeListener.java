package com.Zrips.CMI.AllListeners;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class ArmorChangeListener implements Listener {

    private CMI plugin;

    public ArmorChangeListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler
    public void InventoryDragEvent(InventoryDragEvent event) {

    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
    }

    public static Set<UUID> checked = new HashSet<UUID>();

    @EventHandler
    public void playerInteractEvent(PlayerPickupItemEvent event) {
    }

    @EventHandler
    public void playerInteractEvent(PlayerItemHeldEvent event) {
    }

    @EventHandler
    public void playerInteractEvent(PlayerQuitEvent event) {
    }

    @EventHandler
    public void playerInteractEvent(PlayerInteractEvent event) {
    }

    @EventHandler
    public void dispenserFireEvent(BlockDispenseEvent event) {
	
    }
}
