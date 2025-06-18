package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class resetback implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eResets players back location", args = "(playerName) (reason) (-death) (-s)", tab = { "playername", "-s%%-death" }, regVar = { -666 }, consoleVar = { -100 }, customAlias = {
        "rback" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
