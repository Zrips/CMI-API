package com.Zrips.CMI.Modules.Skin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

import com.Zrips.CMI.CMI;

public class SkinListener implements Listener {
    private CMI plugin;

    public SkinListener(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPlayerLogin(PlayerLoginEvent event) {
    }
}
