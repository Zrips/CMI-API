package com.Zrips.CMI.Modules.Alias;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.CommandReg;

public class Allias extends CommandReg {

    public Allias(String command, CommandAlias alias) {
	super(command, alias);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	return true;
    }
}
