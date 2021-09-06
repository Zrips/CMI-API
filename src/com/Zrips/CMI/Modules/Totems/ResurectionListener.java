package com.Zrips.CMI.Modules.Totems;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityResurrectEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Locale.LC;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Items.CMIMaterial;
import com.Zrips.CMI.Modules.Totems.TotemManager.BossBarType;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;

public class ResurectionListener implements Listener {
    private CMI plugin;

    public ResurectionListener(CMI plugin) {
	this.plugin = plugin;
    }

}
