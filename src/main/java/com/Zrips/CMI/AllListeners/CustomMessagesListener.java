package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class CustomMessagesListener implements Listener {
    CMI plugin;

    public CustomMessagesListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onQuit(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onQuit(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onJoinMulti(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onJoin(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onJoinMulti(PlayerJoinEvent event) {
    }
}
