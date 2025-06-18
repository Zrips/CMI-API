package com.Zrips.CMI.Modules.Afk;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import com.Zrips.CMI.CMI;

public class AfkListener1_8 implements Listener {
    private CMI plugin;

    public AfkListener1_8(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void PlayerInteractEntityEvent(PlayerInteractAtEntityEvent event) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onSplashPotion(PotionSplashEvent event) {
    }
}
