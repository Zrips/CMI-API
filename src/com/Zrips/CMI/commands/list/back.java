package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class back implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eTeleports back to last saved location", args = "(playerName) (-s)", tab = { "playername", "-s%%" }, regVar = { 0, 1, 2 }, consoleVar = { 1, 2 }, customAlias = {
        "cback" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private Boolean localTeleport(CMIUser user, CommandSender sender, boolean silent) {
        return null;
    }
}
