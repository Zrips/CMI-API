package com.Zrips.CMI.Modules.Anvil;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIAnvilItemRenameEvent;

public class AnvilColorRenameListener implements Listener {
    private CMI plugin;

    public AnvilColorRenameListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void CMIItemRenameEvent(CMIAnvilItemRenameEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PrepareAnvilEvent(final PrepareAnvilEvent event) {

    }
}
