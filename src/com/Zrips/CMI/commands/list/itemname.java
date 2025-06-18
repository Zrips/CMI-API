package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class itemname implements Cmd {
    public static final String indicator = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eRename items", args = "(-p:[playerName]) [remove/your new item name]", multiTab = { "[currentItemName]" }, regVar = { -100 }, consoleVar = { -100 }, alias = true, customAlias = {
        "!iname", "rename" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
