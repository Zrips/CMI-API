package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class SignListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdateRange;

    public SignListener(CMI plugin) {
	this.plugin = plugin;
	lastUpdateRange = new HashMap<UUID, Long>();
    }

}
