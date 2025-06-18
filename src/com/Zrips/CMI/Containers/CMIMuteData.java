package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

public class CMIMuteData {
    private long mutedUntil;
    private long shadowMutedUntil;
    private String mutedReason;
    private static HashMap<UUID, CMIMuteData> muted;

    public long getMutedUntil() {
        return 0;
    }

    public CMIMuteData setMutedUntil(long mutedUntil) {
        return null;
    }

    public long getShadowMutedUntil() {
        return 0;
    }

    public CMIMuteData setShadowMutedUntil(long shadowMutedUntil) {
        return null;
    }

    public String getMutedReason() {
        return null;
    }

    public CMIMuteData setMutedReason(String mutedReason) {
        return null;
    }

    public static String getMutedReason(UUID uuid) {
        return null;
    }

    public static void setMutedReason(UUID uuid, String reason) {
    }

    public static Long getMutedUntil(UUID uuid) {
        return null;
    }

    public static boolean isMuted(UUID uuid) {
        return false;
    }

    public static void setMutedUntil(UUID uuid, long mutedUntil) {
    }

    public static long getShadowMutedUntil(UUID uuid) {
        return 0;
    }

    public static void setShadowMutedUntil(UUID uuid, long shadowMutedUntil) {
    }

    public static boolean isShadowMuted(UUID uuid) {
        return false;
    }
}
