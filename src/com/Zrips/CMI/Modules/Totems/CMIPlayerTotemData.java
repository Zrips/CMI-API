package com.Zrips.CMI.Modules.Totems;

import java.util.HashMap;
import java.util.UUID;

public class CMIPlayerTotemData {
    private long totemCooldown;
    private long totemWarmup;
    private static HashMap<UUID, CMIPlayerTotemData> data;

    public long getTotemCooldown() {
        return 0;
    }

    public CMIPlayerTotemData setTotemCooldown(long totemCooldown) {
        return null;
    }

    public long getTotemWarmup() {
        return 0;
    }

    public CMIPlayerTotemData setTotemWarmup(long totemWarmup) {
        return null;
    }

    public static void removeData(UUID uuid) {
    }

    public static long getTotemCooldown(UUID uuid) {
        return 0;
    }

    public static void setTotemCooldown(UUID uuid, long totemCooldown) {
    }

    public static long getTotemWarmup(UUID uuid) {
        return 0;
    }

    public static void setTotemWarmup(UUID uuid, long totemWarmup) {
    }
}
