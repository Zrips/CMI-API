package com.Zrips.CMI.Modules.BlueMap;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIWarpCreateEvent;
import com.Zrips.CMI.events.CMIWarpRemoveEvent;

public class BlueMapListener implements Listener {
    private CMI plugin;

    public BlueMapListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onCMIWarpCreateEvent(CMIWarpCreateEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onCMIWarpRemoveEvent(CMIWarpRemoveEvent event) {
    }
}
