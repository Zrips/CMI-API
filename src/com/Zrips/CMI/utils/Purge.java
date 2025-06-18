package com.Zrips.CMI.utils;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.OfflinePlayer;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class Purge {
    private CMITask purgeId;
    public boolean running;
    private CMI plugin;
    HashMap<PurgeType, Integer> map;
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
    private static OfflinePlayer offPlayers;
    private static int x;
    private static int count;

    public Purge(CMI plugin) {
    }

    public void loadConfig() {
    }

    public void initialize() {
    }

    private void fillZero() {
    }

    public void StartingPurge() {
    }

    private void addValue(PurgeType type) {
    }

    private void addValue(PurgeType type, int amount) {
    }

    public boolean purgePlayerAdvancementsFiles(UUID uuid, boolean chekcIfEnabled) {
        return false;
    }

    public boolean purgePlayerDataFiles(UUID uuid, boolean chekcIfEnabled) {
        return false;
    }

    public boolean purgePlayerStatsFiles(UUID uuid, boolean chekcIfEnabled) {
        return false;
    }

    public void purgeEssentialsFiles(UUID uuid) {
    }

    public void purgeLWC(UUID uuid) {
    }

    public boolean isCleanOnStart() {
        return false;
    }

    public boolean isPlayerDataEnabled() {
        return false;
    }

    public boolean isPlayerStatsEnabled() {
        return false;
    }

    public enum PurgeType {
        PlayerData, PlayerStat, PlayerAdvancements, Essentials, Lwc;
    }
}
