package com.Zrips.CMI.Modules.AttachedCommands;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIEquipmentSlot;

public class CustomNBTListener implements Listener {
    private CMI plugin;

    public CustomNBTListener(CMI plugin) {
	this.plugin = plugin;
    }

    private static HashMap<UUID, Long> timer = new HashMap<UUID, Long>();

    private static HashMap<UUID, HashMap<Integer, itemCooldown>> cooldownMap = new HashMap<UUID, HashMap<Integer, itemCooldown>>();

    public static void clearCache(UUID uuid) {
	timer.remove(uuid);
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerInteractCommand(PlayerInteractEvent event) {
    }

    private static boolean processInteract(Player player, Player interactedPlayer, CMIEquipmentSlot hand, Action action) {

	return false;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerInteractAtEntityCommand(PlayerInteractAtEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerConsumeEvent(PlayerItemConsumeEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerInteractAtEntityDamageCommand(EntityDamageByEntityEvent event) {

    }

}
