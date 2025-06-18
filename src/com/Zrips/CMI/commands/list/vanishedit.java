package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class vanishedit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 120, info = "&eEdit vanish mode for player", args = "(playerName) (action) (true/false)", tab = { "playername", "vanishAction", "true%%false" }, explanation = {}, regVar = { 0,
        1, 2, 3 }, consoleVar = { 666 }, modules = "vanish", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
