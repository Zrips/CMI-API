package com.Zrips.CMI.Modules.TimedCommands;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class TimedCommandListener implements Listener {
    private CMI plugin;

    public TimedCommandListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerLogOff(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerLoginEvent(PlayerJoinEvent event) {
    }


    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerLoginEvent(PlayerChangedWorldEvent event) {
    }
}
