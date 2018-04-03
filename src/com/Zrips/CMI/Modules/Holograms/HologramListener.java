package com.Zrips.CMI.Modules.Holograms;

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

import com.Zrips.CMI.CMI;

public class HologramListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdateRange;

    public HologramListener(CMI plugin) {
	this.plugin = plugin;
	lastUpdateRange = new HashMap<UUID, Long>();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerMoveEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;

	Location locfrom = event.getFrom();
	Location locto = event.getTo();
	if (locfrom.getBlockX() == locto.getBlockX() && locfrom.getBlockY() == locto.getBlockY() && locfrom.getBlockZ() == locto.getBlockZ())
	    return;

	if (player.hasMetadata("NPC"))
	    return;

	Long last = lastUpdateRange.get(player.getUniqueId());
	long now = System.currentTimeMillis();

	if (last != null)
	    if (now - last < plugin.getHologramManager().getHoloCheckInterval())
		return;

	this.lastUpdateRange.put(player.getUniqueId(), now);

	plugin.getHologramManager().handleHoloUpdates(player, locto);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerQuitEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;

	this.lastUpdateRange.remove(player.getUniqueId());

	plugin.getHologramManager().removeLastSignInRange(player.getUniqueId());
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerMoveExtendedRnage(PlayerJoinEvent event) {
	Player player = event.getPlayer();
	if (player == null)
	    return;
	plugin.getHologramManager().handleHoloUpdates(player, player.getLocation());
    }
}
