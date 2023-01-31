package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

import com.Zrips.CMI.CMI;

public class LaunchPadListener1_9 implements Listener {
    private CMI plugin;

    public LaunchPadListener1_9(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {
    }
}
