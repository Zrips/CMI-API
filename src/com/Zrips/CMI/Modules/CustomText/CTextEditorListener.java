package com.Zrips.CMI.Modules.CustomText;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

import com.Zrips.CMI.CMI;

public class CTextEditorListener implements Listener {
    private CMI plugin;

    public CTextEditorListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOW)
    public void AsyncPlayerChatEvent(final AsyncPlayerChatEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onShadowCommand(PlayerCommandPreprocessEvent event) {
    }
}
