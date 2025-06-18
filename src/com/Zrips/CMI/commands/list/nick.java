package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class nick implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eChanges player name", args = "[newNickName/off] (playerName) (-s)", tab = { "fullNickName%%off", "playerName", "-s" }, explanation = {
        "To change into different nick name: cmi.command.nick.different", "To bypass length protection use cmi.command.nick.bypass.length" }, regVar = { 1, 2, 3 }, consoleVar = { 2, 3 }, others = true)
    public Boolean perform(CMI pl, CommandSender sender, String[] args) {
        return null;
    }
}
