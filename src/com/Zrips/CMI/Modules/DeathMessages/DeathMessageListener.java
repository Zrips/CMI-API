package com.Zrips.CMI.Modules.DeathMessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import com.Zrips.CMI.CMI;

public class DeathMessageListener implements Listener {
    private CMI plugin;

    public DeathMessageListener(CMI plugin) {
	this.plugin = plugin;
    }

    static boolean enabled = false;

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerDamageEvent(EntityDamageEvent event) {
    }
	
}
