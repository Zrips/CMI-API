package com.Zrips.CMI.Modules.Warnings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class WarningManager {

    private CMI plugin;

    private LinkedHashMap<Integer, List<String>> commands = new LinkedHashMap<Integer, List<String>>();

    private HashMap<String, CMIWarningCategory> Categories = new HashMap<String, CMIWarningCategory>();

    public WarningManager(CMI plugin) {
	this.plugin = plugin;
    }


    public void loadConfig() {

    }

    public CMIWarningCategory getDefaultCategory() {
	return Categories.get("default");
    }

    public CMIWarningCategory getCategory(String name) {
	return null;
    }

    public List<String> getCommandsByWarns(Player player, int from, int to) {
	return null;
    }

    public List<String> getCommandsByWarns(int warns) {
	return commands.get(warns) != null ? new ArrayList<String>(commands.get(warns)) : null;
    }

    public HashMap<String, CMIWarningCategory> getCategories() {
	return Categories;
    }
}
