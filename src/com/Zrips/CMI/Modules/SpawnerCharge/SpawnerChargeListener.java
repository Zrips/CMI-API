package com.Zrips.CMI.Modules.SpawnerCharge;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class SpawnerChargeListener implements Listener {
    private CMI plugin;

    public SpawnerChargeListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockBreakEvent(BlockBreakEvent event) {
	
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void BlockPlaceEvent(BlockPlaceEvent event) {
    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL)
    public void BlockPlaceEventRange(BlockPlaceEvent event) {
	

    }
}
