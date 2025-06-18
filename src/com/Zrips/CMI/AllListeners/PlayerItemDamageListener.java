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
    HashMap<UUID, Long> informed;

    public PlayerItemDamageListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void itemDurabilityLoss(PlayerItemDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void armorDurabilityLoss(PlayerItemDamageEvent event) {
    }
}
