package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class shoot implements Cmd {
    public static final String shootident = null;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 120, info = "&eShoot projectile", args = "(playerName) (-t:targetPlayer) (type) (speed)", tab = { "playername%%projectiletype%%cleanEntityType",
        "-t:%%projectiletype%%cleanEntityType", "projectiletype%%cleanEntityType" }, explanation = {}, regVar = { 0, 1, 2, 3, 4 }, consoleVar = { 1, 2, 3, 4 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
