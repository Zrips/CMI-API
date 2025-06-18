package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class tempban implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eTempBan player", args = "[playerName] [timeValue] (reason) (-s)", tab = { "playername" }, explanation = {
        "Ban max range depends on cmi.command.tempban.max.[amount]", "cmi.command.tempban.max.unlimited - allows to ban for as much as you want",
        "In case player doesn't have any, 60 sec will be max value", "Example: ", "/cmi tempban zrips 5m For swearing" }, regVar = { -100 }, consoleVar = { -100 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
