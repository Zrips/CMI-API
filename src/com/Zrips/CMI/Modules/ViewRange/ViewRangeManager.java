package com.Zrips.CMI.Modules.ViewRange;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class ViewRangeManager {

    public ConcurrentHashMap<String, ViewRangeInfo> Info = new ConcurrentHashMap<String, ViewRangeInfo>();
    public List<ViewRangeInfo> ChunkSendQuee = new ArrayList<ViewRangeInfo>();
    public List<ViewRangeInfo> ChunkUnloadQuee = new ArrayList<ViewRangeInfo>();
    public boolean SendRunning = false;
    public boolean UnloadRunning = false;
    private CMI plugin;

    public ViewRangeManager(CMI plugin) {
        this.plugin = plugin;
    }

    public int getRangeFromPerm(Player player) {
        return 1;
    }

    public void FillOnMove(final ViewRangeInfo scan) {

    }

    private void unloadChunks(final ViewRangeInfo scan) {

    }

    private void addToUnloadQuee(ViewRangeInfo scan) {

    }

    private void getNextUnload() {

    }

    private void addToSendQuee(ViewRangeInfo scan) {

    }

    private void getNextLoad() {

    }

    private void sendChunk(final ViewRangeInfo scan) {

    }

    public void loadChunk(final ViewRangeInfo scan) {

    }
}
