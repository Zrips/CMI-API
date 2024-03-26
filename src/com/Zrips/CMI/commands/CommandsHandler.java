package com.Zrips.CMI.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.CMILib;

public class CommandsHandler implements CommandExecutor {
    public static final String label = "cmi";
    private static String packagePath = "";
    public static int stage = 0;
    public static String msg = "";
    private Map<String, CMICommand> commands = new TreeMap<>();
    private List<String> disabledBase = new ArrayList<String>();

    private boolean testServer = false;
    Class<?> RCON = null;
    protected CMI plugin;

    public CommandsHandler(CMI plugin) {
        this.plugin = plugin;
        packagePath = this.getClass().getPackage().getName() + ".list";

        try {
            RCON = Class.forName("org.bukkit.command.RemoteConsoleCommandSender");
        } catch (ClassNotFoundException e) {
        }

        // Enables extra commands for test servers
        if (CMILib.getInstance().getReflectionManager().getServerName().equals("LT_Craft") && Bukkit.getWorlds().get(0).getSeed() == 1782374759)
            testServer = true;
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
        if (!(sender instanceof Player))
            return true;
        if (CMIPerm.command_$1.hasPermission(sender, false, true, delay, "*"))
            return true;
        return CMIPerm.command_$1.hasPermission(sender, false, true, delay, cmd);
    }

    private String getUsage(String cmd) {

        return null;
    }

    private String getCommandRoot(String cmd) {

        return null;
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

    private static List<String> getClassesInSamePackageFromJar(String packageName, String jarPath) {
        return null;
    }

    public Map<String, Integer> GetCommands(CommandSender sender) {

        return null;
    }

    public void fillCommands() {

        return;
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
