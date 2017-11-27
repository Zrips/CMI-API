package com.Zrips.CMI.Modules.Anvil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.events.CMIAnvilItemRenameEvent;

public class AnvilListener implements Listener {
    private CMI plugin;

    List<UUID> instaBuild = new ArrayList<UUID>();

    public AnvilListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void CMIItemRenameEvent(CMIAnvilItemRenameEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onRespawn(PrepareAnvilEvent event) {

    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void InventoryClickEvent(InventoryClickEvent event) {

    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.NORMAL)
    public void InventoryCloseEvent(InventoryCloseEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PrepareAnvilEvent(PrepareAnvilEvent event) {

    }
}
