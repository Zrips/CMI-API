package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class flyspeed implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSet players fly speed from 0 to 10", args = "(playerName) [amount] (-s)", tab = { "playername" }, regVar = { 1, 2, 3 }, consoleVar = { 2, 3 }, customAlias = {
        "fspeed" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static double maxSpeed(CommandSender sender) {
        return 0.0;
    }
}
