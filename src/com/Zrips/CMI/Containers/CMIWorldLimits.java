package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Nullable;

import org.bukkit.GameMode;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class CMIWorldLimits {
    private static boolean worldLimits;
    private static boolean flyAboveRoof;
    private static HashMap<String, GameMode> worldGameMode;
    private static HashMap<String, Boolean> worldFlyMode;
    private static HashMap<String, Boolean> worldGodMode;
    private static HashMap<String, Boolean> worldElytraMode;
    private static HashMap<String, Integer> flyAboveRoofLimitations;
    private static HashMap<String, List<SpawnReason>> blockedSpawnReasons;
    private static boolean reenabledFlyAfterDeath;

    public static void loadConfig() {
    }

    public static boolean isBlockedSpawnReason(String worldName, SpawnReason reason) {
        return false;
    }

    public static boolean isWorldLimits() {
        return false;
    }

    public static boolean isFlyAboveRoof() {
        return false;
    }

    public static HashMap<String, List<SpawnReason>> getBlockedSpawnReasons() {
        return null;
    }

    public static HashMap<String, Integer> getFlyAboveRoofLimitationsMap() {
        return null;
    }

    public static HashMap<String, Boolean> getWorldElytraMode() {
        return null;
    }

    public static HashMap<String, Boolean> getWorldGodMode() {
        return null;
    }

    public static HashMap<String, Boolean> getWorldFlyMode() {
        return null;
    }

    public static HashMap<String, GameMode> getWorldGameMode() {
        return null;
    }

    @Nullable
    public static Integer getFlyAboveRoof(String worldName) {
        return null;
    }

    public static GameMode getWorldGameMode(String worldName) {
        return null;
    }

    public static boolean isGameModeLimited(String worldName) {
        return false;
    }

    @Nullable
    public static Boolean getWorldFlyMode(String worldName) {
        return null;
    }

    public static boolean isFlyModeLimited(String worldName) {
        return false;
    }

    @Nullable
    public static Boolean getWorldGodMode(String worldName) {
        return null;
    }

    public static boolean isGodModeLimited(String worldName) {
        return false;
    }

    @Nullable
    public static Boolean getWorldElytraMode(String worldName) {
        return null;
    }

    public static boolean isElytraModeLimited(String worldName) {
        return false;
    }

    public static boolean isReenabledFlyAfterDeath() {
        return false;
    }
}
