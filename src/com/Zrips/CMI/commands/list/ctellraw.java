package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ctellraw implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSend tellraw type message", args = "[playerName/all] [formattedMessage]", explanation = {
        "Usage is same as shown in https://www.zrips.net/cmi/custom-text/ aka customtext command" }, multiTab = { "[playername],all" }, regVar = { -100 }, consoleVar = {
            -100 }, ignoreHelpPage = true, others = false, asyncSupported = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
