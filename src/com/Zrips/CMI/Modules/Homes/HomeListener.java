package com.Zrips.CMI.Modules.Homes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class HomeListener implements Listener {
    private CMI plugin;

    public HomeListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEnderChestClick(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void bedBreak(BlockBreakEvent event) {
    }
}
