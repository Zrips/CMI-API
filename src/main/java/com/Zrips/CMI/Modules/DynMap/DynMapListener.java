package com.Zrips.CMI.Modules.DynMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPlayerUnVanishEvent;
import com.Zrips.CMI.events.CMIPlayerVanishEvent;

public class DynMapListener implements Listener {
    private CMI plugin;

    public DynMapListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CMIPlayerUnVanishEvent(CMIPlayerUnVanishEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CMIPlayerVanishEvent(CMIPlayerVanishEvent event) {
    }
}
