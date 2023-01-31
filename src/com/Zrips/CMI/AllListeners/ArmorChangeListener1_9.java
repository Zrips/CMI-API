package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

import com.Zrips.CMI.CMI;

public class ArmorChangeListener1_9 implements Listener {

    private CMI plugin;

    public ArmorChangeListener1_9(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler
    public void playerInteractEvent(PlayerSwapHandItemsEvent event) {
	ArmorChangeListener.checked.remove(event.getPlayer().getUniqueId());
    }
}
