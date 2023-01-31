package com.Zrips.CMI.AllListeners;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
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

    @EventHandler(priority = EventPriority.HIGH)
    public void InventoryDragEvent(InventoryDragEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onInventoryClick(InventoryClickEvent event) {
    }

    public static Set<UUID> checked = new HashSet<UUID>();

    @EventHandler
    public void playerInteractEvent(PlayerPickupItemEvent event) {
        checked.remove(event.getPlayer().getUniqueId());
    }

    @EventHandler
    public void playerInteractEvent(PlayerItemHeldEvent event) {
        checked.remove(event.getPlayer().getUniqueId());
    }

    @EventHandler
    public void playerInteractEvent(PlayerQuitEvent event) {
        checked.remove(event.getPlayer().getUniqueId());
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void playerInteractEvent(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGH)
    public void dispenserFireEvent(BlockDispenseEvent event) {
    }
}
