package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class staffmsg implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 48, info = "&eSends message to staff channel", args = "[message/toggle/on/off]", tab = { "toggle%%on%%off" }, explanation = {}, regVar = { -100 }, consoleVar = {
        -100 }, ignoreHelpPage = true, others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    public static void sendStaffMsg(CommandSender sender, String senderName, String message) {
    }
}
