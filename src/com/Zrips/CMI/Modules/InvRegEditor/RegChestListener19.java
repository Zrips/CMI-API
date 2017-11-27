package com.Zrips.CMI.Modules.InvRegEditor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

import com.Zrips.CMI.CMI;

public class RegChestListener19 implements Listener {
    CMI plugin;

    public RegChestListener19(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryClickSlave(PlayerSwapHandItemsEvent event) {
    }
}
