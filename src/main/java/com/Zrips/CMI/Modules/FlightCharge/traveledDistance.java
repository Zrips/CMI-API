package com.Zrips.CMI.Modules.FlightCharge;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIUser;

public class traveledDistance {

    private CMIUser user;
    private Location loc;
    private Long time = 0L;

    traveledDistance(CMIUser user) {
	this.user = user;
	if (user.isOnline())
	    updateLocation();
    }

    public boolean toSoonToCheck() {
	return System.currentTimeMillis() - time < 1000;
    }

    public void updateLocation() {
    }

    public Double getDistanceTraveled() {
	return null;
    }

    public Long sinceLastUpdate() {
	return System.currentTimeMillis() - time;
    }

    public CMIUser getUser() {
	return user;
    }

}
