package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.regex.Pattern;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPvPEndEventAsync;
import com.Zrips.CMI.events.CMIPvPStartEventAsync;

public class PlayerCombatListener implements Listener {
    private CMI plugin;

    public PlayerCombatListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerQuitEvent(final PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerJoinEvent(final PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvPEndEventAsync(CMIPvPEndEventAsync event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvPStartEventAsync(CMIPvPStartEventAsync event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerCombatEvent(EntityDamageEvent event) {

    }

    String HEX_PATTERN = "([a-zA-Z0-9+/]{32,}+={0,2})";
    Pattern pattern = Pattern.compile(HEX_PATTERN);

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockBreakEvent(BlockBreakEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onEntityDeath(EntityDeathEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerDeath(EntityDeathEvent event) {
    }
}
