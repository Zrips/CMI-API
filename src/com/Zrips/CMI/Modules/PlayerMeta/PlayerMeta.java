package com.Zrips.CMI.Modules.PlayerMeta;

import java.util.HashMap;
import java.util.UUID;

public class PlayerMeta {

    private static HashMap<UUID, PlayerMeta> cacheMap = new HashMap<UUID, PlayerMeta>();

    public static PlayerMeta getMeta(UUID uuid) {
        return cacheMap.computeIfAbsent(uuid, k -> new PlayerMeta());
    }

    public static PlayerMeta getMetaRaw(UUID uuid) {
        return cacheMap.get(uuid);
    }

    private HashMap<String, metaValues> map = new HashMap<String, metaValues>();

    public class metaValues {
        private String value;
        private String defaultV = null;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDefaultV() {
            return defaultV == null ? getValue() : defaultV;
        }

        public void setDefaultV(String defaultV) {
            this.defaultV = defaultV;
        }
    }

    public PlayerMeta() {
    }

    public void add(String key, String value) {
        add(key, value, null);
    }

    public void add(String key, String value, String defaultV) {
        metaValues v = map.computeIfAbsent(key.toLowerCase(), k -> new metaValues());
        v.setValue(value);
        v.setDefaultV(defaultV);
    }

    public void remove(String key) {
        map.remove(key.toLowerCase());
    }

    public String getValue(String key) {
        metaValues v = map.get(key.toLowerCase());
        if (v == null)
            return "";
        return v.getValue();
    }

    public boolean containsValues() {
        return !map.isEmpty();
    }

    public HashMap<String, metaValues> getMap() {
        return map;
    }

    public HashMap<String, String> getMapForSave() {
        return null;
    }
}
