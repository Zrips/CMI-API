package com.Zrips.CMI.Modules.Worth;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPlayerItemsSellEvent;

import net.Zrips.CMILib.GUI.CMIGUICloseEvent;

public class WorthListener implements Listener {
    private CMI plugin;

    public WorthListener(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryClickEvent(InventoryClickEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPlayerItemsSellEvent(CMIPlayerItemsSellEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryCloseEvent(CMIGUICloseEvent event) {

    }
}
