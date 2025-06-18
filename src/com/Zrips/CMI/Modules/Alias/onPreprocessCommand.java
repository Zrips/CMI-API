package com.Zrips.CMI.Modules.Alias;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class onPreprocessCommand implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onCommand(PlayerCommandPreprocessEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onCommandSpy(PlayerCommandPreprocessEvent event) {
    }
}
