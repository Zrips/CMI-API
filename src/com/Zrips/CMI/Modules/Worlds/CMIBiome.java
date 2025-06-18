package com.Zrips.CMI.Modules.Worlds;

import java.awt.Color;
import java.util.HashMap;
import java.util.Set;

public class CMIBiome {
    private CMIBiomeType type;
    private String name;
    private String localized;
    static HashMap<String, CMIBiome> cmiBiomeMap;

    CMIBiome(String name, String localized) {
    }

    public static CMIBiome get(String name) {
        return null;
    }

    public Color getColor() {
        return null;
    }

    public int getId() {
        return 0;
    }

    public String getLocalized() {
        return null;
    }

    public String getName() {
        return null;
    }

    public static Set<String> values() {
        return null;
    }
}
