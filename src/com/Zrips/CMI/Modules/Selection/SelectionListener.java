package com.Zrips.CMI.Modules.Selection;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class SelectionListener implements Listener {
    private CMI plugin;

    public SelectionListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onSelection(PlayerInteractEvent event) {
    }
}
