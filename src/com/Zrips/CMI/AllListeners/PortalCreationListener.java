package com.Zrips.CMI.AllListeners;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPortalCreateEvent;

public class PortalCreationListener implements Listener {
    private CMI plugin;

    public PortalCreationListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void PortalCreateEvent(PortalCreateEvent event) {
    }

    @EventHandler(priority = EventPriority.LOW)
    public void CMIPortalCreateEvent(CMIPortalCreateEvent event) {
    }

    private CMIPortalCreateEvent proccessEvent(PortalCreateEvent e) {
        return null;
    }

    private static Block getMiddleBlock(ArrayList<Location> blocks) {
        return null;
    }
}
