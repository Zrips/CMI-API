package com.Zrips.CMI.Modules.Enchants;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.enchantments.Enchantment;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class EnchantManager {

//    private HashMap<String, List<String>> enchantList = new HashMap<String, List<String>>();
    private HashMap<String, String> enchantList = new HashMap<String, String>();
    private HashMap<String, String> transaltedEnchantList = new HashMap<String, String>();
    private Map<String, Object> maxValues = new HashMap<String, Object>();
    private HashMap<String, Enchantment> disabled = new HashMap<String, Enchantment>();

    private CMI plugin;
    private boolean RequireSpecificPermission;
    private boolean PermissionLevelLimit;

    public EnchantManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadLocale() {

    }

    public void loadConfig() {

    }

    public HashMap<String, String> getEnchantList() {
	return enchantList;
    }

    public HashMap<String, String> getTranslatedEnchantList() {
	return transaltedEnchantList;
    }

    public Integer getMaxLevel(Enchantment enchant) {
	return null;
    }

    public void reEnableEnchantsOnDisable() {
    }

    public void disableEnchantsOnLoad() {
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
}
