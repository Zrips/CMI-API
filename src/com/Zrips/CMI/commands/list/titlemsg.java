package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class titlemsg implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSends title message to player", args = "[playerName/all] [title \n subtitle] (-in:[ticks]) (-out:[ticks]) (-keep:[ticks])", tab = {
        "playername" }, explanation = {}, regVar = { -100, -1 }, consoleVar = { -100, -1 }, ignoreHelpPage = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
