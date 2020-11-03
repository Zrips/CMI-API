package com.Zrips.CMI.commands;

import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.FileHandler.ConfigReader;

public class Void implements Cmd {

    @Override
    public void getExtra(ConfigReader c) {
    }

    @Override
    @CAnnotation(others = false)
    public Boolean perform(CMI plugin, CommandSender sender, String[] args) {
	return true;
    }

}
