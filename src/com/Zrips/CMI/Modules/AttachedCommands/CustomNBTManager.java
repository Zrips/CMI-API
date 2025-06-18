package com.Zrips.CMI.Modules.AttachedCommands;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class CustomNBTManager {
    private CMI plugin;
    public static final String cdSpliter = null;
    public static final String leftClick = null;
    public static final String rightClick = null;
    public static final String consumeAction = null;
    public static final String silentAction = null;
    public static final String ignoreAction = null;

    public CustomNBTManager(CMI plugin) {
    }

    public ItemStack updateUsesLore(ItemStack item) {
        return null;
    }

    public ItemStack clear(ItemStack iih) {
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

    public enum CustomNBTType {
        NBTCommands, CMILimitedUseCurrent, CMILimitedUseMax, CMISafeLimitedUse, CMILimitedLeftClick, CMIRepairMan, Add, Clear, Take, CMICheque, MoneyCheque, RandomId, CooldownId, Cooldown, ItemCooldown;
    }
}
