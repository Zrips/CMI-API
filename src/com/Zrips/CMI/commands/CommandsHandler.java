package com.Zrips.CMI.commands;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class CommandsHandler implements CommandExecutor {
    public static final String label = null;
    private static String packagePath;
    public static int stage;
    public static String msg;
    private Map<String, CMICommand> commands;
    private List<String> disabledBase;
    private boolean testServer;
    protected CMI plugin;

    public CommandsHandler(CMI plugin) {
    }

    public Boolean performCMICommand(CommandSender sender, Cmd command, String... args) {
        return null;
    }

    public Boolean performCMICommand(CommandSender sender, Class<?> command, String... args) {
        return null;
    }

    public Boolean performCMICommand(CommandSender sender, CMICommand cmd, String[] args) {
        return null;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String l, String[] args) {
        return false;
    }

    public String getUserName1(CMIUser user) {
        return null;
    }

    public String getUserName2(CMIUser user) {
        return null;
    }

    public static boolean hasCommandPermission(CommandSender sender, String cmd, Long delay) {
        return false;
    }

    private String getUsage(String cmd) {
        return null;
    }

    private String getCommandRoot(String cmd) {
        return null;
    }

    public void sendUsage(CommandSender sender, String cmd) {
    }

    public void sendUsage(CommandSender sender, String cmd, boolean explanation) {
    }

    protected boolean help(CommandSender sender, int page) {
        return false;
    }

    public static HashSet<String> getClassesFromPackage(String pckgname) {
        return null;
    }

    private static HashSet<String> getClassesInSamePackageFromJar(String packageName, String jarPath) {
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

    private Cmd getBestCmdmatch(String cmdName) {
        return null;
    }

    public static int distance(String a, String b) {
        return 0;
    }

    private static Map<String, Integer> sort(Map<String, Integer> unsortMap) {
        return null;
    }

    public Map<String, CMICommand> getCommands() {
        return null;
    }

    public static String getLabel() {
        return null;
    }

    public boolean isTestServer() {
        return false;
    }

    public static String getCommandPrefix(String command) {
        return null;
    }

    public void setBaseCommandState(String command, boolean state) {
    }

    public List<String> getDisabledBase() {
        return null;
    }

    public void clearDisabledBase() {
    }

    public void addDisabledBase(String disabledBase) {
    }
}
