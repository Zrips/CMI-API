package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;

public class AnimationSitListener implements Listener {

    private CMI plugin;

    public AnimationSitListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerTeleportEvent(PlayerTeleportEvent event) {
	plugin.getAnimationManager().removePlayerFromChair(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerDeathEvent event) {
	plugin.getAnimationManager().removePlayerFromChair(event.getEntity());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerTeleportEvent(PlayerQuitEvent event) {
	plugin.getAnimationManager().removePlayerFromChair(event.getPlayer(), false);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void EntityTeleportEvent(EntityTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerMoveEvent(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockBreakEvent(BlockBreakEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void EntityDamageEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerInteractEvent event) {
	
    }
}
