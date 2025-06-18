package com.Zrips.CMI.Modules.Signs;

import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import com.Zrips.CMI.CMI;

public class PlayerSignEditListeners implements Listener {
    private CMI plugin;
    Set<UUID> signEditCache;

    public PlayerSignEditListeners(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onSignChangeEvent(SignChangeEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onSignInteractShift(PlayerInteractEvent event) {
    }

    private static void disableNCP(Player player, boolean placeExcempt) {
    }
}
