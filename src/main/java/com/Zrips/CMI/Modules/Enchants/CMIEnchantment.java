package com.Zrips.CMI.Modules.Enchants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.enchantments.Enchantment;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Logs.CMIDebug;

public class CMIEnchantment {

    private static final Map<String, Enchantment> byName = new HashMap<String, Enchantment>();

    public static void saveEnchants() {
    }

    public static Enchantment get(String nameId) {
	return null;
    }

    public static Enchantment getByName(String name) {
	return null;
    }

    public static boolean isEnabled(Enchantment enchant) {
	return false;
    }

    public static Enchantment[] values() {
	return byName.values().toArray(new Enchantment[byName.size()]);
    }

    public static String getName(Enchantment enchant) {
	return null;
    }

    public static String getTranslatedName(Enchantment enchant) {
	return null;
    }
}
