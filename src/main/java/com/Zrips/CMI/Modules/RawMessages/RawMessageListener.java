package com.Zrips.CMI.Modules.RawMessages;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.Zrips.CMI.CMI;

public class RawMessageListener implements Listener {
    CMI plugin;

    public RawMessageListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onShadowCommand(PlayerCommandPreprocessEvent event) {
    }
}
