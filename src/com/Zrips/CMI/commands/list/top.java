package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class top implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 150, info = "&eTeleport to highest point at your location", args = "[playerName] (-s)", tab = { "playername" }, explanation = {}, regVar = { 0, 1, 2 }, consoleVar = { 1,
        2 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static <T extends Number> double abs(T num) {
        return 0.0;
    }
}
