package com.Zrips.CMI.Modules.Totems;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class ResurectionListener implements Listener {
    private CMI plugin;

    public ResurectionListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void PlayerInteractEvent(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void EntityResurrectEventTotemUse(EntityResurrectEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onEntityResurrectEventTotemUse(EntityResurrectEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerDeathEvent(PlayerDeathEvent event) {
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

    public static boolean haveTotem(Player player) {
        return false;
    }

    private boolean removeTotemMainHand(Player player) {
        return false;
    }

    private ItemStack removeTotem(Player player) {
        return null;
    }
}
