package com.Zrips.CMI.Modules.Alias;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CommandAlias;

public class AliasManager {

    private CMI plugin;

    public LinkedHashMap<String, CommandAlias> defaultAliases = new LinkedHashMap<String, CommandAlias>();
    public LinkedHashMap<String, CommandAlias> customAliases = new LinkedHashMap<String, CommandAlias>();
//    public LinkedHashMap<String, CommandAlias> fullList = new LinkedHashMap<String, CommandAlias>();
    public HashMap<String, CommandAlias> fromAliases = new HashMap<String, CommandAlias>();


    public AliasManager(CMI plugin) {
	this.plugin = plugin;
    }


    private static CommandAlias getFirst(String msg, CommandAlias compare, String key) {

	return null;
    }

    private static CommandAlias getSecond(String msg, CommandAlias secondAlias, CommandAlias firstAlias, CommandAlias compare, String key) {
	return null;
    }

    Map<String, CommandAlias> cache = Collections.synchronizedMap(new HashMap<String, CommandAlias>());

    public void clearCache() {
	cache.clear();
    }

    public CommandAlias getAliasForCommand(String msg) {
	return null;
    }

    public List<CommandAlias> getAliasStartingWith(String msg) {
	return null;
    }

    private void register(CommandAlias ca) {
    }

    public void addDefault(CommandAlias ca) {
    }

    public void addCustom(CommandAlias ca) {
    }

    public void removeCustom(String command) {
    }

    public void removeCustom(CommandAlias ca) {
    }

    public LinkedHashMap<String, CommandAlias> getCustom() {
	return customAliases;
    }

    public LinkedHashMap<String, CommandAlias> getDefaultAlias() {
	return defaultAliases;
    }

    public HashMap<String, CommandAlias> getAll() {
	return null;
    }

    public HashMap<String, CommandAlias> getFrom() {
	return fromAliases;
    }

    private List<String> convertCustom() {
	List<String> list = new ArrayList<String>();
	for (Entry<String, CommandAlias> one : customAliases.entrySet()) {
	    list.add(one.getValue().getCommand() + "-" + one.getKey());
	}
	return list;
    }

    public void save() {
	plugin.getConfigManager().ChangeConfig("CustomAlias.List", convertCustom());
    }

    public static Pattern patern = Pattern.compile("( |^|:|:/|\\S)(\\$(\\d{1,2})(-?))");

    public List<String> updateCommands(List<String> args, List<String> commands) {
	
	return null;
    }

    List<String> CommentList = new ArrayList<String>(Arrays.asList("",
	"Edit custom variables in game if possible",
	"Some extra variables can be used, like [playerName] will insert senders name automatically",
	"All global variables should work, you can find full list in locale file",
	"You can add delay between commands by inserting line like",
	"delay! 5",
	"This will delay next commands by defines time in seconds",
	"If command is shortened and you need to provide some changing variables like target player name you need to define what and where it should be placed",
	"Example: /cmi heal Zrips ",
	"Can be shortened with custom alias to something like /h zrips by using alias command like",
	"cmi heal $1",
	"If you need to add more than one variable, use $1- format. Number represents variable place when used in alias command",
	"Example: cmi tppos $1-",
	"In case you want to print out help page if player enters wrong subcommand, use ? in alias",
	"Example: ca ?",
	"In this case if player performs /ca wrongsub or /ca anotherwrong",
	"Commands under this alias will get executed. Exelent way to show help page and correct usage if needed"));

    List<String> temp = new ArrayList<String>();

    public void load() {
	
    }

    public void loadRegularAlias() {
	
    }

    public void saveNew() {
	
    }

    public void saveRegularAlias() {
	
    }
}
