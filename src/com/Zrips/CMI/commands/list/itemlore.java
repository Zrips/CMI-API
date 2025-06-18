package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class itemlore implements Cmd {
    public static final String indicator = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eChange items lore", args = "(-p:[playerName]) [linenumber/*] [remove/insert/ new lore line]", multiTab = {
        "-p:,[loreLine],*,[currentItemLore] [loreLine],*,![currentItemLore] ![currentItemLore]" }, explanation = {}, regVar = { -100 }, consoleVar = {
            -100 }, alias = true, customAlias = "!ilore", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
