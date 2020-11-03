package com.Zrips.CMI.Modules.Totems;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Totems.TotemManager.BossBarType;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;

public class ResurectionListener implements Listener {
    private CMI plugin;

    public ResurectionListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void EntityResurrectEvent(EntityResurrectEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerInteractEvent(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void EntityResurrectEventTotemUse(EntityResurrectEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EntityDamageByEntityEvent(EntityDamageByEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void EntityDamageByEntityEventWarmup(EntityDamageByEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void EntityDamageEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void EntityDamageEventWarmup(EntityDamageEvent event) {
	
    }

}
