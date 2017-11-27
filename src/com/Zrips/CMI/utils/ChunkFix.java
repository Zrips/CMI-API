package com.Zrips.CMI.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ChunkInfo;
import com.Zrips.CMI.Containers.FixChunkInfo;
import com.Zrips.CMI.Containers.RegionFiles;

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
