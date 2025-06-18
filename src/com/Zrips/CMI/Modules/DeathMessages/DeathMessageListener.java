package com.Zrips.CMI.Modules.DeathMessages;

import java.util.regex.Pattern;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class DeathMessageListener implements Listener {
    private CMI plugin;
    private static CMIDeathMsgInfo temp;
    Pattern pattern;

    public DeathMessageListener(CMI plugin) {
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

    private CMIDeathMsgInfo getKillerInfo(CMIUser user) {
        return null;
    }

    private CMIKillerInfo getKillerInfo(Player victim, damageInformation lastDamage) {
        return null;
    }

    private static void calculateBasePath(CMIDeathMsgInfo info) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerDeathEvent(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onPlayerDeathEventHighest(PlayerDeathEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onPlayerDeathEventMonitor(PlayerDeathEvent event) {
    }
}
