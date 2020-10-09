package com.Zrips.CMI.Modules.Alias;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import com.Zrips.CMI.CMI;

public class onPreprocessCommand implements Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    public void onCommand(PlayerCommandPreprocessEvent event) {


    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onCommandSpy(PlayerCommandPreprocessEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerQuitEvent(PlayerQuitEvent event) {
    }
}
