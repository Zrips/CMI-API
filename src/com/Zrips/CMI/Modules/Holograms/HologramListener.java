package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPlayerFakeEntityInteractEvent;

public class HologramListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdateRange;
    protected Map<UUID, Long> stickyLastUpdate;
//    protected Map<UUID, Long> interactCache;

    public HologramListener(CMI plugin) {
        this.plugin = plugin;
        lastUpdateRange = new HashMap<UUID, Long>();
        stickyLastUpdate = new HashMap<UUID, Long>();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerMoveEvent event) {

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

    @EventHandler(priority = EventPriority.NORMAL)
    public void onInteract(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onInteract(CMIHologramClickEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPlayerFakeEntityInteractEvent(CMIPlayerFakeEntityInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerRespawnEvent(PlayerRespawnEvent event) {

    }
}
