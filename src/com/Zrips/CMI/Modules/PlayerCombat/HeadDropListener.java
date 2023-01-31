package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.regex.Pattern;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

import com.Zrips.CMI.CMI;

public class HeadDropListener implements Listener {
    private CMI plugin;

    public HeadDropListener(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void PlayerCombatEvent(EntityDamageEvent event) {

    }

    String HEX_PATTERN = "([a-zA-Z0-9+/]{32,}+={0,2})";
    Pattern pattern = Pattern.compile(HEX_PATTERN);

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
