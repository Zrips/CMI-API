package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class ignore implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eIgnores player", args = "(playerName/uuid/all) (-p:[playerName])", tab = { "playername%%all" }, explanation = {
        "cmi.command.ignore.bypass - to bypass ignore list" }, regVar = { 0, 1, 2 }, consoleVar = { 1, 2 }, customAlias = { "!ignorelist" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
