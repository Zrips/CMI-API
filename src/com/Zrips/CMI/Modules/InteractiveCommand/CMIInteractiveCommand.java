package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;

public class CMIInteractiveCommand {

    private String name;
    private Set<Location> loc = new HashSet<Location>();
    private Set<UUID> uuid = new HashSet<UUID>();
    private Entity ent;
    private List<String> commands = new ArrayList<String>();

    public CMIInteractiveCommand(String name) {
	this.name = name;
    }

    public List<String> getCommands(Player player) {
	Snd snd = new Snd();
	snd.setSender(player);
	snd.setTarget(player);
	return CMI.getInstance().getLM().updateSnd(snd, new ArrayList<String>(commands));
    }

    public List<String> getCommandsOriginal() {
	return commands;
    }

    public List<String> getCommands() {
	return new ArrayList<String>(commands);
    }

    public void setCommands(List<String> commands) {
	this.commands = new ArrayList<String>(commands);
    }

    public void addCommand(String commands) {
	this.commands.add(commands);
    }

    public Set<Location> getLocList() {
	return loc;
    }

    public void setLoc(List<Location> loc) {
	this.loc.clear();
	this.loc.addAll(loc);
    }

    public void addLoc(Location loc) {
	this.loc.add(loc);
    }

    public Set<UUID> getUUIDList() {
	return uuid;
    }

    public List<String> getUUIDStringList() {
	List<String> ls = new ArrayList<String>();
	for (UUID one : this.uuid) {
	    ls.add(one.toString());
	}
	return ls;
    }

    public void setUUIDList(List<UUID> uuid) {
	this.uuid.clear();
	this.uuid.addAll(uuid);
    }

    public void addUUID(UUID uuid) {
	this.uuid.add(uuid);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Entity getEnt() {
	return ent;
    }

    public void setEnt(Entity ent) {
	this.ent = ent;
    }

}
