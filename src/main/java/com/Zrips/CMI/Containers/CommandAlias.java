package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Logs.CMIDebug;
import com.Zrips.CMI.Containers.CMIChatColor;

public class CommandAlias {

    private boolean state;
    private String cmiCommandName;
    private List<String> commands = new ArrayList<String>();
    private String alias = null;
    private boolean requiresPerm = false;
    private CommandAliasType type;

    private Boolean containsDynamic = null;

    public CommandAlias(String alias, List<String> commands, boolean state) {
	this(alias, commands, state, null);
    }

    public CommandAlias(String alias, List<String> commands, boolean state, CommandAliasType type) {
	this(alias, commands, state, type, null);
    }

    public CommandAlias(String alias, List<String> commands, boolean state, CommandAliasType type, String cmiCommandName) {
    }

    public boolean getState() {
	return state;
    }

    public void setState(boolean state) {
	this.state = state;
    }

    public String getCommand() {
	if (commands.isEmpty())
	    return "";
	return commands.get(0);
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

    Pattern patern = Pattern.compile("[$?][\\d][-]?");

    public boolean containsDynamicVariables() {
	if (containsDynamic == null) {
	    recalculateDynamicVariables();
	}
	return containsDynamic == null ? false : containsDynamic;
    }

    public void recalculateDynamicVariables() {
    }

    public String getAliasBaseCommand() {
	return alias.contains(" ") ? alias.split(" ")[0] : alias;
    }

    public String getAliasAsOneWord() {
	return alias.replace(" ", "__");
    }

    public String getAliasAsOneWordNS() {
	return alias.replace(" ", "");
    }

    public void setAlias(String alias) {
	this.alias = alias;
    }

    public void setCommands(List<String> commands) {
	this.commands = commands;
    }

    public boolean isRequiresPerm() {
	return requiresPerm;
    }

    public void setRequiresPerm(boolean requiresPerm) {
	this.requiresPerm = requiresPerm;
    }

    public CommandAliasType getType() {
	return type == null ? CommandAliasType.custom : type;
    }

    public String getCmiCommandName() {
	return cmiCommandName;
    }
}
