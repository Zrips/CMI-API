package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tfly implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 75, info = "&eSet temporary players fly mode until relog or until time ends", args = "(playerName) (timeInSec) (-s)", tab = { "playername", "+10", "-s" }, explanation = {
        "Examples:", "tfly Zrips 30 - fly mode for the next 30 sec", "tfly Zrips +30 - adds fly mode for an additional 30 sec", "tfly Zrips 0 - fly mode until relog",
        "tfly Zrips - check if player have tfly mode enabled and until when" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2, 3 }, alias = true, modules = { "timedcommands" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
