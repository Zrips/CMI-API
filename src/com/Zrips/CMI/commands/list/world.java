package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class world implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eTeleports to different world", args = "(normal/nether/end/1/2/3...) (playerName) (-s)", tab = { "normal%%nether%%end%%worlds" }, explanation = {
        "Requires cmi.command.world.[worldName] in addition to base permission node" }, regVar = { 0, 1, 2, 3 }, consoleVar = { 1, 2, 3 }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
