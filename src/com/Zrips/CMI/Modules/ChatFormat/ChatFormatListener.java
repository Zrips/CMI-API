package com.Zrips.CMI.Modules.ChatFormat;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.ChatFilter.ChatFilterRule;

public class ChatFormatListener implements Listener {
    private CMI plugin;
    private ChatFilterRule whiteRules;
    public static HashMap<UUID, Long> shouts;

    public ChatFormatListener(CMI plugin) {
    }

    private static void onAsyncPlayerChatRoomEvent(AsyncPlayerChatEvent event) {
    }

    private void onAsyncPlayerStaffRoomEvent(AsyncPlayerChatEvent event) {
    }

    private void onAsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
    }

    private void AsyncPlayerChatEventMute(AsyncPlayerChatEvent event) {
    }

    public void AsyncPlayerChatEventShadowMute(AsyncPlayerChatEvent event) {
    }

    public void AsyncPlayerChatEventPersonalMute(AsyncPlayerChatEvent event) {
    }

    public static String processGradientChat(Player player, String message) {
        return null;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void AsyncPlayerChatEventRawConverter(AsyncPlayerChatEvent event) {
    }

    private void sendBungee(Player player, String message, Set<Player> set) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void AsyncPlayerChatEventBungee(AsyncPlayerChatEvent event) {
    }
}
