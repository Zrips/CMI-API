package com.Zrips.CMI.commands.list;

import java.util.HashMap;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.BasicRecipe;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.CondenseResult;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class condense implements Cmd {
    private static HashMap<ItemStack, BasicRecipe> cache;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eCondense items into blocks", args = "(itemName) (playerName) (-s)", multiTab = { "[itemname] [playerName] -s" }, regVar = { 0, 1, 2 }, consoleVar = { 1, 2,
        3 }, others = true, customAlias = { "compact" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static void clearCache() {
    }

    private CondenseResult condenseStack(CMIUser user, ItemStack stack, boolean validate) {
        return null;
    }

    private BasicRecipe getPossibleCondense(ItemStack stack, boolean backwards) {
        return null;
    }
}
