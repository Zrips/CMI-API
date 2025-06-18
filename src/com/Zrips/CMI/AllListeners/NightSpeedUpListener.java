package com.Zrips.CMI.AllListeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

import com.Zrips.CMI.CMI;

public class NightSpeedUpListener implements Listener {
    private CMI plugin;

    public NightSpeedUpListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerBedEnterEvent(PlayerBedEnterEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerBedLeaveEvent(PlayerBedLeaveEvent event) {
    }
}
