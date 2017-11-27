package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class CommandAlias {

    private boolean state;
    private List<String> commands = new ArrayList<String>();
    private String alias = null;

//    public CommandAlias(String command, boolean state) {
//	this.commands.add(command);
//	this.state = state;
//    }

    public CommandAlias(String alias, List<String> commands, boolean state) {
	this.commands.addAll(commands);
	this.state = state;
	this.alias = alias;
    }

    public boolean getState() {
	return state;
    }

    public void setState(boolean state) {
    }

    public String getCommand() {
	return null;
    }

    public String getCleanCommand() {
	return null;
    }

    public String getCommand(CommandSender sender, List<String> args) {

	return null;
    }

    public List<String> getCommands() {
	return commands;
    }

    public String getCommandsForLore() {
	return null;
    }

    public String getAlias() {
	return alias;
    }

    public String getAliasBaseCommand() {
	return alias.contains(" ") ? alias.split(" ")[0] : alias;
    }

    public String getAliasAsOneWord() {
	return alias.replace(" ", "__");
    }

    public void setAlias(String alias) {
	this.alias = alias;
    }

    public void setCommands(List<String> commands) {
	this.commands = commands;
    }
}
