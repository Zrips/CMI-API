package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class playercollision implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 70, info = "&eSet players collision mode", args = "(playerName) [true/false] (-s)", tab = { "playername", "true%%false", "-s%%" }, explanation = {}, regVar = { 0, 1, 2,
        3 }, consoleVar = { 1, 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
