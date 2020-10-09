package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.Zrips.CMI.CMI;

public class GlicthListeners implements Listener {
    private CMI plugin;

    public GlicthListeners(CMI plugin) {
	this.plugin = plugin;
    }
    
    @EventHandler(priority = EventPriority.LOWEST)
    public void onCommand(PlayerCommandPreprocessEvent event) {
    }

}
