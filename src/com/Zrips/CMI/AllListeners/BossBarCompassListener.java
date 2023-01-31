package com.Zrips.CMI.AllListeners;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import com.Zrips.CMI.CMI;

public class BossBarCompassListener implements Listener {
    private CMI plugin;

    public BossBarCompassListener(CMI plugin) {
        this.plugin = plugin;
    }

    ConcurrentHashMap<UUID, Long> compassCheck = new ConcurrentHashMap<UUID, Long>();

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(final PlayerJoinEvent event) {
        compassCheck.put(event.getPlayer().getUniqueId(), System.currentTimeMillis() + 1000L);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(final PlayerItemHeldEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerMoveEvent(final PlayerMoveEvent event) {

    }

}
