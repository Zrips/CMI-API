package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

public class AnimationColoredArmorListener implements Listener {
    private CMI plugin;

    public AnimationColoredArmorListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void leatherArmor(CMIArmorChangeEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void leatherArmor(PlayerJoinEvent event) {
    }
}
