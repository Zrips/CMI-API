package com.Zrips.CMI.Modules.Homes;

import org.bukkit.Location;

public class CmiHome {

    private Location loc;
    private String name;

    public CmiHome(String name, Location loc) {
	this.name = name;
	this.loc = loc;
    }

    public Location getLoc() {
	return loc;
    }

    public String getName() {
	return name;
    }

}
