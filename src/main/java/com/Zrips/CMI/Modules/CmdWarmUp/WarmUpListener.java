package com.Zrips.CMI.Modules.CmdWarmUp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class WarmUpListener implements Listener {

    private CMI plugin;

    public WarmUpListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onCommand(PlayerCommandPreprocessEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerMove(PlayerMoveEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerQuitEvent(final PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerDamage(EntityDamageEvent event) {
    }

}
