package com.Zrips.CMI.Modules.ViewRange;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class ViewRangeManager {
    public ConcurrentHashMap<String, ViewRangeInfo> Info;
    public List<ViewRangeInfo> ChunkSendQuee;
    public List<ViewRangeInfo> ChunkUnloadQuee;
    public boolean SendRunning;
    public boolean UnloadRunning;
    private CMI plugin;

    public ViewRangeManager(CMI plugin) {
    }

    public int getRangeFromPerm(Player player) {
        return 0;
    }

    public void FillOnMove(ViewRangeInfo scan) {
    }

    private void unloadChunks(ViewRangeInfo scan) {
    }

    private void addToUnloadQuee(ViewRangeInfo scan) {
    }

    private void getNextUnload() {
    }

    private void addToSendQuee(ViewRangeInfo scan) {
    }

    private void getNextLoad() {
    }

    private void sendChunk(ViewRangeInfo scan) {
    }

    public void loadChunk(ViewRangeInfo scan) {
    }
}
