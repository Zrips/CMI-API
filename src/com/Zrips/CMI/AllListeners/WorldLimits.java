package com.Zrips.CMI.AllListeners;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;

public class WorldLimits implements Listener {
    private CMI plugin;

    public WorldLimits(CMI plugin) {
    }

    @EventHandler
    public void onWorldChangeGameMode(PlayerChangedWorldEvent event) {
    }

    @EventHandler
    public void onLoginGameMode(PlayerLoginEvent event) {
    }

    private void processGameMode(Player player) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onWorldChangeFly(PlayerChangedWorldEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onWorldChangeFlyCached(PlayerChangedWorldEvent event) {
    }

    private void processCachedFly(Player player, World from) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerDeathEventHunger(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onRespawnSetLocation(PlayerRespawnEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void onTeleport(PlayerTeleportEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onLoginFly(PlayerLoginEvent event) {
    }

    private void processFly(Player player, String from) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onLoginGod(PlayerLoginEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onWorldChangeGod(PlayerChangedWorldEvent event) {
    }

    private void processGod(Player player) {
    }
}
