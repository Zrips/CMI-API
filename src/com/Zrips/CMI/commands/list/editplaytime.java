package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class editplaytime implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eEdit players playtime", args = "(playerName) [add/take/set] [amount] (-s)", tab = { "playername", "add%%take%%set" }, explanation = {}, regVar = { 3, 4 }, consoleVar = { 3,
        4 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Set, Add, Take;
    }
}
