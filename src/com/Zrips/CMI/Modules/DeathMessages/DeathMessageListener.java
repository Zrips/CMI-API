package com.Zrips.CMI.Modules.DeathMessages;

import java.util.regex.Pattern;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.Zrips.CMI.CMI;

public class DeathMessageListener implements Listener {
    private CMI plugin;

    public DeathMessageListener(CMI plugin) {
        this.plugin = plugin;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void playerDamageEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void PlayerCombatEvent(EntityDamageEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onQuit(PlayerDeathEvent event) {
    }

    private void processEvent(EntityDamageEvent event) {

    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerDeathEvent(PlayerDeathEvent event) {

    }

    private static CMIDeathMsgInfo temp = null;

    Pattern pattern = Pattern.compile("(\\[)([^\"^\\[^\\]^ ]+)(\\])");

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerDeathEventHighest(PlayerDeathEvent event) {

    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerDeathEventMonitor(PlayerDeathEvent event) {

    }

}
