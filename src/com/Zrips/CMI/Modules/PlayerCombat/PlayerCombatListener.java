package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.events.CMIPvEEndEventAsync;
import com.Zrips.CMI.events.CMIPvEStartEventAsync;
import com.Zrips.CMI.events.CMIPvPEndEventAsync;
import com.Zrips.CMI.events.CMIPvPStartEventAsync;

public class PlayerCombatListener implements Listener {
    private CMI plugin;
    Set<UUID> ignoreFall;
    public static List<String> harmfulList;
    Random rand;

    public PlayerCombatListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerQuitEvent(PlayerQuitEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerJoinEvent(PlayerJoinEvent event) {
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

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onSplashPotion(PotionSplashEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void entityPreCombatEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void playerDamageByEntityCombatEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void entityCombatEvent(EntityDamageEvent event) {
    }

    private static void showBossBar(CMIUser uAttacker, String title) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerForceCombatEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void PlayerPreCombatEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerCombatEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerDeath(EntityDeathEvent event) {
    }
}
