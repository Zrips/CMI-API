package com.Zrips.CMI.Modules.AttachedCommands;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class CustomNBTManager {

    private CMI plugin;

    public enum CustomNBTType {
	NBTCommands, CMILimitedUseCurrent, CMILimitedUseMax, CMISafeLimitedUse, CMILimitedLeftClick, CMIRepairMan, Add, Clear, Take, MoneyCheque, RandomId, CooldownId, Cooldown
    }

    public CustomNBTManager(CMI plugin) {
	this.plugin = plugin;
    }

    public ItemStack updateUsesLore(ItemStack item) {
	Integer uses = plugin.getNMS().getNBTInt(item, CustomNBTType.CMILimitedUseMax.name());
	if (uses == null)
	    return item;
	return updateUsesLore(item, uses);
    }

    public ItemStack clear(ItemStack iih) {
	iih = plugin.getNMS().setNBTInt(iih, CustomNBTType.CMILimitedUseMax.name(), null);
	iih = plugin.getNMS().setNBTInt(iih, CustomNBTType.CMISafeLimitedUse.name(), null);
	iih = plugin.getNMS().setNBTInt(iih, CustomNBTType.CMILimitedUseCurrent.name(), null);
	iih = plugin.getNMS().setNBTList(iih, CustomNBTType.NBTCommands.name(), null);
	iih = plugin.getNMS().setNBTInt(iih, CustomNBTType.Cooldown.name(), null);
	iih = plugin.getNMS().setNBTInt(iih, CustomNBTType.CooldownId.name(), null);
	return iih;
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
