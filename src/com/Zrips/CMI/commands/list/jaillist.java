package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class jaillist implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eList jails", args = "(jailName) (cellId)", tab = { "jail", "cellId" }, regVar = { 0, 1, 2 }, consoleVar = { 0, 1, 2 }, modules = "jail", others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static void showCellInfo(CommandSender sender, CMIJailCell cell) {
    }
}
