package com.Zrips.CMI.Modules.Teleportations;

import org.bukkit.Location;

public class SafeTeleport {
    private Location old;
    private Location safeLoc;
    private Location lastCheckedLoc;
    private CMITeleportCondition TpCond;
    private boolean enableFly;
    private boolean forceDisableFly;

    public SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, CMITeleportCondition TpCondition) {
    }

    public SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition) {
    }

    public SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition, boolean enableFly) {
    }

    public SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, CMITeleportCondition TpCondition, boolean enableFly) {
    }

    public Location getOld() {
        return null;
    }

    public Location getSafeLoc() {
        return null;
    }

    public CMITeleportCondition getTpCondition() {
        return null;
    }

    public boolean isEnableFly() {
        return false;
    }

    public SafeTeleport setEnableFly(boolean enableFly) {
        return null;
    }

    public boolean isForceDisableFly() {
        return false;
    }

    public void setForceDisableFly(boolean forceDisableFly) {
    }

    public Location getLastCheckedLoc() {
        return null;
    }

    public void setLastCheckedLoc(Location lastCheckedLoc) {
    }
}
