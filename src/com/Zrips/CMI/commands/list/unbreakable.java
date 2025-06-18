package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class unbreakable implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 67, info = "&eMakes item unbreakable", args = "(playerName) (true/false) (-o)", tab = { "playerName%%true%%false", "true%%false", "-o" }, explanation = {}, regVar = { 0, 1, 2,
        3 }, consoleVar = { 1, 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
