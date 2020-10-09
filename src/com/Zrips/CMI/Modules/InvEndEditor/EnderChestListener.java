package com.Zrips.CMI.Modules.InvEndEditor;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class EnderChestListener implements Listener {
    private CMI plugin;

    public EnderChestListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onEnderChestClick(InventoryClickEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onEnderChestDrag(InventoryDragEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onNormalInventoryClose(InventoryCloseEvent event) {
    }
}
