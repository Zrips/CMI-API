package com.Zrips.CMI.commands;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.FileHandler.ConfigReader;

public interface Cmd {
    public Boolean perform(CMI plugin, CommandSender sender, String[] args);

    void getExtra(ConfigReader c);
}
