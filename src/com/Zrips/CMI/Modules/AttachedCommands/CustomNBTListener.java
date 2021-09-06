package com.Zrips.CMI.Modules.AttachedCommands;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class CustomNBTListener implements Listener {
    private CMI plugin;

    public CustomNBTListener(CMI plugin) {
	this.plugin = plugin;
    }

    private static HashMap<UUID, Long> timer = new HashMap<UUID, Long>();

    private static HashMap<UUID, HashMap<Integer, itemCooldown>> cooldownMap = new HashMap<UUID, HashMap<Integer, itemCooldown>>();

    public static void clearCache(UUID uuid) {
	timer.remove(uuid);
    }

}
