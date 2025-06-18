package com.Zrips.CMI.Modules.AStand;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class ArmorStandListener implements Listener {
    private CMI plugin;
    public static HashMap<UUID, ArmorStandCopy> acMap;

    public ArmorStandListener(CMI plugin) {
    }

    @EventHandler
    public void onBlockInteract(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onArmorStandDeath(EntityDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void armorStandSpawnEvent(org.bukkit.event.entity.CreatureSpawnEvent event) {
    }

    private Boolean processArmorStand(Player player, Entity ent) {
        return null;
    }
}
