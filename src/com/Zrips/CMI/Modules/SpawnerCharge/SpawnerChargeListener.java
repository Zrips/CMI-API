package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.Random;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import net.Zrips.CMILib.Locale.LC;
import net.Zrips.CMILib.Items.CMIMaterial;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.ActionBar.CMIActionBar;

public class SpawnerChargeListener implements Listener {
    private CMI plugin;

    public SpawnerChargeListener(CMI plugin) {
	this.plugin = plugin;
    }

}
