package com.Zrips.CMI.Modules.ChunkPreview;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ChunkPreviewInfo;

public class ChunkPreview {

    public ConcurrentHashMap<UUID, ChunkPreviewInfo> Info = new ConcurrentHashMap<UUID, ChunkPreviewInfo>();
    private CMI plugin;

    public ChunkPreview(CMI plugin) {
	this.plugin = plugin;
    }
    
    
    public void clearCache(UUID uuid) {
	Info.remove(uuid);
    }

    public void loadRegionFile(ChunkPreviewInfo scan) {
	if (scan.getStartTime() == 0L)
	    scan.setShowInfo(System.currentTimeMillis());
	loadChunk(scan);
    }

    private void loadChunk(final ChunkPreviewInfo scan) {

    }
}
