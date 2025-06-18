package com.Zrips.CMI.Modules.ReplaceBlock;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import com.Zrips.CMI.CMI;

public class ReplaceBlock {
    public Pattern regionPattern;
    public ConcurrentHashMap<String, BRInfo> BRInfo;
    private CMI plugin;

    public ReplaceBlock(CMI plugin) {
    }

    public void start(BRInfo scan) {
    }

    private void loadChunk(BRInfo scan) {
    }
}
