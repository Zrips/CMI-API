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
        this(old, safeLoc, lastCheckedLoc, TpCondition, false);
    }

    public SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition) {
        this(old, safeLoc, TpCondition, false);
    }

    public SafeTeleport(Location old, Location safeLoc, CMITeleportCondition TpCondition, boolean enableFly) {
        this(old, safeLoc, null, TpCondition, enableFly);
    }

    public SafeTeleport(Location old, Location safeLoc, Location lastCheckedLoc, CMITeleportCondition TpCondition, boolean enableFly) {
        this.old = old;
        this.safeLoc = safeLoc;
        this.TpCond = TpCondition;
        this.enableFly = enableFly;
        this.lastCheckedLoc = lastCheckedLoc;
    }

    public Location getOld() {
        return old;
    }

    public Location getSafeLoc() {
        if (safeLoc == null)
            return old;
        return safeLoc;
    }

    public CMITeleportCondition getTpCondition() {
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
