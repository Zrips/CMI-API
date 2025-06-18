package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tp implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 40, info = "&eTeleports to player's location", args = "[playerName] (playerName)", tab = { "allPlayerName", "playername" }, regVar = { 1, 2 }, consoleVar = {
        2 }, others = true, redirectClass = tpa.class)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
