package com.Zrips.CMI.Modules.LightFix;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import com.Zrips.CMI.CMI;

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
