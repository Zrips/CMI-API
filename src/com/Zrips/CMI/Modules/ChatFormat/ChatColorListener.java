package com.Zrips.CMI.Modules.ChatFormat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Zrips.CMI.CMI;

public class ChatColorListener implements Listener {
    private CMI plugin;

    public ChatColorListener(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void cleanPublicChatFromColors(AsyncPlayerChatEvent event) {

    }
}
