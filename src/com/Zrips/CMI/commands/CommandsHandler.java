package com.Zrips.CMI.commands;

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

    private boolean testServer = false;

    protected CMI plugin;

    public CommandsHandler(CMI plugin) {

    }

    public Boolean performCMICommand(CommandSender sender, Class<?> command, String... args) {
	return null;
    }

    public Boolean performCMICommand(CommandSender sender, CMICommand cmd, String[] args) {
	return null;
    }

    public Boolean performCMICommand(CommandSender sender, Class<?> command, String args) {
	return null;
    }

    public Boolean performCMICommand(CommandSender sender, CMICommand cmd, String args) {
	return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

	return false;
    }

    public static boolean hasCommandPermission(CommandSender sender, String cmd, Long delay) {
	return false;
    }

    private String getUsage(String cmd) {
	return null;
    }

//    public String getUsageNoCmd(String cmd) {
//	StringBuilder builder = new StringBuilder();
//	builder.append(ChatColor.GREEN.toString());
//	builder.append('/').append(label).append(' ');
//	builder.append(ChatColor.GOLD);
//	String key = "command." + cmd + ".help.args";
//	if (plugin.getLM().containsKey(key)) {
//	    builder.append(' ');
//	    builder.append(plugin.getLM().getMessage(key));
//	}
//	return builder.toString();
//    }

    public void sendUsage(CommandSender sender, String cmd) {
	sendUsage(sender, cmd, true);
    }

    public void sendUsage(CommandSender sender, String cmd, boolean explanation) {
    }

    protected boolean help(CommandSender sender, int page) {

	return true;
    }

    public static List<String> getClassesFromPackage(String pckgname) throws ClassNotFoundException {
	return null;
    }

    private static List<String> getClassesInSamePackageFromJar(String packageName, String jarPath) {
	return null;
    }

    public Map<String, Integer> GetCommands(CommandSender sender) {
	return null;
    }

    public void fillCommands() {
	return;
    }

    private static Class<?> getClass(String cmd) {
	return null;
    }

    private Cmd getCmdClass(String cmdName) {

	return null;
    }

    public static int distance(String a, String b) {
	return 0;
    }

    private static Map<String, Integer> sort(Map<String, Integer> unsortMap) {
	return null;
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
	return null;
    }
}
