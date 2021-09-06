package com.Zrips.CMI.Modules.Worth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.GUI.CMIGUICloseEvent;
import net.Zrips.CMILib.GUI.CMIGui;
import net.Zrips.CMILib.GUI.GUIManager.CmiInventoryType;
import net.Zrips.CMILib.Locale.LC;

public class WorthListener implements Listener {
    private CMI plugin;

    public WorthListener(CMI plugin) {
	this.plugin = plugin;
    }

}
