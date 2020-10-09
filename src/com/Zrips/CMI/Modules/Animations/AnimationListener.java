package com.Zrips.CMI.Modules.Animations;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class AnimationListener implements Listener {

    private CMI plugin;

    public AnimationListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerMoveEvent(org.bukkit.event.vehicle.VehicleMoveEvent event) {
    }
}
