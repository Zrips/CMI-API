package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class editwarnings implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eCheck player warnings", args = "(playerName/clearall) (clear)", tab = { "playername%%clearall", "clear%%" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2,
        3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum actions {
        delete, clear, clearall, list;
    }
}
