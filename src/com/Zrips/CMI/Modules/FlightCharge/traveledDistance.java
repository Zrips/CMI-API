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
	if (!user.isOnline())
	    return;
	Player player = user.getPlayer();
	if (player == null)
	    return;
	loc = player.getLocation();
	time = System.currentTimeMillis();
    }

    public Double getDistanceTraveled() {
	if (!user.isOnline())
	    return 0D;
	Player player = user.getPlayer();
	if (player == null || loc == null)
	    return 0D;
	if (!player.getWorld().equals(loc.getWorld()))
	    return 0D;
	Double dis = player.getLocation().distance(loc);
	return dis;
    }

    public Long sinceLastUpdate() {
	return System.currentTimeMillis() - time;
    }

    public CMIUser getUser() {
	return user;
    }

}
