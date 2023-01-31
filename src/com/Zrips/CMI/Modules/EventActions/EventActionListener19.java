package com.Zrips.CMI.Modules.EventActions;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.EventActions.EventActionManager.eventAction;

public class EventActionListener19 implements Listener {
    private CMI plugin;

    public EventActionListener19(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {

    }
}
