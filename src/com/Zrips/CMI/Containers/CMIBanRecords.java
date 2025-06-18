package com.Zrips.CMI.Containers;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.BanEntry;
import org.bukkit.BanList;
import org.bukkit.entity.Player;

public class CMIBanRecords {
    private static HashMap<UUID, CMIBanEntry> banCache;
    static Method banPaperMethod;
    static Method pardonPaperMethod;
    static Method getBanPaperMethod;

    public static CMIBanEntry getBanEntryRaw(UUID uuid) {
        return null;
    }

    public static CMIBanEntry getBanEntry(UUID uuid) {
        return null;
    }

    public static CMIBanEntry addBanEntry(UUID uuid, CMIBanEntry entry) {
        return null;
    }

    public static CMIBanEntry removeBanEntry(UUID uuid) {
        return null;
    }

    public static void updateBanEntry(CMIUser user, BanEntry entry) {
    }

    public static CMIBanEntry getBanEntry(CMIUser user, boolean update) {
        return null;
    }

    public static CMIUser setBanned(CMIUser user, String reason, CMIUser by, Date until, Date when) {
        return null;
    }

    public static CMIUser unBan(CMIUser user) {
        return null;
    }

    public static BanEntry getBanEntryByIP(String ip) {
        return null;
    }

    @Nullable
    public static BanEntry getBanEntry(CMIUser user) {
        return null;
    }

    @Nullable
    public static BanEntry getBanEntry(Player player) {
        return null;
    }

    @Nullable
    public static BanEntry getBanEntry(UUID uuid, String name) {
        return null;
    }

    @Nullable
    public static BanEntry addBan(UUID uuid, String name, String reason, Date date, String source) {
        return null;
    }

    @Nullable
    public static BanEntry addBanByIP(String ip, String reason, Date date, String source) {
        return null;
    }

    @Nullable
    public static void pardon(UUID uuid, String name) {
    }

    @Nullable
    public static void pardonByIP(String ip) {
    }

    @Nullable
    public static BanList<?> getBanEntriesByIP() {
        return null;
    }

    @Nullable
    public static BanList<?> getBanEntries() {
        return null;
    }
}
