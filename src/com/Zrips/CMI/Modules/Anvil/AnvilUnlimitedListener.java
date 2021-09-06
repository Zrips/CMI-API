package com.Zrips.CMI.Modules.Anvil;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class AnvilUnlimitedListener implements Listener {
    private CMI plugin;

    HashMap<UUID, ItemStack> instaBuild = new HashMap<UUID, ItemStack>();

    public AnvilUnlimitedListener(CMI plugin) {
	this.plugin = plugin;
    }
    
}
