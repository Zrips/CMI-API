package com.Zrips.CMI.Modules.ViewRange;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ChunkInfo;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class ViewRangeListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onLogIn(PlayerJoinEvent event) {
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onJoin(PlayerTeleportEvent event) {

    }
}
