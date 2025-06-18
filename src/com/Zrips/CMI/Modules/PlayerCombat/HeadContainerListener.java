package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.regex.Pattern;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;

public class HeadContainerListener implements Listener {
    private CMI plugin;
    static final Pattern pattern = null;

    public HeadContainerListener(CMI plugin) {
    }

    private boolean processPersistentContainer(BlockBreakEvent event) {
        return false;
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onBlockBreakEvent(BlockBreakEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onBlockPlaceEvent(BlockPlaceEvent event) {
    }
}
