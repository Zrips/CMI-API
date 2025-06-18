package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class jail implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eJail player for time period", args = "[playerName] (time) (jailName) (cellId) (-s) (r:jail_reason)", tab = { "playername", "5m%%", "jail", "cellId",
        "r:" }, explanation = {}, regVar = { -100 }, consoleVar = { -100 }, modules = "jail", others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
