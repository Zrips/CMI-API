package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class cartographytable implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 121, info = "&eOpen cartography table", args = "(playerName) (-s)", tab = { "playername", "%%-s" }, explanation = {}, regVar = { 0, 1, 2 }, consoleVar = { 1, 2 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
