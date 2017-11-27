package com.Zrips.CMI.Modules.Alias;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;

import java.util.Set;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Allias;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.CommandReg;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.commands.CAnnotation;
import com.Zrips.CMI.commands.CMICommand;
import com.gamingmesh.jobs.commands.Cmd;

public class AliasManager {

    private CMI plugin;

    public LinkedHashMap<String, CommandAlias> defaultAliases = new LinkedHashMap<String, CommandAlias>();
    public LinkedHashMap<String, CommandAlias> customAliases = new LinkedHashMap<String, CommandAlias>();
    public HashMap<String, CommandAlias> fromAliases = new HashMap<String, CommandAlias>();

    public AliasManager(CMI plugin) {
	this.plugin = plugin;
    }

    public CommandAlias getAliasForCommand(String msg) {
	return null;
    }

    private void register(CommandAlias ca) {
    }

    public void addDefault(CommandAlias ca) {
	defaultAliases.put(ca.getAlias(), ca);
	fromAliases.put(ca.getCleanCommand(), ca);
	register(ca);
    }

    public void addCustom(CommandAlias ca) {
    }

    public void removeCustom(CommandAlias ca) {
    }

    public LinkedHashMap<String, CommandAlias> getCustom() {
	return null;
    }

    public LinkedHashMap<String, CommandAlias> getDefaultAlias() {
	return null;
    }

    public HashMap<String, CommandAlias> getAll() {
	return null;
    }

    public HashMap<String, CommandAlias> getFrom() {
	return null;
    }

    private List<String> convertCustom() {
	return null;
    }

    public void save() {
    }

    public List<String> updateCommands(List<String> args, List<String> commands) {
	return null;
    }

    List<String> CommentList = new ArrayList<String>(Arrays.asList("",
	"Edit custom variables in game if posible",
	"Some extra variables can be used, like [playerName] will insert senders name automaticaly",
	"All global variables should work, you can find full list in locale file",
	"You can add delay between commands by inserting line like",
	"delay! 5",
	"This will delay next commands by defines time in seconds",
	"If command is shortened and you need to provide some changing variables like target player name you need to define what and where it should be placed",
	"Example: /cmi heal Zrips ",
	"Can be shortened with custom alias to something like /h zrips by using alias command like",
	"cmi heal $1",
	"If you need to add more than one variable, use $1- format. Number represents variable place when used in alias command",
	"Example: cmi tppos $1-"));

    public void load() {
    }

    public void loadRegularAlias() {

    }

    public void saveNew() {

    }

    public void saveRegularAlias() {

    }
}
