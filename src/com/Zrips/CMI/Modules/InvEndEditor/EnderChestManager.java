package com.Zrips.CMI.Modules.InvEndEditor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.Snd;

public class EnderChestManager {

    private HashMap<UUID, EndWatcher> WatcherList = new HashMap<UUID, EndWatcher>();

    private CMI plugin;

    public EnderChestManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void removeWatcher(Player player) {
	WatcherList.remove(player.getUniqueId());
    }

    public boolean isWatching(Player player) {
	return WatcherList.containsKey(player.getUniqueId());
    }

    public EndWatcher getWatcher(Player player) {
	return WatcherList.get(player.getUniqueId());
    }

    public boolean openEnderChest(Player player, Player target) {
	return isWatching(player);
    }

    public boolean updateTargetEnderChest(Player player) {
	return true;
    }

}
