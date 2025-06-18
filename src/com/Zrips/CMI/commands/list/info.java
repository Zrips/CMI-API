package com.Zrips.CMI.commands.list;

import java.util.regex.Pattern;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class info implements Cmd {
    Pattern patern;

    @Override
    public void getExtra(ConfigReader c) {
    }

    private static String getColor(boolean state) {
        return null;
    }

    @Override
    @CAnnotation(info = "&eShow players information", args = "[playerName/uuid]", tab = { "playername" }, regVar = { -66 }, consoleVar = { -100 }, customAlias = { "whois" }, others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }

    private static String toTppos(boolean hasPerm, Location loc) {
        return null;
    }

    private static String toTppos(boolean hasPerm, String worldName, double x, double y, double z) {
        return null;
    }

    private static String replace(String msg, String target, Object with) {
        return null;
    }
}
