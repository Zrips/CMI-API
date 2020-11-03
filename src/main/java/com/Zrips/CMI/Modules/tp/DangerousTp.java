package com.Zrips.CMI.Modules.tp;

import java.util.UUID;

import org.bukkit.Location;

public class DangerousTp {

    private UUID uuid;
    private Location location;
    private Long time;

    public DangerousTp(UUID uuid, Location location) {
	this.uuid = uuid;
	this.location = location;
	this.time = System.currentTimeMillis();
    }

    public UUID getUuid() {
	return uuid;
    }

    public void setUuid(UUID uuid) {
	this.uuid = uuid;
    }

    public Location getLocation() {
	return location;
    }

    public void setLocation(Location location) {
	this.location = location;
    }

    public Long getTime() {
	return time;
    }

    public void setTime(Long time) {
	this.time = time;
    }

}
