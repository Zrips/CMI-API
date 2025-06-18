package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class maxplayers implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eChanges maximum amount of players who can connect to server", args = "[amount]", tab = { "maxplayers" }, explanation = { "&ePermissions: ",
        "&6cmi.fullserver.bypass &e- join full server" }, regVar = { 1 }, consoleVar = { 1 }, alias = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
