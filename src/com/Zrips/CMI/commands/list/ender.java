package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ender implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eOpens players ender chest", args = "(playerName) (playerName)", tab = { "playerName", "playerName" }, regVar = { 0, 1, 2 }, consoleVar = { 2 }, customAlias = { "ce", "ec",
        "cend", "enderchest", "oe", "echest" }, others = true, explanation = { "cmi.command.ender.preventmodify - prevents inventory modifications", "cmi.enderedit - allows to edit opened inventory" })
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
