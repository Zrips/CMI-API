package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class maintenance implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eSet server into maintenance mode", args = "(true/false) (message)", tab = { "true%%false" }, explanation = {
        "cmi.command.maintenance.bypass - to bypass maintenance mode" }, regVar = { -66 }, consoleVar = { -66 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
