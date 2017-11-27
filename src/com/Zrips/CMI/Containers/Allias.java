package com.Zrips.CMI.Containers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Allias extends CommandReg {

    public Allias(String command) {
	super(command);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	return true;
    }
}
