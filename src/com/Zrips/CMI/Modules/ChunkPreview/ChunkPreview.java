package com.Zrips.CMI.Modules.ChunkPreview;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ChunkPreviewInfo;

public class ChunkPreview {
    public ConcurrentHashMap<UUID, ChunkPreviewInfo> Info;
    private CMI plugin;

    public ChunkPreview(CMI plugin) {
    }

    public void clearCache(UUID uuid) {
    }

    public void loadRegionFile(ChunkPreviewInfo scan) {
    }

    private void loadChunk(ChunkPreviewInfo scan) {
    }
}
