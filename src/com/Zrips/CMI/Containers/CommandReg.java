package com.Zrips.CMI.Containers;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandMap;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.command.defaults.BukkitCommand;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.commands.CMICommand;

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

    public boolean register(String permission) {
        return true;
    }

    final static CommandMap getCommandMap() {
        return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        CMICommand cm = CMI.getInstance().getCommandManager().getCommands().get(label);

        if (cm != null) {
            return cm.getCmdClass().perform(CMI.getInstance(), sender, args);
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        return null;
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
            if (alias.getType() == CommandAliasType.subbase)
                return null;

            if (exe != null) {
                return exe.onTabComplete(sender, this, alais, args);
            }

            return null;
        }
    }
}
