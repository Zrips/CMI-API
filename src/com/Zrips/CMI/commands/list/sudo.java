package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class sudo implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 70, info = "&eForce another player to perform command", args = "[playerName] (command/c:[text])", tab = { "playername", "c:" }, explanation = {
        "cmi.command.sudo.bypass - protects player from being 'trolled'" }, regVar = { -100, -1 }, consoleVar = { -100, -1 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
