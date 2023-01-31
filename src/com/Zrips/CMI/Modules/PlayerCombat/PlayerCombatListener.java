package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPvEEndEventAsync;
import com.Zrips.CMI.events.CMIPvEStartEventAsync;
import com.Zrips.CMI.events.CMIPvPEndEventAsync;
import com.Zrips.CMI.events.CMIPvPStartEventAsync;

public class PlayerCombatListener implements Listener {
    private CMI plugin;

    public PlayerCombatListener(CMI plugin) {
        this.plugin = plugin;
    }

    Set<UUID> ignoreFall = new HashSet<UUID>();

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerQuitEvent(final PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerJoinEvent(final PlayerJoinEvent event) {

    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onPlayerMove(PlayerCommandPreprocessEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvPEndEventAsync(CMIPvPEndEventAsync event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvPStartEventAsync(CMIPvPStartEventAsync event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvPStartEventAsync(CMIPvEStartEventAsync event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIPvEEndEventAsync(CMIPvEEndEventAsync event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerDamageEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void entityCombatEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerForceCombatEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerCombatEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerDeath(EntityDeathEvent event) {

    }
}
