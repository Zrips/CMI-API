package com.Zrips.CMI.commands;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.teleportAll;

public class CommandsHandler implements CommandExecutor {
    private static final String label = "cmi";
    private static String packagePath = "";
    private static final List<String> hidenCommands = Arrays.asList("openchest", "openentity");
    private static final List<String> ignoreHelpPage = Arrays.asList("msg", "reply");
    public int stage = 0;
    public String msg = "";
    public teleportAll tpInfo = new teleportAll();
    private Map<String, CMICommand> Commands = new TreeMap<String, CMICommand>();

    protected CMI plugin;

    public CommandsHandler(CMI plugin) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
	return true;
    }

    private static String[] reduceArgs(String[] args) {
	return null;
    }

    private static boolean hasCommandPermission(CommandSender sender, String cmd) {
	return true;
    }

    private String getUsage(String cmd) {
	return null;
    }

    public String getUsageNoCmd(String cmd) {
	return null;
    }

    public void sendUsage(CommandSender sender, String cmd) {
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

    }

    private static Class<?> getClass(String cmd) {

	return null;
    }

    private Cmd getCmdClass(String cmdName) {
	return null;
    }

    private static Map<String, Integer> sort(Map<String, Integer> unsortMap) {
	return null;
    }

    public Map<String, CMICommand> getCommands() {
	return null;
    }

    public String getLabel() {
	return null;
    }
}
