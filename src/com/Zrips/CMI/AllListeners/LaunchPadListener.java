package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;

public class LaunchPadListener implements Listener {
    private CMI plugin;

    public LaunchPadListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTeleport(PlayerTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void EntityDamageEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onTeleportLaunch(PlayerTeleportEvent event) {
    }
}
