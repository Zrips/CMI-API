package com.Zrips.CMI.Modules.FlightCharge;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.BossBar.CMIBossBarHideEvent;

public class FlightListener implements Listener {
    private CMI plugin;

    static HashMap<UUID, traveledDistance> distanceMap = new HashMap<UUID, traveledDistance>();

    public FlightListener(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerToggleFlightEvent(PlayerToggleFlightEvent event) {

    }

    public static HashMap<UUID, freeFall> fallDistanceMap = new HashMap<UUID, freeFall>();

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerMoveEvent2(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerTeleportEvent(PlayerTeleportEvent event) {

        distanceMap.remove(event.getPlayer().getUniqueId());
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerMoveEvent(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerQuitEvent(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerJoinEvent(PlayerJoinEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerJoinEvent(PlayerChangedWorldEvent event) {

    }

    HashMap<UUID, Long> informed = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerGameModeChangeEvent(PlayerGameModeChangeEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void CMIBossBarHideEvent(CMIBossBarHideEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onRespawn(PlayerRespawnEvent event) {

    }
}
