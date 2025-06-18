package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class scavenge implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eRecycle item and its enchantments", args = "(playerName)", tab = { "playername" }, explanation = {}, regVar = { 0, 1, 2 }, consoleVar = {
        1 }, others = true, alias = true, customAlias = { "salvage", "recycle" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
