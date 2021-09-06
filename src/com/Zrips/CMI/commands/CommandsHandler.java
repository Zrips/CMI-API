package com.Zrips.CMI.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;

public class CommandsHandler implements CommandExecutor {
    public static final String label = "cmi";
    private static String packagePath = "";
    public static int stage = 0;
    public static String msg = "";
    private Map<String, CMICommand> commands = new TreeMap<>();
    private List<String> disabledBase = new ArrayList<String>();

    private boolean testServer = false;

    protected CMI plugin;

    public CommandsHandler(CMI plugin) {
    }

    public Boolean performCMICommand(CommandSender sender, Class<?> command, String... args) {
	CMICommand cmd = this.getCommands().get(command.getSimpleName().toLowerCase());
	if (cmd == null)
	    return false;
	return performCMICommand(sender, cmd, args);
    }

    public Boolean performCMICommand(CommandSender sender, CMICommand cmd, String[] args) {
	if (cmd == null)
	    return false;
	return cmd.getCmdClass().perform(plugin, sender, args);
    }

    public Boolean performCMICommand(CommandSender sender, Class<?> command, String args) {
	CMICommand cmd = this.getCommands().get(command.getSimpleName().toLowerCase());
	if (cmd == null)
	    return false;
	return performCMICommand(sender, cmd, args);
    }

    public Boolean performCMICommand(CommandSender sender, CMICommand cmd, String args) {
	if (cmd == null)
	    return false;
	String[] ar = { args };
	return cmd.getCmdClass().perform(plugin, sender, args.contains(" ") ? args.split(" ") : args.isEmpty() ? new String[0] : ar);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String l, String[] args) {

	return true;
    }

    public static boolean hasCommandPermission(CommandSender sender, String cmd, Long delay) {
	return false;
    }

    private String getUsage(String cmd) {
	return "";
    }

    public void sendUsage(CommandSender sender, String cmd) {
	sendUsage(sender, cmd, true);
    }

    public void sendUsage(CommandSender sender, String cmd, boolean explanation) {
	
    }

    protected boolean help(CommandSender sender, int page) {

	return true;
    }

    public static List<String> getClassesFromPackage(String pckgname) throws ClassNotFoundException {
	List<String> result = new ArrayList<String>();
	
	return result;
    }

    public Map<String, Integer> GetCommands(CommandSender sender) {
	Map<String, Integer> temp = new TreeMap<String, Integer>();
	
	return temp;
    }

    public void fillCommands() {
	return;
    }

    public static int distance(String a, String b) {
	a = a.toLowerCase();
	b = b.toLowerCase();
	int[] costs = new int[b.length() + 1];
	for (int j = 0; j < costs.length; j++)
	    costs[j] = j;
	for (int i = 1; i <= a.length(); i++) {
	    costs[0] = i;
	    int nw = i - 1;
	    for (int j = 1; j <= b.length(); j++) {
		int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), a.charAt(i - 1) == b.charAt(j - 1) ? nw : nw + 1);
		nw = costs[j];
		costs[j] = cj;
	    }
	}
	return costs[b.length()];
    }

    public Map<String, CMICommand> getCommands() {
	return this.commands;
    }

    public static String getLabel() {
	return label;
    }

    public boolean isTestServer() {
	return testServer;
    }

    public static String getCommandPrefix(String command) {


	return "";
    }

    public void setBaseCommandState(String command, boolean state) {
	CMICommand cmd = this.getCommands().get(command.toLowerCase());
	if (cmd != null)
	    cmd.setBaseEnabled(state);
	if (!state)
	    addDisabledBase(command.toLowerCase());
    }

    public List<String> getDisabledBase() {
	return disabledBase;
    }

    public void clearDisabledBase() {
	this.disabledBase.clear();
    }

    public void addDisabledBase(String disabledBase) {
	this.disabledBase.add(disabledBase);
    }
}
