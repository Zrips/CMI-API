package com.Zrips.CMI.Modules.SavedItems;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.CMILib;
import net.Zrips.CMILib.Colors.CMIChatColor;
import com.Zrips.CMI.Containers.Snd;
import net.Zrips.CMILib.Items.CMIItemStack;

public class SavedItemManager {

    private LinkedHashMap<String, LinkedHashMap<String, SavedItem>> map = new LinkedHashMap<String, LinkedHashMap<String, SavedItem>>();
    public static final String defaultCategory = "dc";
    private CMI plugin;

    public SavedItemManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void addSavedItem(SavedItem savedItem) {
    }

    public boolean removeSavedItem(String category, String name) {
	return false;
    }

    public SavedItem getSavedItem(String category, String name) {
	return null;
    }

    public LinkedHashMap<String, LinkedHashMap<String, SavedItem>> getSavedItemMap() {
	return map;
    }

    public Set<SavedItem> getSavedItems(String category) {
	return null;
    }

    public int savedItemCount() {
	int count = 0;
	for (LinkedHashMap<String, SavedItem> one : this.map.values()) {
	    count += one.size();
	}
	return count;
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
