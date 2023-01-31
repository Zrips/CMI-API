package com.Zrips.CMI.AllListeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;

public class WorldLimits implements Listener {
    private CMI plugin;

    public WorldLimits(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onWorldChangeGameMode(PlayerChangedWorldEvent event) {

    }

    @EventHandler
    public void onLoginGameMode(PlayerLoginEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onWorldChangeFly(PlayerChangedWorldEvent event) {
        processFly(event.getPlayer(), event.getFrom().getName());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onWorldChangeFlyCached(PlayerChangedWorldEvent event) {

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
        processGod(event.getPlayer());
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onWorldChangeGod(PlayerChangedWorldEvent event) {
        processGod(event.getPlayer());
    }

    private void processGod(Player player) {

    }
}
