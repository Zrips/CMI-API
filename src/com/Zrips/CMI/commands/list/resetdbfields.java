package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class resetdbfields implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eResets particular database columns to default value", args = "[columnName] (-w:[worldName]) (-p:[playerName])", tab = { "dbusercollumsshort", "%%-w:",
        "%%-p:" }, explanation = {}, regVar = { 666 }, consoleVar = { 1, 2, 3 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
