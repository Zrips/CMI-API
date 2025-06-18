package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerEditBookEvent;

import com.Zrips.CMI.CMI;

public class GlicthListeners implements Listener {
    private CMI plugin;

    public GlicthListeners(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onCommand(PlayerCommandPreprocessEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerEditBookEvent(PlayerEditBookEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void EntityTeleportEvent(EntityTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void EntityPortalEvent(EntityPortalEvent event) {
    }
}
