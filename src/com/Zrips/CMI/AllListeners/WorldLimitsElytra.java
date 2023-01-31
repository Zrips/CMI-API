package com.Zrips.CMI.AllListeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import com.Zrips.CMI.CMI;

public class WorldLimitsElytra implements Listener {
    private CMI plugin;

    public WorldLimitsElytra(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onWorldChangeElytra(PlayerChangedWorldEvent event) {
    }

    @EventHandler
    public void onLoginElytra(PlayerLoginEvent event) {
    }

    @EventHandler
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {
    }

    private void processElytra(Player player) {
    }
}
