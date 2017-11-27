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
import com.Zrips.CMI.Containers.ConfigReader;

public class EnchantManager {

    private HashMap<String, List<String>> enchantList = new HashMap<String, List<String>>();
    private Map<String, Object> maxValues = new HashMap<String, Object>();
    private HashMap<Integer, Enchantment> disabled = new HashMap<Integer, Enchantment>();

    private CMI plugin;

    public EnchantManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void loadLocale() {

    }

    @SuppressWarnings("deprecation")
    public void loadConfig() {
	
    }

    public HashMap<String, List<String>> getEnchantList() {
	return null;
    }

    public Integer getMaxLevel(Enchantment enchant) {
	return null;
    }

    public void reEnableEnchantsOnDisable() {
    }

    public void disableEnchantsOnLoad() {
    }

    public HashMap<Integer, Enchantment> getDisabled() {
	return null;
    }

    @SuppressWarnings("deprecation")
    public void addDisabled(Enchantment disabled) {
	this.disabled.put(disabled.getId(), disabled);
    }

    @SuppressWarnings("deprecation")
    public void removeDisabled(Enchantment disabled) {
	this.disabled.remove(disabled.getId());
    }

    private void loadDisabledEnchants() {
    }

    public void updateConfig() {
    }
}
