package com.Zrips.CMI.Modules.PlayerMeta;

import java.util.HashMap;
import java.util.UUID;

public class PlayerMeta {
    private static HashMap<UUID, PlayerMeta> cacheMap;
    private HashMap<String, metaValues> map;

    public static PlayerMeta getMeta(UUID uuid) {
        return null;
    }

    public static PlayerMeta getMetaRaw(UUID uuid) {
        return null;
    }

    public PlayerMeta() {
    }

    @Deprecated
    public void add(String key, String value, String defaultV) {
    }

    public void add(String key, String value) {
    }

    public void remove(String key) {
    }

    public String getValue(String key) {
        return null;
    }

    public boolean containsValues() {
        return false;
    }

    public HashMap<String, metaValues> getMap() {
        return null;
    }

    public HashMap<String, String> getMapForSave() {
        return null;
    }

    public class metaValues {
        private String value;

        public metaValues() {
        }

        public metaValues(String value) {
        }

        public String getValue() {
            return null;
        }

        public void setValue(String value) {
        }
    }
}
