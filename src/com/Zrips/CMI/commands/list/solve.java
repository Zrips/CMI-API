package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class solve implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eSolve equation", args = "[equation]", explanation = {}, regVar = { 1 }, consoleVar = { 1 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
