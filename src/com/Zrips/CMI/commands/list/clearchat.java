package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class clearchat implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eClears chat", args = "(self) (-s)", explanation = { "Permission:", " &6cmi.command.clearchat.bypass &e- to ignore chat cleaning" }, multiTab = { "self,-s !-s" }, regVar = { 0,
        1 }, consoleVar = { 1 }, customAlias = "cc", others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
