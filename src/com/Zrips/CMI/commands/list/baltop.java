package com.Zrips.CMI.commands.list;

import java.util.Set;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class baltop implements Cmd {
    public static Set<CommandSender> cc;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eCheck top money list", args = "(playerName)", tab = { "playername" }, regVar = { 0, 1, 2 }, consoleVar = { 0, 1, 2 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
