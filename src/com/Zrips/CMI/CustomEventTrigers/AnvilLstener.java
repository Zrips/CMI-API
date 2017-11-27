package com.Zrips.CMI.CustomEventTrigers;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.Zrips.CMI.CMI;

public class AnvilLstener implements Listener {

    private CMI plugin;

    public AnvilLstener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onitemRename(InventoryClickEvent event) {
	

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onItemRepair(InventoryClickEvent event) {
	
    }
}