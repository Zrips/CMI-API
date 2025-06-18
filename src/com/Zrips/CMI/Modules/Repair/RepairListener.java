package com.Zrips.CMI.Modules.Repair;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIAnvilItemRepairEvent;
import com.Zrips.CMI.events.CMIArmorChangeEvent;

public class RepairListener implements Listener {
    private CMI plugin;

    public RepairListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void CMIAnvilItemRepairEvent(CMIAnvilItemRepairEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerPickupItemEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerItemHeldEvent(PlayerItemHeldEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void CMIArmorChangeEvent(CMIArmorChangeEvent event) {
    }
}
