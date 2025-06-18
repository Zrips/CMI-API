package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class inv implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eOpens players inventory", args = "[playerName]", tab = { "playername" }, explanation = { "cmi.command.inv.preventmodify - prevents inventory editing",
        "cmi.invedit - allows to edit inventory", "cmi.command.inv.location - shows players location" }, regVar = { 1 }, consoleVar = { 666 }, customAlias = { "cinv", "invsee", "oi" }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
