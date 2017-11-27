package com.Zrips.CMI.Modules.Mirror;

import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class MirrorManager {

    public enum Action {
	X("&eMirrors by &6X &eaxis", 0),
	Y("&eMirrors by &6Y &eaxis", 1),
	Z("&eMirrors by &6Z &eaxis", 2),
	XY("&eMirrors by &6X &eto &6Y &eaxis", 3),
	ZY("&eMirrors by &6Z &eto &6Y &eaxis", 4),
	XZ("&eMirrors by &6X &eto &6Z &eaxis", 5),
	ZX("&eMirrors by &6Z &eto &6Y &eaxis", 6),
	Rotate90V("&eRotates up", 7),
	Rotate90H("&eRotates &690 &edegrees clock wise", 9),
	Rotate90HC("&eRotates &690 &edegrees counter clock wise", 10),
	Rotate180H("&eRotates &6180 &edegrees", 11),
	Pause("&ePauses mirroring", 16),
	Location("&eSets mirroring center location", 17);
	private int slot;
	private String desc;

	private Action(String desc, int slot) {
	    this.slot = slot;
	    this.desc = desc;
	}

	public int getSlot() {
	    return this.slot;
	}

	public String getDesc() {
	    return this.desc;
	}
    }

    HashMap<UUID, CMIUser> map = new HashMap<UUID, CMIUser>();
    HashMap<UUID, Inventory> editMap = new HashMap<UUID, Inventory>();
    private final String CMIMirrorBlock = "CMIMirrorBlock";
    private CMI plugin;

    public MirrorManager(CMI plugin) {
	this.plugin = plugin;
    }

    public boolean isMirroring(Player player) {
	return map.containsKey(player.getUniqueId());
    }

    public boolean addMirroring(Player player) {
	CMIUser user = plugin.getPlayerManager().getUser(player);
	if (user != null)
	    return map.put(player.getUniqueId(), user) != null;
	return false;
    }

    public void removeMirroring(Player player) {
	map.remove(player.getUniqueId());
    }

    class blockInfo {

	private Location loc;
	private int data;

	blockInfo(Location loc, int data) {
	    this.loc = loc;
	    this.data = data;
	}

	public Location getLoc() {
	    return loc;
	}

	public void setLoc(Location loc) {
	    this.loc = loc;
	}

	public int getData() {
	    return data;
	}

	public void setData(int data) {
	    this.data = data;
	}

    }

    private static String toString(Location loc) {
	return loc.getBlockX() + ":" + loc.getBlockY() + ":" + loc.getBlockZ();
    }

    private HashMap<String, blockInfo> getMapLocations(Mirrors mirror, Location loc) {

	return null;
    }

    private static Set<Location> getLocations(Mirrors mirror, Location loc) {

	return null;
    }

    private boolean inRange(Location center, Location location) {
	return false;
    }

    public void MirrorPlace(Player player, Block block) {

    }

    public void MirrorBreak(Player player, Block block) {

    }

    private Location rotate90horClockWise(Mirrors mirror, Location loc) {
	return null;
    }

    private Location rotate90horCounterClockWise(Mirrors mirror, Location loc) {
	return null;
    }

    private static Location rotate90hor(Mirrors mirror, Location loc, boolean clock) {

	return null;
    }

    private static Location rotate180hor(Mirrors mirror, Location loc) {

	return null;
    }

    private static Location rotate90vert(Mirrors mirror, Location loc) {

	return null;
    }

    private HashMap<String, blockInfo> getMirroredXZMap(Mirrors mirror, Block block, int data, Location loc, int repeat, HashMap<String, blockInfo> map) {

	return null;
    }

    private HashMap<String, blockInfo> getMirroredZXMap(Mirrors mirror, Block block, int data, Location loc, int repeat, HashMap<String, blockInfo> map) {

	return null;
    }

    private static Set<Location> getMirroredXZ(Mirrors mirror, Location loc, int repeat) {

	return null;
    }

    private static Set<Location> getMirroredZX(Mirrors mirror, Location loc, int repeat) {
	return null;
    }

    private HashMap<String, blockInfo> getMirroredZYMap(Mirrors mirror, Block block, int data, Location loc, int repeat, HashMap<String, blockInfo> map) {
	return null;
    }

    private HashMap<String, blockInfo> getMirroredXYMap(Mirrors mirror, Block block, int data, Location loc, int repeat, HashMap<String, blockInfo> map) {
	return null;
    }

    private static Set<Location> getMirroredZY(Mirrors mirror, Location loc, int repeat) {
	return null;
    }

    private static Set<Location> getMirroredXY(Mirrors mirror, Location loc, int repeat) {
	return null;
    }

    private HashMap<String, blockInfo> getMirroredLocMap(Mirrors mirror, Location loc) {

	return null;
    }

    private static Set<Location> getMirroredLocs(Mirrors mirror, Location loc) {
	return null;
    }

    private static int getX(Location center, Location loc) {
	int c = center.getBlockX();
	int b = loc.getBlockX();
	int dif = c - b;
	int newValue = c + dif;
	return newValue;
    }

    private static int getY(Location center, Location loc) {
	int c = center.getBlockY();
	int b = loc.getBlockY();
	int dif = c - b;
	int newValue = c + dif;
	return newValue;
    }

    private static int getZ(Location center, Location loc) {
	int c = center.getBlockZ();
	int b = loc.getBlockZ();
	int dif = c - b;
	int newValue = c + dif;
	return newValue;
    }

    private static int getXdif(Location center, Location loc) {
	return center.getBlockX() - loc.getBlockX();
    }

    private static int getYdif(Location center, Location loc) {
	return center.getBlockY() - loc.getBlockY();
    }

    private static int getZdif(Location center, Location loc) {
	return center.getBlockZ() - loc.getBlockZ();
    }

    public void openGui(CMIUser user) {
    }

    public void processClick(Player player, int slot) {

    }

    public boolean isEditing(Player player) {
	return this.editMap.containsKey(player.getUniqueId());
    }

    public void removeEditor(Player player) {
	this.editMap.remove(player.getUniqueId());
    }

}
