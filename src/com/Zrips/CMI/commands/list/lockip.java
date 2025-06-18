package com.Zrips.CMI.commands.list;

import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class lockip implements Cmd {
    private Pattern pattern;
    private static final String IPADDRESS_PATTERN = null;

    public boolean isValid(String ip) {
        return false;
    }

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(priority = 240, info = "&ePrevents logging into account from different ip", args = "(playername) [add/remove/list/clear] [ip]", tab = { "playername",
        "add%%remove%%list%%clear" }, explanation = {}, regVar = { 0, 1, 2, 3 }, consoleVar = { 2, 3 }, alias = true, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
