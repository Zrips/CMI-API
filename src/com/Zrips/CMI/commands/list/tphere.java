package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tphere implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 50, info = "&eTeleports player to your location", args = "[playerName] (playerName) (-s)", tab = { "allPlayerName", "playername", "-s" }, regVar = { 1, 2 }, consoleVar = {
        2 }, others = true, redirectClass = tpahere.class)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
