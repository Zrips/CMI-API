package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class AnimationListener implements Listener {
    private CMI plugin;

    public AnimationListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onPlayerQuitRiding(PlayerQuitEvent event) {
    }
}
