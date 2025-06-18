package com.Zrips.CMI.Modules.MoneyCheque;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIAnvilItemRenameEvent;

public class MoneyChequeListener implements Listener {
    private CMI plugin;

    public MoneyChequeListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerInteractOneTime(PlayerInteractEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void playerInteractOneTime(CMIAnvilItemRenameEvent event) {
    }
}
