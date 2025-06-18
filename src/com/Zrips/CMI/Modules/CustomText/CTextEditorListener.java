package com.Zrips.CMI.Modules.CustomText;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.Zrips.CMI.CMI;

public class CTextEditorListener implements Listener {
    private CMI plugin;

    public CTextEditorListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void AsyncPlayerChatEvent(AsyncPlayerChatEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onShadowCommand(PlayerCommandPreprocessEvent event) {
    }
}
