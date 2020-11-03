package com.Zrips.CMI.Modules.SpawnerCharge;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;

public class SpawnerChargeListener implements Listener {
    private CMI plugin;

    public SpawnerChargeListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockBreakEventExpDrop(BlockBreakEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockBreakEventFull(BlockBreakEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void BlockPlaceEvent(BlockPlaceEvent event) {
	
    }
}
