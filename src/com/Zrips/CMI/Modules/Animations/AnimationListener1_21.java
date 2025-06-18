package com.Zrips.CMI.Modules.Animations;

import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDismountEvent;
import org.bukkit.event.entity.EntityMountEvent;

import com.Zrips.CMI.CMI;

public class AnimationListener1_21 implements Listener {
    private CMI plugin;

    public AnimationListener1_21(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void VehicleEnterEvent(EntityMountEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void VehicleExitEvent(EntityDismountEvent event) {
    }

    public static void process(Entity ent, Entity dismounted) {
    }
}
