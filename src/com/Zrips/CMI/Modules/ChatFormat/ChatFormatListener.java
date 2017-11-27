package com.Zrips.CMI.Modules.ChatFormat;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class ChatFormatListener implements Listener {
    private CMI plugin;

    public ChatFormatListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEvent(AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEventMute(AsyncPlayerChatEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void AsyncPlayerChatEventPersonalMute(AsyncPlayerChatEvent event) {
    }
}
