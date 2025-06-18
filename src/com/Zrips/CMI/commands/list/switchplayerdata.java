package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class switchplayerdata implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSwitch all data from one player to another", args = "[sourcePlayerName/uuid] [targetPlayerName/uuid]", explanation = {
        "Use UUID for more accurate transfers, especially when usernames matching each other" }, tab = { "playername" }, regVar = { 2 }, consoleVar = { 2 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
