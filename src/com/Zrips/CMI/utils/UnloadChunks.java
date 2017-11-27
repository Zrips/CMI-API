package com.Zrips.CMI.utils;

import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.UCInfo;

public class UnloadChunks {

    public ConcurrentHashMap<String, UCInfo> ucinfo = new ConcurrentHashMap<String, UCInfo>();
    private CMI plugin;

    public UnloadChunks(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadRegionFile(final UCInfo scan) {
	if (scan.getStartTime() == 0L)
	    scan.setShowInfo(System.currentTimeMillis());
	loadChunk(scan);
    }

    private void loadChunk(final UCInfo scan) {

    }
}
