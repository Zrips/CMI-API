package com.Zrips.CMI.Modules.AttachedCommands;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.NBT.CMINBT;

public class CustomNBTManager {

    private CMI plugin;

    public enum CustomNBTType {
	NBTCommands, CMILimitedUseCurrent, CMILimitedUseMax, CMISafeLimitedUse, CMILimitedLeftClick, CMIRepairMan, Add, Clear, Take, MoneyCheque, RandomId, @Deprecated
	CooldownId, Cooldown, ItemCooldown
    }

    public static final String cdSpliter = ":";

    public static final String leftClick = "!left!";
    public static final String rightClick = "!right!";
    public static final String consumeAction = "!consume!";
    public static final String silentAction = "!silent!";
    public static final String ignoreAction = "!ignore!";

    public CustomNBTManager(CMI plugin) {
	this.plugin = plugin;
    }

    public ItemStack updateUsesLore(ItemStack item) {
	Integer uses = new CMINBT(item).getInt(CustomNBTType.CMILimitedUseMax.name());
	if (uses == null)
	    return item;
	return updateUsesLore(item, uses);
    }

    public ItemStack clear(ItemStack iih) {
	
	return iih;
    }

    public ItemStack updateRepairLore(ItemStack item, UUID uuid) {


	return item;
    }

    public ItemStack updateUsesLore(ItemStack item, int uses) {

	return item;
    }

    public String handleConsoleCommand(Player player, String cmd) {
	
	return cmd;
    }

}
