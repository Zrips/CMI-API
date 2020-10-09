package com.Zrips.CMI.Modules.SavedItems;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.Snd;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.Logs.CMIDebug;

public class SavedItemManager {

    private TreeMap<String, SavedItem> map = new TreeMap<String, SavedItem>();

    private CMI plugin;

    public SavedItemManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void addSavedItem(SavedItem savedItem) {
	map.put(savedItem.getName().toLowerCase(), savedItem);
    }

    public boolean removeSavedItem(String name) {
	boolean feed = map.remove(name.toLowerCase()) != null;
	this.save();
	return feed;
    }

    public SavedItem getSavedItem(String name) {
	return null;
    }

    public TreeMap<String, SavedItem> getSavedItemMap() {
	return map;
    }

    public void setSavedItems(TreeMap<String, SavedItem> map) {
	this.map = map;
    }

    public void load() {
	
    }

    public void save() {
	
    }

    public ItemStack getUpatedItemClone(Player player, SavedItem savedItem) {

	return null;
    }

    public String processText(String text, Player player, SavedItem savedItem) {

	return null;
    }
}
