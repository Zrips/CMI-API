package com.Zrips.CMI.Modules.Recipes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.Zrips.CMI.CMI;

public class RecipeListener implements Listener {
    CMI plugin;

    public RecipeListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void InventoryClickEvent(InventoryClickEvent event) {
    }
}
