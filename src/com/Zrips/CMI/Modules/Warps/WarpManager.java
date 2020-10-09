package com.Zrips.CMI.Modules.Warps;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.GUI.CMIGui;

public class WarpManager {

    private CMI plugin;
    HashMap<String, CmiWarp> warps = new HashMap<String, CmiWarp>();
    HashMap<UUID, List<CmiWarp>> userWarps = new HashMap<UUID, List<CmiWarp>>();

    public WarpManager(CMI plugin) {
	this.plugin = plugin;
    }

    public HashMap<String, CmiWarp> getWarps() {
	return warps;
    }

    public List<CmiWarp> getWarps(Player player, String group) {
	return getWarps(player, null, group, true);
    }

    public List<CmiWarp> getWarps(Player player) {
	return getWarps(player, null, null, true);
    }

    public int getWarpCount(Player player) {
	return userWarps.get(player.getUniqueId()) == null ? 0 : userWarps.get(player.getUniqueId()).size();
    }

    public int getMaxWarps(CommandSender sender) {
	return 9999;
    }

    public int getMaxWarps(Player player) {
	    return 0;
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group) {
	return getWarps(player, page, group, true);
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group, boolean includeHidden) {
	
	return null;
    }

    private enum warpEditorSlots {
	icon(10), offIcon(19), randomYaw(20), autoLore(11), permission(13), reqPermission(22), hidden(31), location(16), group(25), iconSlot(14), page(23), back(8);

	private int slot;

	warpEditorSlots(int slot) {
	    this.slot = slot;
	}

	public int getSlot() {
	    return slot;
	}

	public void setSlot(int slot) {
	    this.slot = slot;
	}
    }

    public void openWarpEditor(Player player, String warp) {
	openWarpEditor(player, this.getWarp(warp));
    }

    public void openWarpEditor(final Player player, final CmiWarp warp) {
	
    }

    public List<CmiWarp> getWarps(int page, String group) {
	return null;
    }

    public int getPageCountFrom(int page, String group) {
	int i = page;
	return i - page;
    }

    public List<CmiWarp> getWarps(int page, Integer slot, String group) {
	return null;
    }

    public CMIGui openGUI(Player player, int page, String group) {
	return null;
    }

    public CMIGui openGUI(Player player, List<CmiWarp> warpList, String group) {
	
	return null;
    }

    public void remove(CmiWarp warp) {
    }

    public void addWarp(CmiWarp warp) {
	addWarp(warp, true);
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
    private boolean GUIOnCreation = true;
//    private boolean warpSaveCreator = true;
    private boolean warpShowCreator = true;
    private boolean warpRequirePerm = false;
    private int warpPerPage = 50;
    private int MinLenght = 4;
    private int MaxLenght = 16;

    public void loadConfig(ConfigReader cfg) {
	
    }

    public boolean isWarpGUI() {
	return warpGUI;
    }

    public void load() {
	
    }

    boolean saving = false;

    public void save() {
	
    }

    public int getWarpPerPage() {
	return warpPerPage;
    }

    public boolean isWarpShowCreator() {
	return warpShowCreator;
    }

    public boolean isGUIOnCreation() {
	return GUIOnCreation;
    }

    public int getMinLenght() {
	return MinLenght;
    }

    public void setMinLenght(int minLenght) {
	MinLenght = minLenght;
    }

    public int getMaxLenght() {
	return MaxLenght;
    }

    public void setMaxLenght(int maxLenght) {
	MaxLenght = maxLenght;
    }

    public boolean isWarpRequirePerm() {
	return warpRequirePerm;
    }
}
