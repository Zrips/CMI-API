package com.Zrips.CMI.commands.list;

import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class repaircost implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eCheck items repair cost", args = "(hand/armor/all) (playerName)", multiTab = { "hand,armor,all [playername]" }, regVar = { 0, 1, 2 }, consoleVar = { 1,
        2 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static List<ItemStack> getItems(ItemStack[] i) {
        return null;
    }
}
