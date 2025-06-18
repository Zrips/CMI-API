package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.spigotmc.event.entity.EntityDismountEvent;

import com.Zrips.CMI.CMI;

public class AnimationListenerLegacy implements Listener {
    private CMI plugin;

    public AnimationListenerLegacy(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void VehicleExitEvent(EntityDismountEvent event) {
    }
}
