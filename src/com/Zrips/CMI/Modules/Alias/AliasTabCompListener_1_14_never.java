package com.Zrips.CMI.Modules.Alias;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;
import org.bukkit.event.server.TabCompleteEvent;

public class AliasTabCompListener_1_14_never implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerCommandSendEvent(PlayerCommandSendEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerChatTabCompleteEvent(TabCompleteEvent event) {
    }
}
