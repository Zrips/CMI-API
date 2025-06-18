package com.Zrips.CMI.AllListeners;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.Zrips.CMI.CMI;

public class BossBarCompassListener implements Listener {
    private CMI plugin;
    ConcurrentHashMap<UUID, Long> compassCheck;

    public BossBarCompassListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerItemHeldEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerMoveEvent(PlayerMoveEvent event) {
    }

    private static Integer process(Location playerLoc, Location targetLoc, double oneD) {
        return null;
    }

    private static double getYaw(Location loc1, Location loc2) {
        return 0.0;
    }
}
