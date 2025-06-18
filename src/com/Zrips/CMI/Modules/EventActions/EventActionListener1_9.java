package com.Zrips.CMI.Modules.EventActions;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

import com.Zrips.CMI.CMI;

public class EventActionListener1_9 implements Listener {
    private CMI plugin;

    public EventActionListener1_9(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void EntityToggleGlideEvent(EntityToggleGlideEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void PlayerSwapHandItemsEventCancel(PlayerSwapHandItemsEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerSwapHandItemsEvent(PlayerSwapHandItemsEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryClick(InventoryClickEvent event) {
    }
}
