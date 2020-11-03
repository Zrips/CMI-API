package com.Zrips.CMI.Modules.AStand;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class ArmorStandListener implements Listener {
    private CMI plugin;

    public ArmorStandListener(CMI plugin) {
	this.plugin = plugin;
    }

    public static HashMap<UUID, ArmorStandCopy> acMap = new HashMap<UUID, ArmorStandCopy>();

    @EventHandler
    public void onBlockInteract(PlayerInteractEvent event) {


    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
	
    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
	
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onArmorStandDeath(EntityDeathEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void editorCheck(PlayerInteractAtEntityEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void armorStandSpawnEvent(final org.bukkit.event.entity.CreatureSpawnEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void vanillaBugFix(final PlayerInteractAtEntityEvent event) {
	
    }
}
