package com.Zrips.CMI.Modules.Enchants;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.enchantments.Enchantment;

import com.Zrips.CMI.CMI;

public class EnchantManager {

    private Map<String, Object> maxValues = new HashMap<String, Object>();
    private HashMap<String, Enchantment> disabled = new HashMap<String, Enchantment>();

    private CMI plugin;
    private boolean RequireSpecificPermission;
    private boolean EnforceValidEnchants;
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

    }

    public void disableEnchantsOnLoad() {

    }

    public HashMap<String, Enchantment> getDisabled() {
        return disabled;
    }

    public boolean isDisabled(Enchantment disabled) {
        String name = disabled.getName();
        if (name == null)
            return false;
        if (name.isEmpty())
            return false;
        if (name == " ")
            return false;
        return this.disabled.containsKey(disabled.getName());
    }

    public void addDisabled(Enchantment disabled) {

    }

    public void removeDisabled(Enchantment disabled) {

    }

    private String fileName = "DisabledEnchants.yml";

    public void loadDisabledEnchants() {

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

    public boolean isEnforceValidEnchants() {
        return EnforceValidEnchants;
    }
}
