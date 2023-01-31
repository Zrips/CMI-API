package com.Zrips.CMI.Modules.ChatFilter;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.Zrips.CMI.CMI;

public class ChatFilterListener implements Listener {
    private CMI plugin;

    public ChatFilterListener(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOW)
    public void capsFilter(final AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.LOW)
    public void AsyncPlayerChatEvent(final AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.LOW)
    public void spamFilter(AsyncPlayerChatEvent event) {

    }

    @EventHandler(priority = EventPriority.LOW)
    public void spamCommandFilter(PlayerCommandPreprocessEvent event) {

    }

    @EventHandler
    public void onSignChangeEventAdvertisement(SignChangeEvent event) {

    }
}
