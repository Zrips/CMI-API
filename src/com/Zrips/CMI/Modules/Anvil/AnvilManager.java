package com.Zrips.CMI.Modules.Anvil;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmdWarmUp.CmdWarmUp;

public class AnvilManager {
    public HashMap<String, CmdWarmUp> cooldowns = new HashMap<String, CmdWarmUp>();

    CMI plugin;

    public AnvilManager(CMI plugin) {
	this.plugin = plugin;
    }

    public int getRepairCost(ItemStack source, ItemStack source2, ItemStack result) {
	return 0;
    }

}
