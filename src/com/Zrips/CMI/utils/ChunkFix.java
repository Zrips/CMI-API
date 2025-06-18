package com.Zrips.CMI.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.FixChunkInfo;

public class ChunkFix {
    public Pattern regionPattern;
    public ConcurrentHashMap<String, FixChunkInfo> ChunkFix;
    private CMI plugin;

    public ChunkFix(CMI plugin) {
    }

    public void loadRegionFile(FixChunkInfo scan) {
    }

    private void loadChunk(FixChunkInfo scan) {
    }
}
