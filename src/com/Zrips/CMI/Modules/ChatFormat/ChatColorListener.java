package com.Zrips.CMI.Modules.ChatFormat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.list.colorlimits.CMIColorTypes;

public class ChatColorListener implements Listener {
    private CMI plugin;

    public ChatColorListener(CMI plugin) {
	this.plugin = plugin;
    }
    
    
    @EventHandler(priority = EventPriority.NORMAL)
    public void cleanPublicChatFromColors(AsyncPlayerChatEvent event) {
    }
}
