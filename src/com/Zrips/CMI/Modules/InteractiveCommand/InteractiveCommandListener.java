package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.LinkedHashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class InteractiveCommandListener implements Listener {
    private CMI plugin;
    private static int MAX_ENTRIES;
    public static LinkedHashMap<UUID, Long> limit;

    public InteractiveCommandListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerInteractCancelableEvent(PlayerInteractEvent event) {
    }

    private CMIInteractiveCommand getCommand(PlayerInteractEvent event) {
        return null;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerInteractEvent(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void blockBreak(BlockPhysicsEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void blockBreak(BlockBreakEvent event) {
    }

    @EventHandler
    public void onSignChangeEvent(SignChangeEvent event) {
    }
}
