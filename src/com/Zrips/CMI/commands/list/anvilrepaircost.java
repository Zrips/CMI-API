package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class anvilrepaircost implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 280, info = "&eSet items repair cost", args = "(playerName) [amount]", tab = { "playername" }, explanation = { "Example:", "/repaircost 10", "/repaircost set 10",
        "/repaircost add 10", "/repaircost take 10", "/repaircost Zrips clear", "/repaircost Zrips add 10" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 2, 3 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Set, Add, Clear, Take, None;
    }
}
