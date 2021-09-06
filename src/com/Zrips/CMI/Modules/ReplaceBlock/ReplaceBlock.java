package com.Zrips.CMI.Modules.ReplaceBlock;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;

@SuppressWarnings("deprecation")
public class ReplaceBlock {

    public Pattern regionPattern = Pattern.compile("r\\.([0-9-]+)\\.([0-9-]+)\\.mca");
    public ConcurrentHashMap<String, BRInfo> BRInfo = new ConcurrentHashMap<String, BRInfo>();
    private CMI plugin;

    public ReplaceBlock(CMI plugin) {
	this.plugin = plugin;
    }

    public void start(final BRInfo scan) {
	if (scan.getStartTime() == 0L)
	    scan.setShowInfo(System.currentTimeMillis());
	loadChunk(scan);
    }

    private void loadChunk(final BRInfo scan) {

    }
}
