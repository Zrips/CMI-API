package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class mail implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 180, info = "&eSend and receive mail", args = "[send/clear/read/sendtemp] [playerName] (time) (message)", tab = { "send%%clear%%read%%sendtemp",
        "playername" }, explanation = {}, regVar = { -666 }, consoleVar = { -100 }, others = true, subIgnoreHelpPage = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        List, Send, SendTemp, Clear, Remove;
    }
}
