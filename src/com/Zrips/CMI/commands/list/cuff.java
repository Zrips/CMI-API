package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class cuff implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSuspends players actions", args = "[playername] (true/false) (-s)", multiTab = { "[playername] true,false -s" }, regVar = { 1, 2, 3 }, consoleVar = { 1, 2,
        3 }, alias = true, customAlias = { "!+false:uncuff", "freeze" }, modules = { "cuffed" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
