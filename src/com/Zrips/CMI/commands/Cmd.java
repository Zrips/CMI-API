package com.Zrips.CMI.commands;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;

public interface Cmd {
    public boolean perform(CMI plugin, CommandSender sender, String[] args);

    void getExtra(ConfigReader c);
}
