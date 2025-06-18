package com.Zrips.CMI.Modules.EventActions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

import com.Zrips.CMI.CMI;

public class EventActionListener1_12 implements Listener {
    private CMI plugin;
    static boolean existingMethod;

    public EventActionListener1_12(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void PlayerAdvancementDoneEvent(PlayerAdvancementDoneEvent event) {
    }
}
