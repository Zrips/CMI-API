package com.Zrips.CMI.Modules.SpawnerCharge;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;

public class SpawnerProximityListener implements Listener {
    private CMI plugin;

    public SpawnerProximityListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void BlockPlaceEventRange(BlockPlaceEvent event) {
    }
}
