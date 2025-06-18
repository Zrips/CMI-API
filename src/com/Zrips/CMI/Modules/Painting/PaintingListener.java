package com.Zrips.CMI.Modules.Painting;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class PaintingListener implements Listener {
    private CMI plugin;

    public PaintingListener(CMI plugin) {
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
