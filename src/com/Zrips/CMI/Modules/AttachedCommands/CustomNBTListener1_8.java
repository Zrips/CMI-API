package com.Zrips.CMI.Modules.AttachedCommands;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class CustomNBTListener1_8 implements Listener {
    private CMI plugin;

    public CustomNBTListener1_8(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerInteractAtEntityCommand(PlayerInteractAtEntityEvent event) {
    }
}
