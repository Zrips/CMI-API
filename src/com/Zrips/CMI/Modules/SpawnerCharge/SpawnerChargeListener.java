package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;

public class SpawnerChargeListener implements Listener {
    private CMI plugin;
    Random rand;
    static HashMap<UUID, Block> breaking;

    public SpawnerChargeListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockBreakEventExpDrop(BlockBreakEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockBreakEventFull(BlockBreakEvent event) {
    }

    public static void clearCache(UUID uuid) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void blockBreakEventFull(BlockBreakEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockPlaceEvent(BlockPlaceEvent event) {
    }
}
