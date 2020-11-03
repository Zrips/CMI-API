package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

import com.Zrips.CMI.CMI;

public class PlayerItemDamageListener implements Listener {
    private CMI plugin;

    public PlayerItemDamageListener(CMI plugin) {
	this.plugin = plugin;
    }

    HashMap<UUID, Long> informed = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.NORMAL)
    public void itemDurabilityLoss(PlayerItemDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void armorDurabilityLoss(PlayerItemDamageEvent event) {
    }
}
