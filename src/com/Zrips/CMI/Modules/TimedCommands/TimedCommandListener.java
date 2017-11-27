package com.Zrips.CMI.Modules.TimedCommands;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class TimedCommandListener implements Listener {
    private CMI plugin;

    public TimedCommandListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onPlayerLogOff(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void PlayerLoginEvent(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerLoginEvent(PlayerChangedWorldEvent event) {

    }
}
