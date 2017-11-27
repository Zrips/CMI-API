package com.Zrips.CMI.Modules.Enchants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.enchantments.Enchantment;

import com.Zrips.CMI.CMI;

public class CMIEnchantment {

    private static final Map<Integer, Enchantment> byId = new HashMap<Integer, Enchantment>();
    private static final Map<String, Enchantment> byName = new HashMap<String, Enchantment>();

    @SuppressWarnings("deprecation")
    public static void saveEnchants() {
    }

    public static Enchantment getById(int id) {
	return byId.get(id);
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
	return null;
    }

    public static String getName(Enchantment enchant) {
	return null;
    }

}
