package com.Zrips.CMI.AllListeners;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class UserEvents implements Listener {
    private CMI plugin;

    public UserEvents(CMI plugin) {
	this.plugin = plugin;
    }

    private HashMap<UUID, Long> weMap = new HashMap<UUID, Long>();

    HashMap<UUID, Long> informer = new HashMap<UUID, Long>();

}
