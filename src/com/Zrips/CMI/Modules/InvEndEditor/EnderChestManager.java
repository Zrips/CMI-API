package com.Zrips.CMI.Modules.InvEndEditor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class EnderChestManager {

    private HashMap<UUID, EndWatcher> WatcherList = new HashMap<UUID, EndWatcher>();
    private HashMap<UUID, EndWatcher> WatchedList = new HashMap<UUID, EndWatcher>();

    private CMI plugin;

    public EnderChestManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void removeWatcher(Player player) {
        EndWatcher ers = WatcherList.remove(player.getUniqueId());
        if (ers != null)
            WatchedList.remove(ers.getTarget().getUniqueId());
    }

    public boolean isWatching(Player player) {
        return WatcherList.containsKey(player.getUniqueId());
    }

    public boolean isBeingWatched(Player player) {
        return WatchedList.containsKey(player.getUniqueId());
    }

    public EndWatcher getWatcher(Player player) {
        return WatcherList.get(player.getUniqueId());
    }

    public EndWatcher getSlave(Player player) {
        return WatchedList.get(player.getUniqueId());
    }

    public boolean openEnderChest(Player player, Player target) { 
        return false;
    }

    public boolean updateTargetEnderChest(Player player) {
        return true;
    }

}
