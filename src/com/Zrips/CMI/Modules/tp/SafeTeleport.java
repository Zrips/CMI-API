package com.Zrips.CMI.Modules.tp;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.tp.Teleportations.TpCondition;

public class SafeTeleport {

    private Location old;
    private Location safeLoc;
    private Location lastCheckedLoc;
    private TpCondition TpCond;
    private boolean enableFly;
    private boolean forceDisableFly;

    public SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, TpCondition TpCondition) {
	this(old, safeLoc, lastCheckedLoc, TpCondition, false);
    }

    public SafeTeleport(Location old, Location safeLoc, TpCondition TpCondition) {
	this(old, safeLoc, TpCondition, false);
    }

    public SafeTeleport(Location old, Location safeLoc, TpCondition TpCondition, boolean enableFly) {
	this(old, safeLoc, null, TpCondition, enableFly);
    }

    public SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, TpCondition TpCondition, boolean enableFly) {
    }

    public Location getOld() {
	return old;
    }

    public Location getSafeLoc() {
	if (safeLoc == null)
	    return old;
	return safeLoc;
    }

    public TpCondition getTpCondition() {
	return TpCond;
    }

    public boolean isEnableFly() {
	return enableFly;
    }

    public SafeTeleport setEnableFly(boolean enableFly) {
	this.enableFly = enableFly;
	return this;
    }

    public boolean isForceDisableFly() {
	return forceDisableFly;
    }

    public void setForceDisableFly(boolean forceDisableFly) {
	this.forceDisableFly = forceDisableFly;
    }

    public Location getLastCheckedLoc() {
	return lastCheckedLoc;
    }

    public void setLastCheckedLoc(Location lastCheckedLoc) {
	this.lastCheckedLoc = lastCheckedLoc;
    }

}
