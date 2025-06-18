package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class autorecharge implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 110, info = "&eToggle auto flight recharge", args = "(playerName) [exp/money/off/on] (-s)", tab = { "playername%%exp%%money%%off%%on",
        "exp%%money%%off%%on" }, explanation = {}, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
