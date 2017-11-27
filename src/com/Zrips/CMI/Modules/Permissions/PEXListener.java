package com.Zrips.CMI.Modules.Permissions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

import ru.tehkode.permissions.events.PermissionEntityEvent;

public class PEXListener implements Listener {

    private CMI plugin;

    public PEXListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void BlockPlaceEvent(PermissionEntityEvent event) {
	CMIUser user = plugin.getPlayerManager().getUser(event.getEntityIdentifier());
    }

}
