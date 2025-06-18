package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class smite implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eStrike ground or player with lightning", args = "(playerName/location) (-safe) (-s)", tab = { "playername", "-safe", "-s" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2,
        3 }, customAlias = { "lightning", "thor" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
