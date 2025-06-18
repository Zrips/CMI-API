package com.Zrips.CMI.commands.list;

import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Worth.WorthManager.worthType;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class sell implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 125, info = "&eSell items from inventory", args = "(all/blocks/hand/same/gui/material) (playerName) (-s)", tab = { "all%%blocks%%hand%%same%%gui%%playeritems%%playername",
        "playername", "-s" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static boolean sellingItems(CommandSender sender, Player player, worthType actionType, List<ItemStack> forPriceCheck, int amount, boolean silent, boolean removeItems) {
        return false;
    }
}
