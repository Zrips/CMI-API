package com.Zrips.CMI.Modules.ChatFormat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Zrips.CMI.CMI;

public class ChatFormatListener implements Listener {
    private CMI plugin;

    public ChatFormatListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEvent(final AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEventMute(AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEventShadowMute(AsyncPlayerChatEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEventPersonalMute(AsyncPlayerChatEvent event) {
    }

}
