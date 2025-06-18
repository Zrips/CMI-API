package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class mailall implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 180, info = "&eCheck or send mail to all players", args = "[send/clear/remove] [message]", tab = { "send%%clear%%remove" }, explanation = {}, regVar = { -666 }, consoleVar = {
        -100 }, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private enum Action {
        Send, Clear, Remove;
    }
}
