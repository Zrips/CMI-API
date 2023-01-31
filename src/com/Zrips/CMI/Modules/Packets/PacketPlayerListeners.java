package com.Zrips.CMI.Modules.Packets;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class PacketPlayerListeners implements Listener {
    private CMI plugin;

    public PacketPlayerListeners(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPacketPlayerLogin(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPacketPlayerQuit(PlayerQuitEvent event) {
    }

}
