package com.Zrips.CMI.Modules.Mirror;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;

public class MirrorListener implements Listener {
    private CMI plugin;

    public MirrorListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockPlaceEvent(BlockPlaceEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockBreakEvent(BlockBreakEvent event) {
    }
}
