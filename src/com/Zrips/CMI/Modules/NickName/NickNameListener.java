package com.Zrips.CMI.Modules.NickName;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerLoginEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;
import com.Zrips.CMI.commands.list.colorlimits.CMIColorTypes;
import com.Zrips.CMI.utils.RawMessage;

import java.util.Arrays;
import java.util.regex.Matcher;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class NickNameListener implements Listener {
    private CMI plugin;

    public NickNameListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerLoginEvent(PlayerLoginEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void cleanPublicChatFromColors(AsyncPlayerChatEvent event) {
	
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void AsyncPlayerChatEventRawConverter(AsyncPlayerChatEvent event) {
	
    }
}
