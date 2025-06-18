package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.List;
import java.util.regex.Pattern;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class HeadDropListener implements Listener {
    private CMI plugin;
    String HEX_PATTERN;
    Pattern pattern;

    public HeadDropListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerCombatEvent(EntityDamageEvent event) {
    }

    private static void drop(Player owner, ItemStack skull, List<String> lore) {
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void BlockBreakEvent(BlockBreakEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onEntityDeath(EntityDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerDeath(EntityDeathEvent event) {
    }
}
