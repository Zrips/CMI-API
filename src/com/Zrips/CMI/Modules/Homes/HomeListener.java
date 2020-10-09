package com.Zrips.CMI.Modules.Homes;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIBlock;
import com.Zrips.CMI.Containers.CMILocation;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class HomeListener implements Listener {
    private CMI plugin;

    public HomeListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEnderChestClick(final PlayerInteractEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void bedBreak(BlockBreakEvent event) {
    }
}
