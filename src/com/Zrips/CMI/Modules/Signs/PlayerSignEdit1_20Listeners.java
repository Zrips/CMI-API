package com.Zrips.CMI.Modules.Signs;

import java.util.Set;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSignOpenEvent;

import com.Zrips.CMI.CMI;

public class PlayerSignEdit1_20Listeners implements Listener {
    private CMI plugin;
    Set<UUID> signEditCache;

    public PlayerSignEdit1_20Listeners(CMI plugin) {
    }

    @EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
    public void onPlayerSignOpenEvent(PlayerSignOpenEvent event) {
    }

    private static void disableNCP(Player player, boolean placeExcempt) {
    }
}
