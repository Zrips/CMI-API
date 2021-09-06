package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class HologramListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdateRange;
    protected Map<UUID, Long> stickyLastUpdate;

    public HologramListener(CMI plugin) {
	this.plugin = plugin;
	lastUpdateRange = new HashMap<UUID, Long>();
	stickyLastUpdate = new HashMap<UUID, Long>();
    }

}
