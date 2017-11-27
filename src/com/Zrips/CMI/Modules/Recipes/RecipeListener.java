package com.Zrips.CMI.Modules.Recipes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.ItemStack;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.GUIManager.CmiInventoryType;

public class RecipeListener implements Listener {
    CMI plugin;

    public RecipeListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onNormalInventoryClose(InventoryCloseEvent event) {
    }
}
