package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class skin implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eChanges players skin", args = "[skinName/off/update] (playerName) (-s)", tab = { "allPlayerName", "playername", "-s" }, explanation = {}, regVar = { 1, 2,
        3 }, consoleVar = { 2, 3 }, others = true, modules = "skin")
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
