package com.Zrips.CMI.Modules.InvEndEditor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class EnderChestManager {
    private HashMap<UUID, EndWatcher> WatcherList;
    private HashMap<UUID, EndWatcher> WatchedList;
    private CMI plugin;

    public EnderChestManager(CMI plugin) {
    }

    public void removeWatcher(Player player) {
    }

    public boolean isWatching(Player player) {
        return false;
    }

    public boolean isBeingWatched(Player player) {
        return false;
    }

    public EndWatcher getWatcher(Player player) {
        return null;
    }

    public EndWatcher getSlave(Player player) {
        return null;
    }

    public boolean openEnderChest(Player player, Player target) {
        return false;
    }

    public boolean updateTargetEnderChest(Player player) {
        return false;
    }
}
