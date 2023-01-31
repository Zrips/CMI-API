package com.Zrips.CMI.Modules.InteractiveCommand;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class InteractiveCommandListener1_8 implements Listener {

    private CMI plugin;

    public InteractiveCommandListener1_8(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerInteractAtEntityEvent(final PlayerInteractAtEntityEvent event) {

    }
}
