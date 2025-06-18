package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class broadcast implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSends special message to all players", args = "(!) [message] (-w:[worldName,worldName]) (-r:[range]) (-c:[world;x;y;z])", explanation = {
        "If message starts with ! then clean message will be shown", "Worlds can be defined to broadcast messages only in those worlds" }, regVar = { -100 }, consoleVar = {
            -100 }, ignoreHelpPage = true, others = false, customAlias = { "bc" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
