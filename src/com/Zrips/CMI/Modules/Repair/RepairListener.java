package com.Zrips.CMI.Modules.Repair;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager.CustomNBTType;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.events.*;

public class RepairListener implements Listener {
    private CMI plugin;

    public RepairListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIAnvilItemRepairEvent(CMIAnvilItemRepairEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerPickupItemEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerItemHeldEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void CMIArmorChangeEvent(CMIArmorChangeEvent event) {

    }

}
