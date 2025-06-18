package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;

import com.Zrips.CMI.CMI;

public class AnimationSitListener implements Listener {
    private CMI plugin;

    public AnimationSitListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerTeleportEvent(PlayerTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerTeleportEvent(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void EntityTeleportEvent(EntityTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerMoveEvent(PlayerMoveEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void VehicleExitEvent(VehicleExitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockBreakEvent(BlockBreakEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void PlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void EntityDamageEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerInteractEvent event) {
    }
}
