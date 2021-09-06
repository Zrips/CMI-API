package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Config;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.Items.CMIItemStack;
import net.Zrips.CMILib.Items.CMIMaterial;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;
import net.Zrips.CMILib.Version.Version;

public class SpawnerActionsListener implements Listener {
    private CMI plugin;

    public SpawnerActionsListener(CMI plugin) {
	this.plugin = plugin;
    }

}
