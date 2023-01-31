package com.Zrips.CMI.Modules.PlayerMeta;

import java.util.HashMap;

public class PlayerMeta {

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
        HashMap<String, String> m = new HashMap<String, String>();
        return m;
    }
}
