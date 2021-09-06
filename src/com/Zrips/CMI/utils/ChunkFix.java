package com.Zrips.CMI.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.FixChunkInfo;

public class ChunkFix {

    public Pattern regionPattern = Pattern.compile("r\\.([0-9-]+)\\.([0-9-]+)\\.mca");
    public ConcurrentHashMap<String, FixChunkInfo> ChunkFix = new ConcurrentHashMap<String, FixChunkInfo>();
    private CMI plugin;

    public ChunkFix(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadRegionFile(final FixChunkInfo scan) {
    }

    private void loadChunk(final FixChunkInfo scan) {

    }
}
