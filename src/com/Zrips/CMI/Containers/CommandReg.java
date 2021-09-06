package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.command.defaults.BukkitCommand;

import com.Zrips.CMI.CMI;

public abstract class CommandReg implements CommandExecutor, TabExecutor {

    protected final String command;
    protected static CommandMap cmap;
    private CommandAlias alias;

    public CommandReg(String command, CommandAlias alias) {
	this.alias = alias;
	this.command = command.toLowerCase();
    }

    public boolean register() {
	return register(null);
    }

    private static void unRegisterBukkitCommand(Command cmd) {

    }

    public boolean register(String permission) {

	return false;
    }

    final static CommandMap getCommandMap() {
	return cmap;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	return true;

    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {

	return CMI.getInstance().getTab().get(sender, command, "cmi", args);
    }

    private final class ReflectCommand extends BukkitCommand {
	private CommandReg exe = null;
	private CommandAlias alias;

	protected ReflectCommand(String command, String permission, CommandAlias alias) {
	    super(command);
	    this.alias = alias;
	    if (permission != null) {
		this.setPermission(permission);
	    }
	}

	@Deprecated
	protected ReflectCommand(String command) {
	    super(command);
	}

	public void setExecutor(CommandReg exe) {
	    this.exe = exe;
	}

	@Override
	public boolean execute(CommandSender sender, String commandLabel, String[] args) {

	    return true;
	}

	@Override
	public List<String> tabComplete(CommandSender sender, String alais, String[] args) {
	    return null;
	}
    }
}
