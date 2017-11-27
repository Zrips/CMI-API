package com.Zrips.CMI.AllListeners;

import java.util.HashMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.SilentChest;

public class silentChest implements Listener {

    public HashMap<String, SilentChest> silentChest = new HashMap<String, SilentChest>();
    public HashMap<String, Boolean> ToggledSilentChest = new HashMap<String, Boolean>();
    private CMI plugin;

    public silentChest(CMI plugin) {
	this.plugin = plugin;
    }

    @SuppressWarnings("unchecked")
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInteract(PlayerInteractEvent event) {
	
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onSilentInventoryClose(InventoryCloseEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onSilentInventoryClickWatcher(final InventoryClickEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onSilentInventoryClickWatcher(final InventoryDragEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onSilentInventoryClick(final InventoryClickEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onSilentInventoryClick(final InventoryDragEvent event) {
	
    }
}
