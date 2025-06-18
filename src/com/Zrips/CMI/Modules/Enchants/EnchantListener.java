package com.Zrips.CMI.Modules.Enchants;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

import com.Zrips.CMI.CMI;

public class EnchantListener implements Listener {
    private CMI plugin;

    public EnchantListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryCloseEvent(InventoryCloseEvent event) {
    }
}
