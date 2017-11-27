package com.Zrips.CMI.Modules.Mirror;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import com.Zrips.CMI.CMI;

public class MirrorListener implements Listener {
    private CMI plugin;

    public MirrorListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockPlaceEvent(BlockPlaceEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockBreakEvent(BlockBreakEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryClickEvent(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryCloseEvent(InventoryCloseEvent event) {
    }
}
