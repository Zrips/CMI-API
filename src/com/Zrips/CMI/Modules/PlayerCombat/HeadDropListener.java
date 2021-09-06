package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.block.Block;
import org.bukkit.block.Skull;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.NBT.CMINBT;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Totems.ResurectionListener;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Entities.CMIEntityType;
import net.Zrips.CMILib.Entities.MobHeadInfo;
import net.Zrips.CMILib.Items.CMIMaterial;

public class HeadDropListener implements Listener {
    private CMI plugin;

    public HeadDropListener(CMI plugin) {
	this.plugin = plugin;
    }

}
