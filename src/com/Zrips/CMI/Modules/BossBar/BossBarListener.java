package com.Zrips.CMI.Modules.BossBar;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Zrips.CMI.CMI;

public class BossBarListener implements Listener {
    private CMI plugin;

    public BossBarListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoinBossBar(PlayerJoinEvent event) {
    }
}
