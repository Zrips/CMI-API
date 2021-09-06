package com.Zrips.CMI.Modules.Jail;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;

public class JailListener implements Listener {
    private CMI plugin;

    protected Map<UUID, Long> lastUpdate;

    public JailListener(CMI plugin) {
	this.plugin = plugin;
	lastUpdate = new HashMap<UUID, Long>();
    }

}
