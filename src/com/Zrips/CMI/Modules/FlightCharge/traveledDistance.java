package com.Zrips.CMI.Modules.FlightCharge;

import org.bukkit.Location;

import com.Zrips.CMI.Containers.CMIUser;

public class traveledDistance {
    private CMIUser user;
    private Location loc;
    private Long time;

    traveledDistance(CMIUser user) {
    }

    public boolean toSoonToCheck() {
        return false;
    }

    public void updateLocation() {
    }

    public Double getDistanceTraveled() {
        return null;
    }

    public Long sinceLastUpdate() {
        return null;
    }

    public CMIUser getUser() {
        return null;
    }
}
