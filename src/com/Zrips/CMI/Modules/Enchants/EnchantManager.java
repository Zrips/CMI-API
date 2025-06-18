package com.Zrips.CMI.Modules.Enchants;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.enchantments.Enchantment;

import com.Zrips.CMI.CMI;

public class EnchantManager {
    private Map<String, Object> maxValues;
    private HashMap<String, Enchantment> disabled;
    private CMI plugin;
    private boolean RequireSpecificPermission;
    private boolean EnforceValidEnchants;
    private boolean PermissionLevelLimit;
    private boolean enchantLimitEnabled;
    private String fileName;

    public EnchantManager(CMI plugin) {
    }

    public void loadConfig() {
    }

    public Integer getMaxLevel(Enchantment enchant) {
        return null;
    }

    public void reEnableEnchantsOnDisable() {
    }

    public void disableEnchantsOnLoad() {
    }

    public HashMap<String, Enchantment> getDisabled() {
        return null;
    }

    public boolean isDisabled(Enchantment disabled) {
        return false;
    }

    public void addDisabled(Enchantment disabled) {
    }

    public void removeDisabled(Enchantment disabled) {
    }

    public void loadDisabledEnchants() {
    }

    public void updateConfig() {
    }

    public boolean isRequireSpecificPermission() {
        return false;
    }

    public boolean isPermissionLevelLimit() {
        return false;
    }

    public boolean isEnchantLimitEnabled() {
        return false;
    }

    public boolean isEnforceValidEnchants() {
        return false;
    }
}
