package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.UUID;

public class CMICounter {

    private static HashMap<UUID, HashMap<String, Long>> counters = new HashMap<UUID, HashMap<String, Long>>();

    public static boolean isJoinedCounter(UUID uuid) {
        return counters.containsKey(uuid);
    }

    public static void setJoinedCounter(UUID uuid, boolean joinedCounter) {
    }

    public static HashMap<String, Long> getCounter(UUID uuid) {
        return counters.computeIfAbsent(uuid, a -> new HashMap<String, Long>());
    }
}
