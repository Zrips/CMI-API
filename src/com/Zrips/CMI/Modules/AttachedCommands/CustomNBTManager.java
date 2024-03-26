package com.Zrips.CMI.Modules.AttachedCommands;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.NBT.CMINBT;

public class CustomNBTManager {

    private CMI plugin;

    public enum CustomNBTType {
        NBTCommands,
        CMILimitedUseCurrent,
        CMILimitedUseMax,
        CMISafeLimitedUse,
        CMILimitedLeftClick,
        CMIRepairMan,
        Add,
        Clear,
        Take,
        CMICheque,
        @Deprecated
        MoneyCheque,
        RandomId,
        @Deprecated
        CooldownId,
        Cooldown,
        ItemCooldown
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
        iih = (ItemStack) new CMINBT(iih).setInt(CustomNBTType.CMILimitedUseMax.name(), null);
        iih = (ItemStack) new CMINBT(iih).setInt(CustomNBTType.CMISafeLimitedUse.name(), null);
        iih = (ItemStack) new CMINBT(iih).setInt(CustomNBTType.CMILimitedUseCurrent.name(), null);
        iih = (ItemStack) new CMINBT(iih).setInt(CustomNBTType.Cooldown.name(), null);
        iih = (ItemStack) new CMINBT(iih).setInt(CustomNBTType.RandomId.name(), null);
        iih = (ItemStack) new CMINBT(iih).setInt(CustomNBTType.CooldownId.name(), null);
        iih = (ItemStack) new CMINBT(iih).setInt(CustomNBTType.ItemCooldown.name(), null);
        iih = plugin.getNMS().setNBTList(iih, CustomNBTType.NBTCommands.name(), null);
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
