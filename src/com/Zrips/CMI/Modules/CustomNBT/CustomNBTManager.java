package com.Zrips.CMI.Modules.CustomNBT;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.CustomText.CTextManager.ShadowCommandType;

public class CustomNBTManager {

    private CMI plugin;

    public enum CustomNBTType {
	NBTCommands, CMILimitedUseCurrent, CMILimitedUseMax, CMIRepairMan, Add, Clear, Take, MoneyCheque, RandomId
    }

    public CustomNBTManager(CMI plugin) {
	this.plugin = plugin;
    }

    public ItemStack updateUsesLore(ItemStack item) {
	return null;
    }

    public ItemStack updateRepairLore(ItemStack item, UUID uuid) {

	return null;
    }

    public ItemStack updateUsesLore(ItemStack item, int uses) {

	return null;
    }

    public String handleConsoleCommand(Player player, String cmd) {
	return null;
    }

}
