package com.Zrips.CMI.Modules.LightFix;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.World;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Region.CMIRegion;
import com.Zrips.CMI.Modules.Region.WorldInfo;

public class LightFix {

    public ConcurrentHashMap<UUID, LightFixInfo> LFInfo = new ConcurrentHashMap<UUID, LightFixInfo>();
    private CMI plugin;

    public LightFix(CMI plugin) {
	this.plugin = plugin;
    }

    public void start(LightFixInfo scan) {
	if (scan.getStartTime() == 0L)
	    scan.setShowInfo(System.currentTimeMillis());
	loadChunk(scan);
    }

    private void loadChunk(final LightFixInfo info) {

    }
}
