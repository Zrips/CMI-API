package com.Zrips.CMI.commands.list;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.Cmd;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public class sit implements Cmd {
    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(info = "&eSit in your position", args = "(playerName) (-persistent) (-s) (location) (on/off)", regVar = { 0, 1, 2, 3, 4, 5 }, consoleVar = { 1, 2, 3, 4, 5 }, multiTab = {
        "[playerName],!-persistent,-s !-persistent,!-s !-s" }, alias = true, modules = "sitanimation", others = true)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
        return null;
    }
}
