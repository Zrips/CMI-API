package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;

import com.Zrips.CMI.CMI;

public class AnimationRideListener implements Listener {
    private CMI plugin;

    public AnimationRideListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void EntityDamageEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void PlayerDeathEvent(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EntityDeathEvent(EntityDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void EntityTeleportEvent(PlayerTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerMoveEvent(VehicleMoveEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerMoveEvent(PlayerMoveEvent event) {
    }
}
