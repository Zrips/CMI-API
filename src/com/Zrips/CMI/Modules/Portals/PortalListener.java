package com.Zrips.CMI.Modules.Portals;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.EquipmentSlot;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;

public class PortalListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdate;
    protected Map<UUID, Long> lastUpdateRange;

    public PortalListener(CMI plugin) {
	this.plugin = plugin;
	lastUpdate = new HashMap<UUID, Long>();
	lastUpdateRange = new HashMap<UUID, Long>();
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onSelection(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMove(PlayerMoveEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerMoveEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerQuitEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerJoinEvent event) {

    }
}
