package com.Zrips.CMI.Modules.Vanish;

import java.util.Iterator;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ExperienceOrb;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.commands.list.vanishedit.VanishAction;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class VanishListener implements Listener {
    private CMI plugin;

    public VanishListener(CMI plugin) {
	this.plugin = plugin;
    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerPickupItemEvent(PlayerPickupItemEvent event) {

    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void CreatureSpawnEvent(org.bukkit.event.entity.CreatureSpawnEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void EntityDamageByEntityEvent(ProjectileHitEvent event) {

    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event) {
    }

    @EventHandler
    public void onPlayerJoinHideOthers(PlayerJoinEvent event) {

    }

    @EventHandler
    public void onPlayerJoinHideYou(PlayerJoinEvent event) {

    }

    @EventHandler
    public void onVehicleEntityCollision(VehicleEntityCollisionEvent event) {

    }

    @EventHandler
    public void onEntityTarget(EntityTargetLivingEntityEvent event) {
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
}
