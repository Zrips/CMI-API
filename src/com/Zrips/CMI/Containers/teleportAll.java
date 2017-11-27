package com.Zrips.CMI.Containers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

public class teleportAll {

	private String targetFolder = null;
	private String targetWorld = null;
	private Location destination = null;
	private BukkitTask id = null;
	private List<String> names = new ArrayList<String>();
	private Player player;

	public teleportAll() {

	}

	public void settargetFolder(String targetFolder) {
		this.targetFolder = targetFolder;
	}

	public String gettargetFolder() {
		if (this.targetFolder == null)
			return Bukkit.getWorlds().get(0).getName();
		return this.targetFolder;
	}

	public void settargetWorld(String targetWorld) {
		this.targetWorld = targetWorld;
	}

	public String gettargetWorld() {
		return this.targetWorld;
	}

	public void setdestination(Location destination) {
		this.destination = destination;
	}

	public Location getdestination() {
		return this.destination;
	}

	public void setid(BukkitTask id) {
		this.id = id;
	}

	public Player getPlayer() {
		return this.player;
	}

	public void setPlayer(Player Player) {
		this.player = Player;
	}

	public BukkitTask getid() {
		return this.id;
	}

	public void addName(String name) {
		this.names.add(name);
	}

	public List<String> getNames() {
		return this.names;
	}
}
