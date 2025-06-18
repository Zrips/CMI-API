package com.Zrips.CMI.Modules.Elytra;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import com.Zrips.CMI.CMI;

public class ElytraLaunchListener implements Listener {
    private CMI plugin;
    HashMap<UUID, CMILaunch> map;

    public ElytraLaunchListener(CMI plugin) {
    }

    @EventHandler
    public void onSneakEnd(PlayerToggleSneakEvent event) {
    }

    @EventHandler
    public void onMoveRemove(PlayerMoveEvent event) {
    }

    @EventHandler
    public void onElytraLaunch(PlayerInteractEvent event) {
    }

    private class CMILaunch {
        private Long started;
        private Long lastCharge;

        public Long getStarted() {
            return null;
        }

        public Long getLastCharge() {
            return null;
        }

        public void setLastCharge() {
        }

        public boolean isFullyCharged() {
            return false;
        }
    }
}
