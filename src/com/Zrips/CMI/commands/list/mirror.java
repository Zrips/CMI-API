package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class mirror implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 65, info = "&eStarts block place/break mirroring.", args = "(start/stop)", tab = {}, explanation = {}, regVar = { 0, 1 }, consoleVar = {
        666 }, others = false, modules = "mirror")
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
