package com.Zrips.CMI.Modules.InteractiveCommand;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class InteractiveCommandListener implements Listener {

    private CMI plugin;

    public InteractiveCommandListener(CMI plugin) {
	this.plugin = plugin;
    }


    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerInteractEvent(final PlayerInteractEvent event) {


    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerInteractAtEntityEvent(final PlayerInteractAtEntityEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void blockBreak(BlockBreakEvent event) {
	
    }

    @EventHandler
    public void onSignChangeEvent(SignChangeEvent event) {
	
    }
}
