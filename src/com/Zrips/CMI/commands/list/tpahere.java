package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tpahere implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 40, info = "&eAsks player to accept teleportation to your location", args = "[playerName] (playerName) (-c)", tab = { "allPlayerName", "playername",
        "-c" }, explanation = {}, regVar = { 1, 2 }, consoleVar = { 2, 3 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
