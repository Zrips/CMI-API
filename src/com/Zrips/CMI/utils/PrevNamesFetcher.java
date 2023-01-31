package com.Zrips.CMI.utils;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class PrevNamesFetcher {

    private CMI plugin;

    private HashMap<UUID, String> names = new HashMap<UUID, String>();

    public PrevNamesFetcher(CMI plugin) {
        this.plugin = plugin;
    }

    public void check(final Player player) {

    }

    public List<String> start(Player player) {

        return null;
    }

    public HashMap<String, Long> getWithTime(OfflinePlayer player) {

        return null;
    }

    public UUID getUUID(String name) {

        return null;
    }

    public String getPrevNames(UUID uuid, boolean update) {

        return null;
    }
}
