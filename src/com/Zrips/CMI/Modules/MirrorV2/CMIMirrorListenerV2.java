package com.Zrips.CMI.Modules.MirrorV2;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;

public class CMIMirrorListenerV2 implements Listener {
    private CMI plugin;

    public CMIMirrorListenerV2(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockPlaceEvent(BlockPlaceEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockBreakEvent(BlockBreakEvent event) {
    }
}
