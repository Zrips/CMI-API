package com.Zrips.CMI.Modules.Kits;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Zrips.CMI.CMI;

public class KitListener implements Listener {
    private CMI plugin;

    public KitListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerFirstLogin(PlayerJoinEvent event) {
    }
}
