package com.Zrips.CMI.utils;

import java.io.File;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.VersionChecker.Version;

public class Purge {

    private int purgeId = -1;
    public boolean running = false;
    private CMI plugin;

    HashMap<PurgeType, Integer> map = new HashMap<PurgeType, Integer>();

    public enum PurgeType {
	PlayerData, PlayerStat, PlayerAdvancements, Essentials, Lwc
    }

    public Purge(CMI plugin) {
	this.plugin = plugin;
	fillZero();
    }

    public void initialize() {

    }

    private void fillZero() {
    }

    public void StartingPurge(final OfflinePlayer[] offPlayers, final int x, final int count) {

    }

    private void addValue(PurgeType type) {
	addValue(type, 1);
    }

    private void addValue(PurgeType type, int amount) {
	map.put(type, map.get(type) + amount);
    }

    public boolean purgePlayerAdvancementsFiles(UUID uuid, boolean chekcIfEnabled) {

	return true;
    }

    public boolean purgePlayerDataFiles(UUID uuid, boolean chekcIfEnabled) {

	return true;
    }

    public boolean purgePlayerStatsFiles(UUID uuid, boolean chekcIfEnabled) {

	return true;
    }

    public void purgeEssentialsFiles(UUID uuid) {
    }

    public void purgeLWC(UUID uuid) {
    }
}
