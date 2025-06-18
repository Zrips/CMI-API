package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class entityinfo implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eCheck entity information", args = "(playername)", multiTab = { "[playername]" }, regVar = { 0, 1 }, consoleVar = { 1 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
