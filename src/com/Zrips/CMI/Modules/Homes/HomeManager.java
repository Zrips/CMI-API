package com.Zrips.CMI.Modules.Homes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Modules.Permissions.PermissionInfo;
import com.Zrips.CMI.Modules.Warps.CmiWarp;

public class HomeManager {

    private CMI plugin;
    HashMap<String, Integer> homeGroups = new HashMap<String, Integer>();

    private boolean HomesBedInteraction = true;
    private HashMap<String, List<String>> ReSpawnPriorityOrder = new HashMap<String, List<String>>();

    public HomeManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void addHomeGroup(String group, int amount) {
	homeGroups.put(group, amount);
    }

    public enum RespawnPriority {
	spawn, bedLocation, homeLocation, worldSpawn;
	public static RespawnPriority getByName(String name) {
	    for (RespawnPriority one : RespawnPriority.values()) {
		if (one.name().equalsIgnoreCase(name))
		    return one;
	    }
	    return null;
	}

	public static List<String> getAsStringList() {
	    return null;
	}

	public static String getAsString() {
	    return null;
	}
    }

    public int getMaxHomes(CommandSender sender) {
	return 999;
    }

    public int getMaxHomes(Player player) {
	int homes = 1;
	return homes;
    }

    public void loadConfig() {

    }

    public boolean isHomesBedInteraction() {
	return HomesBedInteraction;
    }

    public Location getReSpawnLocation(Player player) {

	return null;
    }
}
