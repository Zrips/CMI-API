package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class InteractiveCommandListener implements Listener {

    private CMI plugin;

    public InteractiveCommandListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerInteractEvent(PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerInteractAtEntityEvent(PlayerInteractAtEntityEvent event) {
    }
}
