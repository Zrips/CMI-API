package com.Zrips.CMI.Containers;

import java.lang.reflect.Field;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;

import com.Zrips.CMI.CMI;

public abstract class CommandReg implements CommandExecutor, TabExecutor {

    protected final String command;
    protected static CommandMap cmap;

    public CommandReg(String command) {
	this.command = command.toLowerCase();
    }

    public boolean register() {
	return true;
    }

    final CommandMap getCommandMap() {
	return null;
    }

    private final class ReflectCommand extends Command {
	private CommandReg exe = null;

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

    @Override
    public abstract boolean onCommand(CommandSender sender, Command cmd, String label, String[] args);

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
	return null;
    }
}
