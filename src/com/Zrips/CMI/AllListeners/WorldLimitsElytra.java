package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.Zrips.CMI.CMI;

public class WorldLimitsElytra implements Listener {
    private CMI plugin;

    public WorldLimitsElytra(CMI plugin) {
    }

    @EventHandler
    public void onWorldChangeElytra(PlayerChangedWorldEvent event) {
    }

    @EventHandler
    public void onLoginElytra(PlayerLoginEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerMoveEvent(PlayerMoveEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {
    }
}
