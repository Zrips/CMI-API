package com.Zrips.CMI.Modules.Portals;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class PortalListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdate;
    protected Map<UUID, Long> lastUpdateRange;

    public PortalListener(CMI plugin) {
	this.plugin = plugin;
	lastUpdate = new HashMap<UUID, Long>();
	lastUpdateRange = new HashMap<UUID, Long>();
    }
}
