package com.Zrips.CMI.Modules.Portals;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;

public class PortalListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdate;
    protected Map<UUID, Long> lastUpdateRange;

    public PortalListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRange(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerTeleportEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerQuitEvent(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerJoinEvent(PlayerJoinEvent event) {

    }
}
