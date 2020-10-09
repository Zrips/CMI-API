package com.Zrips.CMI.Modules.Anvil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;

import com.Zrips.CMI.CMI;

public class AnvilUnlimitedListener implements Listener {
    private CMI plugin;

    List<UUID> instaBuild = new ArrayList<UUID>();

    public AnvilUnlimitedListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPrepareAnvilEvent(PrepareAnvilEvent event) {
	
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void InventoryClickEvent(InventoryClickEvent event) {

    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL)
    public void InventoryCloseEvent(InventoryCloseEvent event) {
	
    }
}
