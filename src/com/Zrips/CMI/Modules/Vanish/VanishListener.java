package com.Zrips.CMI.Modules.Vanish;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerListPingEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPlayerVanishEvent;

public class VanishListener implements Listener {
    private CMI plugin;

    public VanishListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onFishingRodUseOnPlayer(PlayerFishEvent event) {
    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CreatureSpawnEvent(org.bukkit.event.entity.CreatureSpawnEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void CreatureSpawnEvent(org.bukkit.event.entity.SpawnerSpawnEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void EntityDamageByEntityEvent(ProjectileHitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerLeave(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onPlayerJoinHideOthers(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onVanish(CMIPlayerVanishEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerJoinHideYou(PlayerJoinEvent event) {
    }

    @EventHandler
    public void onEntityTarget(EntityTargetEvent event) {
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityDamage(EntityDamageEvent event) {
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
    }

    @EventHandler
    public void ping(ServerListPingEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onQuit(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
    }
}
