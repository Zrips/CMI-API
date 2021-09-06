package com.Zrips.CMI.Modules.Afk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class AfkListener implements Listener {
    private CMI plugin;

    public AfkListener(CMI plugin) {
	this.plugin = plugin;
    }

    private class previousLoc {
	List<Location> locs = new ArrayList<Location>();
	private int jumpCount = 0;

	public Location addLoc(Location loc) {
	    locs.add(loc);
	    if (locs.size() > 2)
		return locs.remove(0);
	    return null;
	}

	public int getJumpCount() {
	    return jumpCount;
	}

	public void setJumpCount(int jumpCount) {
	    this.jumpCount = jumpCount;
	}

	public void addJumpCount() {
	    this.jumpCount++;
	}
    }

    HashMap<UUID, previousLoc> antiJump = new HashMap<UUID, previousLoc>();

    static HashMap<UUID, checkInfo> pitchChange = new HashMap<UUID, checkInfo>();

    HashMap<UUID, Long> antiPush = new HashMap<UUID, Long>();

    public static boolean isSameDirection(CMIUser user) {
	if (!CMI.getInstance().getAfkManager().isAntiAfkMachines())
	    return false;
	checkInfo directionChange = pitchChange.get(user.getUniqueId());
	if (!user.isOnline() || user.getPlayer() == null)
	    return false;
	Location loc = user.getLocation();
	if (directionChange == null) {
	    directionChange = new checkInfo(loc);
	    pitchChange.put(user.getUniqueId(), directionChange);
	}
	if (directionChange.timeToCheck()) {
	    directionChange.updateTime();
	    if (directionChange.isSameDirection(loc)) {
		directionChange.updateLocation(loc);
		return true;
	    }
	    directionChange.updateLocation(loc);
	    return false;
	}
	return true;
    }

}
