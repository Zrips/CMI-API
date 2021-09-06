package com.Zrips.CMI.Modules.Enchants;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.enchantments.Enchantment;

import com.Zrips.CMI.CMI;

public class EnchantManager {

    private Map<String, Object> maxValues = new HashMap<String, Object>();
    private HashMap<String, Enchantment> disabled = new HashMap<String, Enchantment>();

    private CMI plugin;
    private boolean RequireSpecificPermission;
    private boolean PermissionLevelLimit;
    private boolean enchantLimitEnabled = false;

    public EnchantManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadConfig() {
	
    }


    public Integer getMaxLevel(Enchantment enchant) {
	
	return 0;
    }

    public void reEnableEnchantsOnDisable() {
	for (Entry<String, Enchantment> one : disabled.entrySet()) {
	    plugin.getRef().manageEnchantment(one.getValue(), false);
	}
    }

    public void disableEnchantsOnLoad() {
	for (Entry<String, Enchantment> one : disabled.entrySet()) {
	    plugin.getRef().manageEnchantment(one.getValue(), true);
	}
    }

    public HashMap<String, Enchantment> getDisabled() {
	return disabled;
    }

    public void addDisabled(Enchantment disabled) {
	
    }

    public void removeDisabled(Enchantment disabled) {
    }

    private void loadDisabledEnchants() {
	
    }

    public void updateConfig() {
	
    }

    public boolean isRequireSpecificPermission() {
	return RequireSpecificPermission;
    }

    public boolean isPermissionLevelLimit() {
	return PermissionLevelLimit;
    }

    public boolean isEnchantLimitEnabled() {
	return enchantLimitEnabled;
    }
}
