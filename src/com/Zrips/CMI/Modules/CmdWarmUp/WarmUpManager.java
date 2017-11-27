package com.Zrips.CMI.Modules.CmdWarmUp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CommandAlias;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Locale.LC;

public class WarmUpManager {
    public HashMap<String, CmdWarmUp> warmups = new HashMap<String, CmdWarmUp>();
    private HashMap<String, WarmUpInfo> counter = new HashMap<String, WarmUpInfo>();

    CMI plugin;

    public WarmUpManager(CMI plugin) {
	this.plugin = plugin;
    }

    public boolean isOnWarmUp(Player player) {
	return isOnWarmUp(player.getName());
    }

    public boolean isOnWarmUp(String name) {
	return counter.containsKey(name);
    }

    public void addWU(String cmd, CmdWarmUp warmup) {
	warmups.put(cmd.toLowerCase(), warmup);
    }

    private CmdWarmUp getTime(String cmd) {
	return null;
    }

    public boolean canMove(Player player) {
	return canMove(player.getName());
    }

    public boolean canMove(String name) {
	return true;
    }

    public boolean canMoveByCmd(String cmd) {
	return true;
    }

    public boolean startTeleportUsage(Player player, Location loc) {
	return true;
    }

    public boolean startCmdUsage(CommandSender sender, String cmd) {
	return true;
    }

    private void performCmd(String target) {
    }

    private void count(final String target, final int time) {
    }

    private void setId(String target, int id) {
    }

    public boolean cancel(String target) {
	return false;
    }

    boolean InformOnNoMove;

    public void load() {

    }
}
