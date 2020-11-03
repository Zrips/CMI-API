package com.Zrips.CMI.Modules.NickName;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import com.Zrips.CMI.CMI;

public class NickNameListener implements Listener {
    private CMI plugin;

    public NickNameListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerLoginEvent(PlayerLoginEvent event) {

    }

    @EventHandler(priority = EventPriority.LOW)
    public void cleanPublicChatFromColors(AsyncPlayerChatEvent event) {

    }

    public static String processGradientChat(Player player, String message) {

	return null;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void AsyncPlayerChatEventRawConverter(AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void AsyncPlayerChatEventExtra(AsyncPlayerChatEvent event) {

    }
}
