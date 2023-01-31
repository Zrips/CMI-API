package com.Zrips.CMI.Modules.FindBiome;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class FindBiomeManager {

    public ConcurrentHashMap<UUID, FindBiomeInfo> FindBiomeInfo = new ConcurrentHashMap<UUID, FindBiomeInfo>();
    private CMI plugin;
//    private static Integer count = 0;

    public FindBiomeManager(CMI plugin) {
        this.plugin = plugin;
    }

    public boolean stop(Player player) {

        return false;
    }

    public void start(FindBiomeInfo scan) {

    }

    @SuppressWarnings("deprecation")
    private void loadChunk(final FindBiomeInfo scan) {

    }

}
