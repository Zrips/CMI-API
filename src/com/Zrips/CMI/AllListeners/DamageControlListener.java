package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import com.Zrips.CMI.CMI;

public class DamageControlListener implements Listener {
    private CMI plugin;

    public DamageControlListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void EntityDamageEvent(EntityDamageEvent event) {
    }
}
