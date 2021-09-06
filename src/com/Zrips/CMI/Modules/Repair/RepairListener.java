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
import net.Zrips.CMILib.NBT.CMINBT;
import com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager.CustomNBTType;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.events.CMIAnvilItemRepairEvent;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

public class RepairListener implements Listener {
    private CMI plugin;

    public RepairListener(CMI plugin) {
	this.plugin = plugin;
    }

}
