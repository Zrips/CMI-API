package com.Zrips.CMI.Modules.Homes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import com.Zrips.CMI.CMI;

public class HomeListener1_11 implements Listener {
    private CMI plugin;

    public HomeListener1_11(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEnderChestClick(PlayerBedEnterEvent event) {
    }
}
