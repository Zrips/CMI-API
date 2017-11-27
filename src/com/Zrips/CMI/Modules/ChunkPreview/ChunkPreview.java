package com.Zrips.CMI.Modules.ChunkPreview;

import java.util.concurrent.ConcurrentHashMap;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ChunkPreviewInfo;

public class ChunkPreview {

    public ConcurrentHashMap<String, ChunkPreviewInfo> Info = new ConcurrentHashMap<String, ChunkPreviewInfo>();
    private CMI plugin;

    public ChunkPreview(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadRegionFile(ChunkPreviewInfo scan) {
	if (scan.getStartTime() == 0L)
	    scan.setShowInfo(System.currentTimeMillis());
	loadChunk(scan);
    }

    private void loadChunk(final ChunkPreviewInfo scan) {

    }
}
