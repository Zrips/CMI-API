package com.Zrips.CMI.Modules.Worlds;

import java.awt.Color;
import java.util.regex.Pattern;

import org.bukkit.scheduler.BukkitTask;

import com.Zrips.CMI.CMI;

public class WorldManager {

    private CMI plugin;
    public static Pattern regionPattern = Pattern.compile("r\\.(.+)\\.(.+)\\.mca");
    BukkitTask task = null;

    public WorldManager(final CMI plugin) {
	this.plugin = plugin;
    }

    public enum CMIBiome {
	MODIFIED_BADLANDS_PLATEAU(72, "F2B48D");

	private Color color;
	private int id;

	CMIBiome(int id, String colorCode) {
	    this.color = Color.decode("#" + colorCode);
	    this.id = id;
	}

	public static CMIBiome getById(int id) {
	    return null;
	}

	public static CMIBiome getByName(String name) {
	    return null;
	}

	public Color getColor() {
	    return color;
	}

	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}
    }
}
