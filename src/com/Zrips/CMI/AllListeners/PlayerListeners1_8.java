package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class PlayerListeners1_8 implements Listener {
    private CMI plugin;

    public PlayerListeners1_8(CMI plugin) {
        this.plugin = plugin;
    }

    @SuppressWarnings({ "incomplete-switch", "deprecation" })
    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractMinecart(PlayerInteractAtEntityEvent event) {

    }
}
