package com.Zrips.CMI.Modules.FindBiome;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class FindBiomeManager {
    public ConcurrentHashMap<UUID, FindBiomeInfo> FindBiomeInfo;
    private CMI plugin;

    public FindBiomeManager(CMI plugin) {
    }

    public boolean stop(Player player) {
        return false;
    }

    public void start(FindBiomeInfo scan) {
    }

    @SuppressWarnings("deprecation")
    private void loadChunk(FindBiomeInfo scan) {
    }
}
