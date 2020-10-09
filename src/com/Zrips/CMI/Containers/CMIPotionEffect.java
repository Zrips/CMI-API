package com.Zrips.CMI.Containers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.potion.PotionEffectType;

public class CMIPotionEffect {

    private static HashMap<String, List<String>> potyionEffectList = new HashMap<String, List<String>>();
    private static final Map<Integer, PotionEffectType> byId = new HashMap<Integer, PotionEffectType>();
    private static final Map<String, PotionEffectType> byName = new HashMap<String, PotionEffectType>();

    @SuppressWarnings("deprecation")
    public static void saveEnchants() {
    }

    public static PotionEffectType getById(int id) {
	return byId.get(id);
    }

    public static PotionEffectType get(String nameId) {
	return null;
    }

    public static PotionEffectType getByName(String name) {
	return null;
    }

    public static PotionEffectType[] values() {
	return byId.values().toArray(new PotionEffectType[byId.size()]);
    }

    public static String getName(PotionEffectType enchant) {
	return null;
    }

    public static void loadLocale() {
    }
}
