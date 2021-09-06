package com.Zrips.CMI.Modules.SilentChest;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.SilentChest;

public class silentChestListener implements Listener {

    private HashMap<UUID, SilentChest> silentChest = new HashMap<UUID, SilentChest>();
    public static HashMap<UUID, Boolean> ToggledSilentChest = new HashMap<UUID, Boolean>();
    private CMI plugin;

    private HashMap<UUID, Long> sleep = new HashMap<UUID, Long>();

    public silentChestListener(CMI plugin) {
	this.plugin = plugin;
    }

}
