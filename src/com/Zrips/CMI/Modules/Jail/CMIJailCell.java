package com.Zrips.CMI.Modules.Jail;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIJailCell {

    private int id = 0;
    private CMILocation teleportInLocation;
    private World world;
    private Set<UUID> jailedOnes = new LinkedHashSet<UUID>();
    private CMIJail jail;

    public CMIJailCell(CMIJail jail) {
	this.jail = jail;
    }

    public Integer getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public void loadJailed(String root) throws Exception {
	
    }

    public CMILocation getTeleportInLocation() {
	return teleportInLocation;
    }

    @Deprecated
    public void setTeleportInLocation(Location safeLoc) {
	if (safeLoc != null)
	    this.teleportInLocation = new CMILocation(safeLoc);
    }

    public void setTeleportInLocation(CMILocation safeLoc) {
	this.teleportInLocation = safeLoc;
    }

    public World getWorld() {
	return world;
    }

    public void setWorld(World world) {
	this.world = world;
    }

    public Set<UUID> getJailed() {
	return jailedOnes;
    }

    public void setJailed(HashSet<UUID> jailedOnes) {
	this.jailedOnes = jailedOnes;
    }

    public void addJailed(UUID uuid) {
	this.jailedOnes.add(uuid);
    }

    public void removeJailed(UUID uuid) {
	this.jailedOnes.remove(uuid);
    }

    public CMIJail getJail() {
	return jail;
    }
}
