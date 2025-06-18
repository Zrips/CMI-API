package com.Zrips.CMI.Modules.Afk;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;
import org.bukkit.event.entity.LingeringPotionSplashEvent;

import com.Zrips.CMI.CMI;

public class AfkListener1_9 implements Listener {
    private CMI plugin;

    public AfkListener1_9(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onLingeringSplashPotion(LingeringPotionSplashEvent event) {
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onLingeringEffectApply(AreaEffectCloudApplyEvent event) {
    }
}
