package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class statsedit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 257, info = "&eEdit players statistics", args = "(playerName) [add/take/set] [statistic] (subType) [amount] (-s)", tab = { "playername", "add%%take%%set", "statstype",
        "statssubtype" }, explanation = {}, regVar = { 3, 4, 5, 6 }, consoleVar = { 3, 4, 5, 6 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Set, Add, Take;
    }
}
