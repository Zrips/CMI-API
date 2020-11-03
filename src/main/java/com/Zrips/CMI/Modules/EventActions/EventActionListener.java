package com.Zrips.CMI.Modules.EventActions;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPvPEndEventAsync;
import com.Zrips.CMI.events.CMIPvPStartEventAsync;

public class EventActionListener implements Listener {
    private CMI plugin;

    public EventActionListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvPEndEventAsync(CMIPvPEndEventAsync event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvPStartEventAsync(CMIPvPStartEventAsync event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerFirstJoinEvent(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerJoinEvent(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerDeathEvent(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerRespawnEvent(PlayerRespawnEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerQuitEvent(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerTeleportEvent(PlayerTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerBedEnterEvent(PlayerBedEnterEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerBedLeaveEvent(PlayerBedLeaveEvent event) {
    }

    HashMap<UUID, Long> last = new HashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerVoidFallEvent(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerChangedWorldEvent(PlayerChangedWorldEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerGameModeChangeEvent(PlayerGameModeChangeEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerKickEvent(PlayerKickEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerLevelChangeEvent(PlayerLevelChangeEvent event) {

    }
}
