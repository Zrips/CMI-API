package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.command.defaults.BukkitCommand;

public abstract class CommandReg implements CommandExecutor, TabExecutor {
    protected final String command = null;
    protected static CommandMap cmap;
    private CommandAlias alias;

    public CommandReg(String command, CommandAlias alias) {
    }

    public boolean register() {
        return false;
    }

    private static void unRegisterBukkitCommand(Command cmd) {
    }

    public boolean register(String permission) {
        return false;
    }

    final static CommandMap getCommandMap() {
        return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        return null;
    }

    private final class ReflectCommand extends BukkitCommand {
        private CommandReg exe;
        private CommandAlias alias;

        protected ReflectCommand(String command, String permission, CommandAlias alias) {
            super(command);
        }

        @Deprecated
        protected ReflectCommand(String command) {
            super(command);
        }

        public void setExecutor(CommandReg exe) {
        }

        @Override
        public boolean execute(CommandSender sender, String commandLabel, String[] args) {
            return false;
        }

        @Override
        public List<String> tabComplete(CommandSender sender, String alais, String[] args) {
            return null;
        }
    }
}
