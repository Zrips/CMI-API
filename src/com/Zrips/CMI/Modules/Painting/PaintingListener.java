package com.Zrips.CMI.Modules.Painting;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Art;
import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Painting;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.EquipmentSlot;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class PaintingListener implements Listener {
    private CMI plugin;

    public PaintingListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPaintingBreak(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPaintingBreak(HangingBreakEvent event) {
    }

    @EventHandler
    public void onSignInteractShift(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInteractPaiting(PlayerInteractEntityEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onItemHeldChange(PlayerItemHeldEvent event) {

    }
}
