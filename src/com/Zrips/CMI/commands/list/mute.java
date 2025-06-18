package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class mute implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 240, info = "&eMute player", args = "[playerName] (time) (-s) (reason)", tab = { "playername", "1m%%", "-s%%" }, explanation = { "Examples: ", "/cmi mute zrips 1m",
        "/cmi mute zrips +30s", "/cmi mute zrips -15m", "/cmi mute zrips 1h", "/cmi mute zrips 1h For swearing" }, regVar = { -100 }, consoleVar = { -100 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
