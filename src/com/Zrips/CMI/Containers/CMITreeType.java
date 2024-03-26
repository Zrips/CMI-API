package com.Zrips.CMI.Containers;

import java.util.HashMap;

import org.bukkit.TreeType;

public enum CMITreeType {

    ACACIA(),
    AZALEA(),
    BIG_TREE("Large oak", "bigoak", "big"),
    BIRCH("white", "whitebark"),
    BROWN_MUSHROOM("browngiantmushroom"),
    CHORUS_PLANT("chorus"),
    COCOA_TREE("Cocoa"),
    CRIMSON_FUNGUS(),
    CHERRY(),
    DARK_OAK(),
    JUNGLE(),
    JUNGLE_BUSH("jungleshrub"),
    MEGA_REDWOOD("Large spruce"),
    RED_MUSHROOM("redgiantmushroom"),
    REDWOOD("Spruce", "sequoia", "sequoioideae"),
    SMALL_JUNGLE(),
    SWAMP("swamptree"),
    TALL_BIRCH(),
    TALL_REDWOOD("Tall spruce", "bigspruce", "tallsequoia", "tallsequoioideae"),
    TALL_MANGROVE(),
    TREE("Oak", "regular"),
    WARPED_FUNGUS(),
    MANGROVE();

    private String name;
    private String[] identifiers;
    private TreeType type = null;

    CMITreeType(String... identifiers) {

    }

    static HashMap<String, CMITreeType> map = new HashMap<String, CMITreeType>();

    public static CMITreeType getType(String name) {
        return null;
    }

    public String getName() {
        return name;
    }

    public String[] getIdentifiers() {
        return identifiers;
    }

    public TreeType getType() {
        return type;
    }
}
