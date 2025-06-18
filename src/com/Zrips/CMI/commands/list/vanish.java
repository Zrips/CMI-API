package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class vanish implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 120, info = "&eVanish player", args = "(playerName/list) (on/off) (-s)", tab = { "playername%%list", "on%%off", "-s" }, explanation = {}, regVar = { 0, 1, 2, 3 }, consoleVar = {
        1, 2, 3 }, customAlias = { "v" }, modules = { "vanish" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
