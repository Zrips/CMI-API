package com.Zrips.CMI.Modules.Notify;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import com.Zrips.CMI.CMI;

public class NotifyListener implements Listener {
    private CMI plugin;

    public NotifyListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockPlaceEvent(PlayerLoginEvent event) {
    }

}
