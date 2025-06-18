package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class tpall implements Cmd {
    private static CMITask sched;

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 40, info = "&eTeleports all online players to location", args = "(playerName)", tab = { "playername" }, explanation = {}, regVar = { 0, 1 }, consoleVar = { 1 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
