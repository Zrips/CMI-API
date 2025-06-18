package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class hat implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&ePlace item like hat", args = "(playerName)", tab = { "playername" }, regVar = { 0, 1, 2 }, consoleVar = { 666 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static Boolean checkHatItem(Player player, ItemStack iih) {
        return null;
    }

    public static boolean isHelmet(ItemStack item) {
        return false;
    }
}
