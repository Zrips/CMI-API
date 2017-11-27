package com.Zrips.CMI.Modules.Warps;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.ChatColor;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.ConfigReader;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;
import com.Zrips.CMI.Modules.GUI.GUIManager.InvType;

public class WarpManager {

    private CMI plugin;
    HashMap<String, CmiWarp> warps = new HashMap<String, CmiWarp>();

    public WarpManager(CMI plugin) {
	this.plugin = plugin;
    }

    public HashMap<String, CmiWarp> getWarps() {
	return warps;
    }

    public List<CmiWarp> getWarps(Player player) {
	return null;
    }

    public CMIGui generateGUI(Player player, Player source, int page) {

	return null;
    }

    public void remove(CmiWarp warp) {
    }

    public void addWarp(CmiWarp warp) {
    }

    public void addWarp(CmiWarp warp, boolean save) {
    }

    public CmiWarp getWarp(Player player, String name) {
	return null;
    }

    public CmiWarp getWarp(String name) {
	return null;
    }

    private boolean warpGUI = true;
    private boolean warpSaveCreator = true;
    private boolean warpShowCreator = true;
    private int warpPerPage = 50;

    public void loadConfig(ConfigReader cfg) {
    }

    public boolean isWarpGUI() {
	return warpGUI;
    }

    public void load() {

    }

    public void save() {

    }

    public int getWarpPerPage() {
	return warpPerPage;
    }

    public boolean isWarpShowCreator() {
	return warpShowCreator;
    }
}
