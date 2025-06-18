package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class msg implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSends message to player", args = "[playerName] [message]", tab = { "playername" }, explanation = {
        "If message starts with ! then clean message without sender name will be shown", "Requires cmi.command.msg.clean permission",
        "If message starts with !- then clean message without sender name will be shown and without option to reply", "Requires cmi.command.msg.noreply permission" }, regVar = { -100, -1 }, consoleVar = {
            -100, -1 }, ignoreHelpPage = true, others = false, customAlias = { "w" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
