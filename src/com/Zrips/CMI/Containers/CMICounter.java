package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

public class CMICounter {
    private static HashMap<UUID, HashMap<String, Long>> counters;

    public static boolean isJoinedCounter(UUID uuid) {
        return false;
    }

    public static void setJoinedCounter(UUID uuid, boolean joinedCounter) {
    }

    public static HashMap<String, Long> getCounter(UUID uuid) {
        return null;
    }
}
