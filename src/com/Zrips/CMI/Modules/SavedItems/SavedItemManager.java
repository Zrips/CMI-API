package com.Zrips.CMI.Modules.SavedItems;

import java.util.LinkedHashMap;
import java.util.Set;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;

public class SavedItemManager {
    private LinkedHashMap<String, LinkedHashMap<String, SavedItem>> map;
    public static final String defaultCategory = null;
    private CMI plugin;
    private String fileName;

    public SavedItemManager(CMI plugin) {
    }

    public void addSavedItem(SavedItem savedItem) {
    }

    public boolean removeSavedItem(SavedItem savedItem) {
        return false;
    }

    public boolean removeSavedItem(String category, String name) {
        return false;
    }

    public SavedItem getSavedItem(String category, String name) {
        return null;
    }

    public LinkedHashMap<String, LinkedHashMap<String, SavedItem>> getSavedItemMap() {
        return null;
    }

    public Set<SavedItem> getSavedItems(String category) {
        return null;
    }

    public void load() {
    }

    public int savedItemCount() {
        return 0;
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
