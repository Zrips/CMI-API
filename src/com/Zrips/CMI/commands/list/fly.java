package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class fly implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSet players fly true or false", args = "[playerName] (true/false) (-s)", tab = { "playername", "true%%false" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2, 3 }, others = true)
    public Boolean perform(CMI pl, CommandSender sender, String[] args) {
        return null;
    }
}
