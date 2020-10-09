package com.Zrips.CMI.Modules.ChatEditor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Zrips.CMI.CMI;

public class ChatEditorListener implements Listener {
    private CMI plugin;

    public ChatEditorListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void AsyncPlayerChatEvent(final AsyncPlayerChatEvent event) {
    }
}
