package com.Zrips.CMI.Modules.Enchants;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class EnchantListener implements Listener {
    private CMI plugin;

    public EnchantListener(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PrepareItemEnchantEvent(PrepareItemEnchantEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void InventoryCloseEvent(InventoryCloseEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerInteractEntityEvent(PlayerInteractAtEntityEvent event) {

    }

}
