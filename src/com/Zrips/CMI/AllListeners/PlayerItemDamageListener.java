package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;

public class PlayerItemDamageListener implements Listener {
    private CMI plugin;

    public PlayerItemDamageListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void itemDurabilityLoss(PlayerItemDamageEvent event) {
	
    }

}
