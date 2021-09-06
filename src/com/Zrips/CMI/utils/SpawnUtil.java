package com.Zrips.CMI.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.Logs.CMIDebug;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

import net.Zrips.CMILib.Container.CMILocation;

public class SpawnUtil {

    public SpawnUtil() {
	// TODO Auto-generated constructor stub
    }

    public static final String defaultG = "CMISpawnGroup";
    public static final String defaultGW = "CMISWG";

    public static class SpawnPoint {
	private String group;
	private CMILocation location;
	private boolean respawn = false;
	private Integer rng = null;
	private List<World> worlds;

	public SpawnPoint(String group, CMILocation loc, boolean respawn) {
	    this(group, loc, respawn, null, null);
	}

	public SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng) {
	    this(group, loc, respawn, rng, null);
	}

	public SpawnPoint(String group, CMILocation loc, boolean respawn, Integer rng, List<World> worlds) {
	    this.group = group;
	    this.location = loc;
	    this.respawn = respawn;
	    this.rng = rng;
	    this.worlds = worlds;
	}

	public String getGroup() {
	    return group;
	}

	public void setGroup(String group) {
	    this.group = group;
	}

	public CMILocation getLocation() {
	    if (rng != null && rng > 0) {
		Random random = new Random(System.currentTimeMillis());
		double rx = (random.nextInt(rng * 10 * 2) - (rng * 10)) / 10D;
		double rz = (random.nextInt(rng * 10 * 2) - (rng * 10)) / 10D;
		return new CMILocation(location.clone().add(rx, 0, rz));
	    }
	    return location;
	}

	public void setLocation(CMILocation location) {
	    this.location = location;
	}

	public boolean isRespawn() {
	    return respawn;
	}

	public void setRespawn(boolean respawn) {
	    this.respawn = respawn;
	}

	public Integer getRng() {
	    return rng;
	}

	public void setRng(Integer rng) {
	    this.rng = rng;
	}

	public List<World> getWorlds() {
	    if (this.worlds == null)
		worlds = new ArrayList<World>();
	    return worlds;
	}

	public List<String> getWorldsAsStringList() {
	    List<String> ls = new ArrayList<String>();
	    if (this.worlds != null)
		for (World one : this.worlds) {
		    if (one == null)
			continue;
		    ls.add(one.getName());
		}
	    return ls;
	}

	public void setWorlds(List<World> worlds) {
	    this.worlds = worlds;
	}
    }

    static HashMap<String, SpawnPoint> map = new HashMap<String, SpawnPoint>();

    public static void addNew(String group, CMILocation loc, boolean respawn) {
	addNew(group, loc, respawn, null);
    }

    public static void addNew(String group, CMILocation loc, boolean respawn, Integer range) {
	addNew(group, loc, respawn, range, new ArrayList<World>());
    }

    public static void addNew(String group, CMILocation loc, boolean respawn, Integer range, List<World> worlds) {
	if (group == null && !worlds.isEmpty())
	    group = defaultGW + (new Random(Integer.MAX_VALUE).nextInt(100000));

	if (group == null)
	    group = defaultG;
	if (loc == null)
	    return;
	map.put(group, new SpawnPoint(group, loc, respawn, range, worlds));
    }

    public static CMILocation getSpawnPoint(Player player) {

	return null;
    }

    public static CMILocation getGroupReSpawnPoint(Player player) {

	return null;
    }

    public static void save() {

    }

    private static boolean SpawnSpawnOnJoin = false;

    public static void loadConfig() {

    }

    public static boolean isSpawnSpawnOnJoin() {
	return SpawnSpawnOnJoin;
    }
}
