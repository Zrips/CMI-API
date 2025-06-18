package com.Zrips.CMI.Modules.Alias;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.RemoteServerCommandEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class onServerPreprocessCommand implements Listener {
    @EventHandler(priority = EventPriority.NORMAL)
    public void onConsoleCommand(ServerCommandEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void RemoteServerCommandEvent(RemoteServerCommandEvent event) {
    }
}
