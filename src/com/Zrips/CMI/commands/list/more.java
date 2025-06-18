package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class more implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 65, info = "&eFills item stack to maximum amount", args = "(playerName) (-clone/[amount])", tab = { "playername" }, explanation = { "&ePermissions:",
        " &6cmi.command.more.oversize &e- to get oversized stacks" }, regVar = { 0, 1, 2 }, consoleVar = { 1, 2 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
