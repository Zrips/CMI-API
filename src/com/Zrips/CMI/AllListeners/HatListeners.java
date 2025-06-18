package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

public class HatListeners implements Listener {
    private CMI plugin;

    public HatListeners(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void armorChangeEvent(CMIArmorChangeEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void hatPlacement(InventoryClickEvent event) {
    }
}
