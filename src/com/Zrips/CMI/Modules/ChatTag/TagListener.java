package com.Zrips.CMI.Modules.ChatTag;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;

import com.Zrips.CMI.CMI;

public class TagListener implements Listener {
    private CMI plugin;

    public TagListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerChatTabCompleteEvent(PlayerChatTabCompleteEvent event) {
    }
}
