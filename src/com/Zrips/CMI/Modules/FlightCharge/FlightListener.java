package com.Zrips.CMI.Modules.FlightCharge;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class FlightListener implements Listener {
    private CMI plugin;

    static HashMap<UUID, traveledDistance> distanceMap = new HashMap<UUID, traveledDistance>();

    public FlightListener(CMI plugin) {
	this.plugin = plugin;
    }


}
