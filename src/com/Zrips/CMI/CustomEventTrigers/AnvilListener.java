package com.Zrips.CMI.CustomEventTrigers;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;

import com.Zrips.CMI.CMI;

public class AnvilListener implements Listener {
    private CMI plugin;

    public AnvilListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PrepareAnvilEvent(PrepareAnvilEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onitemRename(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onItemRepair(PrepareAnvilEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onItemRepair(InventoryClickEvent event) {
    }
}
