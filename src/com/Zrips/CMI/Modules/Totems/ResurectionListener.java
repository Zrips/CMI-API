package com.Zrips.CMI.Modules.Totems;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Items.CMIMaterial;

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

    public static boolean haveTotem(Player player) {
        for (ItemStack one : player.getInventory().getContents()) {
            if (one == null)
                continue;
            if (!CMIMaterial.TOTEM_OF_UNDYING.equals(one.getType()))
                continue;
            return true;
        }
        return false;
    }

}
