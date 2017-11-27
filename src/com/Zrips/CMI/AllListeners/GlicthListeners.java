package com.Zrips.CMI.AllListeners;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import com.Zrips.CMI.CMI;

public class GlicthListeners implements Listener {
    private CMI plugin;

    public GlicthListeners(CMI plugin) {
	this.plugin = plugin;
    }

    private Set<UUID> invMap = new HashSet<UUID>();

    @EventHandler(priority = EventPriority.NORMAL)
    public void InventoryOpenEvent(InventoryOpenEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void InventoryCloseEvent(InventoryCloseEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PrepareItemCraftEvent(PrepareItemCraftEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {
    }

}
