package com.Zrips.CMI.utils;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.OfflinePlayer;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class Purge {

    private CMITask purgeId = null;
    public boolean running = false;
    private CMI plugin;

    HashMap<PurgeType, Integer> map = new HashMap<PurgeType, Integer>();

    private boolean CleanOnStart;
    private int OfflineDays;
    private boolean PlayerDataEnabled;
    private String PlayerDataSourceFolder;
    private boolean PlayerDataDeleteFiles;
    private String PlayerDataDestinationFolder;
    private boolean PlayerStatsEnabled;
    private String PlayerStatsSourceFolder;
    private boolean PlayerStatsDeleteFiles;
    private String PlayerStatsDestinationFolder;
    private boolean PlayerAdvancementsEnabled;
    private String PlayerAdvancementsSourceFolder;
    private boolean PlayerAdvancementsDeleteFiles;
    private String PlayerAdvancementsDestinationFolder;
    private boolean EssentialsEnabled;
    private String EssentialsSourceFolder;
    private boolean EssentialsDeleteFiles;
    private String EssentialsDestinationFolder;
    private boolean LwcEnabled;

    public enum PurgeType {
        PlayerData, PlayerStat, PlayerAdvancements, Essentials, Lwc
    }

    public Purge(CMI plugin) {
        this.plugin = plugin;
        fillZero();
    }

    public void loadConfig() {

    }

    public void initialize() {

    }

    private void fillZero() {
        map.clear();
        for (PurgeType one : PurgeType.values()) {
            map.put(one, 0);
        }
    }

    private static OfflinePlayer[] offPlayers;
    private static int x = 0;
    private static int count = 0;

    public void StartingPurge() {

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

    public boolean isCleanOnStart() {
        return CleanOnStart;
    }

    public boolean isPlayerDataEnabled() {
        return PlayerDataEnabled;
    }

    public boolean isPlayerStatsEnabled() {
        return PlayerStatsEnabled;
    }
}
