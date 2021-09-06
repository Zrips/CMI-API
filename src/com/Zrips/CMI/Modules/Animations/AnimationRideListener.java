package com.Zrips.CMI.Modules.Animations;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Zrips.CMI.CMI;

public class AnimationRideListener implements Listener {

    private CMI plugin;

    public AnimationRideListener(CMI plugin) {
	this.plugin = plugin;
    }

}
