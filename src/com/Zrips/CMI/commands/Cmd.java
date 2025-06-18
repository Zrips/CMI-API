package com.Zrips.CMI.commands;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.FileHandler.ConfigReader;

public interface Cmd {
    public Boolean perform(CMI plugin, CommandSender sender, String[] args);

    void getExtra(ConfigReader c);
}
