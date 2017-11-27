package com.Zrips.CMI.Modules.Region;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;

import com.Zrips.CMI.CMI;

public class RegionListener implements Listener {
    private CMI plugin;

    public RegionListener(CMI plugin) {
	this.plugin = plugin;
    }

    @EventHandler
    public void ChunkPopulateEvent(ChunkPopulateEvent event) {
    }

    @EventHandler
    public void ChunkPopulateRecord(ChunkPopulateEvent event) {
    }
}
