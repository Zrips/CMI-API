package com.Zrips.CMI.Modules.SilentChest;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.SilentChest;

public class silentChestListener implements Listener {

    private HashMap<UUID, SilentChest> silentChest = new HashMap<UUID, SilentChest>();
    public static HashMap<UUID, Boolean> ToggledSilentChest = new HashMap<UUID, Boolean>();
    private CMI plugin;

    private HashMap<UUID, Long> sleep = new HashMap<UUID, Long>();

    public silentChestListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void animation(PlayerAnimationEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockBreakEvent(BlockBreakEvent event) {
	
    }

    @SuppressWarnings("unchecked")
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInteract(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onSilentInventoryClose(InventoryCloseEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
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
