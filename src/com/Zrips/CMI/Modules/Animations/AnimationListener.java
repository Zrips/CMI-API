package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;

public class AnimationListener implements Listener {

    private CMI plugin;

    public AnimationListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerTeleportEvent event) {
	plugin.getAnimationManager().removePlayer(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerDeathEvent event) {
	plugin.getAnimationManager().removePlayer(event.getEntity());
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerQuitEvent event) {
	plugin.getAnimationManager().removePlayer(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerInteractEvent event) {

    }

}
