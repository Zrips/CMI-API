package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class PreviousName implements Listener {
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onJoin(PlayerJoinEvent event) {
    }
}
