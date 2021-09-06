package com.Zrips.CMI.Modules.MoneyCheque;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.NBT.CMINBT;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.AttachedCommands.CustomNBTManager.CustomNBTType;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Items.CMIMaterial;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import com.Zrips.CMI.events.CMIAnvilItemRenameEvent;
import net.Zrips.CMILib.Version.Version;

public class MoneyChequeListener implements Listener {
    private CMI plugin;

    public MoneyChequeListener(CMI plugin) {
	this.plugin = plugin;
    }

}
