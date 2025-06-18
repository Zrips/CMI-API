package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class walkspeed implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 140, info = "&eSet players walk speed from 0 to 5", args = "(playerName) [amount] (-s)", tab = { "playername" }, explanation = {}, regVar = { 1, 2, 3 }, consoleVar = { 2,
        3 }, customAlias = { "wspeed" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static double maxSpeed(CommandSender sender) {
        return 0.0;
    }
}
