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

    @EventHandler(priority = EventPriority.NORMAL)
    public void onCommandLowest(PlayerCommandPreprocessEvent event) {
    }

    // Needs to be above NORMAL due to alias listener modifying command
    @EventHandler(priority = EventPriority.HIGH)
    public void onCommand(PlayerCommandPreprocessEvent event) {
    }

}
