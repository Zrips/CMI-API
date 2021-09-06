package com.Zrips.CMI.Modules.Homes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class HomeManager {

    private CMI plugin;
    HashMap<String, Integer> homeGroups = new HashMap<String, Integer>();

    private boolean checkBlockbreak = false;
    private boolean pickRealBlock = false;
    private boolean confirmation = true;
    private String defaultHomeName = "Home";
    private String defaultBedHomeName = "Home";
    private String homeNameRegex = "/([\\p{L}-]+)/ug";
    private int respawnImmortality = 0;

    private boolean HomesGui = true;
    private boolean HomesBedInteraction = true;
    private boolean onlyShiftBed = false;
    private boolean RemoveBedLocationOnBedBreak = true;
    private HashMap<String, List<String>> ReSpawnPriorityOrder = new HashMap<String, List<String>>();
    private HashMap<String, HashMap<CMIUser, CmiHome>> bedHomes = new HashMap<String, HashMap<CMIUser, CmiHome>>();

    public HomeManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void addHomeGroup(String group, int amount) {
	homeGroups.put(group, amount);
    }

    public enum RespawnPriority {
	anchor, bedLocation, spawn, homeLocation, worldSpawn;

	public static RespawnPriority getByName(String name) {
	    for (RespawnPriority one : RespawnPriority.values()) {
		if (one.name().equalsIgnoreCase(name))
		    return one;
	    }
	    return null;
	}

	public static List<String> getAsStringList() {
	    List<String> list = new ArrayList<String>();
	    return list;
	}

	public static String getAsString() {
	    String list = "";
	    return list;
	}
    }

    public int getMaxHomes(CommandSender sender) {
	if (sender instanceof Player)
	    return getMaxHomes((Player) sender);
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
	return getReSpawnLocation(player, null);
    }

    public Location getReSpawnLocation(Player player, Location respawnLoc) {


	return null;
    }

    public boolean isCheckBlockbreak() {
	return checkBlockbreak;
    }

    public String getDefaultHomeName() {
	return defaultHomeName;
    }

    public String getDefaultBedHomeName() {
	return defaultBedHomeName;
    }

    public HashMap<String, HashMap<CMIUser, CmiHome>> getBedHomes() {
	return bedHomes;
    }

    public void addBedHome(CMIUser user, CmiHome bedHome) {
	
    }

    public boolean removeBedHome(Location loc) {
	
	return false;
    }

    public boolean isRemoveBedLocationOnBedBreak() {
	return RemoveBedLocationOnBedBreak;
    }


    public boolean openHomeGui(Player player, CMIUser user, int page) {
	
	return true;
    }

    public boolean isHomesGui() {
	return HomesGui;
    }

    public int getRespawnImmortality() {
	return respawnImmortality;
    }

    public String getHomeNameRegex() {
	return homeNameRegex;
    }

    public void setHomeNameRegex(String homeNameRegex) {
	this.homeNameRegex = homeNameRegex;
    }

    public boolean isPickRealBlock() {
	return pickRealBlock;
    }

    public boolean isOnlyShiftBed() {
	return onlyShiftBed;
    }

    public boolean isConfirmation() {
	return confirmation;
    }
}
