package com.Zrips.CMI.Containers;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.BanEntry;

public class CMIBanRecords {

    private static HashMap<UUID, CMIBanEntry> banCache = new HashMap<UUID, CMIBanEntry>();

    public static CMIBanEntry getBanEntryRaw(UUID uuid) {
        return banCache.get(uuid);
    }

    public static CMIBanEntry getBanEntry(UUID uuid) {
        return null;
    }

    public static CMIBanEntry addBanEntry(UUID uuid, CMIBanEntry entry) {
        return banCache.put(uuid, entry);
    }

    public static CMIBanEntry removeBanEntry(UUID uuid) {
        return banCache.remove(uuid);
    }

    public static void updateBanEntry(CMIUser user, BanEntry entry) {
    }

    public static CMIUser setBanned(CMIUser user, String reason, CMIUser by, Date until, Date when) {
        return null;
    }

    public static CMIUser unBan(CMIUser user) {
        return null;
    }
}
