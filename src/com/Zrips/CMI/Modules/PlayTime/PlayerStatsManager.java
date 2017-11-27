package com.Zrips.CMI.Modules.PlayTime;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.Statistic;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;
import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;

public class PlayerStatsManager {

    private CMI plugin;
    private BukkitTask task;
    SortedMap<Long, CMIUser> sm = new TreeMap<Long, CMIUser>(Collections.reverseOrder());
    SortedMap<UUID, Long> smt = new TreeMap<UUID, Long>();
    private boolean loaded = false;

    public PlayerStatsManager(CMI plugin) {
	this.plugin = plugin;
    }

    public boolean isScanning() {
	return task != null;
    }

    public boolean isDataLoaded() {
	return loaded;
    }

    public int getPages() {
	return sm.size() / 10;
    }

    public void addUserData(CMIUser user) {
    }

    public SortedMap<Long, CMIUser> getTop(int from, int to) {
	return null;
    }

    public int getPlace(CMIUser user) {
	return 0;
    }

    public void loadStats(final CommandSender sender, final String targetName) {
	
    }

    private static Long getPlayTime(Player player) {
	return null;
    }

}
