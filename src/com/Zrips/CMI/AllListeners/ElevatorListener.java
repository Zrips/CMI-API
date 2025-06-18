package com.Zrips.CMI.AllListeners;

import java.awt.Color;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Teleportations.CMITeleportFeedback;

public class ElevatorListener implements Listener {
    private CMI plugin;
    HashMap<UUID, Long> elevatorUsage;

    public ElevatorListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onSignChangeEventElevator(SignChangeEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractEvent(PlayerInteractEvent event) {
    }

    private void playEffectsAndSound(boolean up, Location old, Location loc) {
    }

    private static Color getColor(Block block) {
        return null;
    }

    private CompletableFuture<CMITeleportFeedback> findTeleportLocation(Player player, Location loc, boolean up) {
        return null;
    }
}
