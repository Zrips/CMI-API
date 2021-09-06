package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class PlayerItemDamageListener implements Listener {
    private CMI plugin;

    public PlayerItemDamageListener(CMI plugin) {
	this.plugin = plugin;
    }

    HashMap<UUID, Long> informed = new HashMap<UUID, Long>();

}
