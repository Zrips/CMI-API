package com.Zrips.CMI.Modules.AStand;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class ArmorStandListener implements Listener {
    private CMI plugin;

    public ArmorStandListener(CMI plugin) {
	this.plugin = plugin;
    }

    public static HashMap<UUID, ArmorStandCopy> acMap = new HashMap<UUID, ArmorStandCopy>();

}
