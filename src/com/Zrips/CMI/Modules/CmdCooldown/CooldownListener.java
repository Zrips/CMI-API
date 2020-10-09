package com.Zrips.CMI.Modules.CmdCooldown;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import com.Zrips.CMI.CMI;

public class CooldownListener implements Listener {

    private CMI plugin;

    public CooldownListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onCommand(PlayerCommandPreprocessEvent event) {
    }

}
