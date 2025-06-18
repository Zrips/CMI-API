package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tgod implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 170, info = "&eSet players temporarily god mode until relog or time end", args = "[playerName] &3(timeInSec) (-s)", tab = { "playername", "20", "-s" }, explanation = {
        "Examples:", "tgod Zrips 30 - god mode for the next 30 sec", "tgod Zrips 0 - god mode until relog", "tgod Zrips - check how long a player has tgod for, if at all." }, regVar = { 0, 1, 2,
            3 }, consoleVar = { 1, 2, 3 }, alias = true, modules = { "timedcommands" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
