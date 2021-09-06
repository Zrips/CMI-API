package com.Zrips.CMI.Modules.Warps;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

import net.Zrips.CMILib.FileHandler.ConfigReader;
import net.Zrips.CMILib.GUI.CMIGui;

public class WarpManager {

    private CMI plugin;
    HashMap<String, CmiWarp> warps = new HashMap<String, CmiWarp>();
    HashMap<UUID, HashMap<String, CmiWarp>> userWarps = new HashMap<UUID, HashMap<String, CmiWarp>>();

    public WarpManager(CMI plugin) {
	this.plugin = plugin;
    }

    public void onDisable() {
	if (saveId != -1) {
	    Bukkit.getScheduler().cancelTask(saveId);
	    saveId = -1;
	    save();
	}
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
	if (sender instanceof Player)
	    return getMaxWarps((Player) sender);
	return 9999;
    }

    public int getMaxWarps(Player player) {
	int homes = 1;
	    return homes;
	
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group) {
	return getWarps(player, page, group, true);
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group, boolean includeHidden) {
	return getWarps(player, page, group, includeHidden, false);
    }

    public List<CmiWarp> getWarps(Player player, Integer page, String group, boolean includeHidden, boolean onlyOwn) {
	
	return null;
    }

    private enum warpEditorSlots {

	icon(10), offIcon(19), randomYaw(20), autoLore(11), permission(13), reqPermission(22), hidden(32), group(25), displayName(34), iconSlot(14), page(23), back(8),
	location(37), seclocation(38), repeat(39);

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

//    public CMIGui generateGUI(Player player, Player source, int page) {
//	return generateGUI(player, getWarps(source), page);
//    }

    public CMIGui openGUI(Player player, int page, String group) {
	return openGUI(player, plugin.getWarpManager().getWarps(player, page, group, false), group);
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
	if (name == null)
	    return null;
	return warps.get(name.toLowerCase());
    }

    private boolean warpGUI = true;
    private boolean GUIOnCreation = true;
//    private boolean warpSaveCreator = true;
    private boolean warpShowCreator = true;
    private boolean warpRequirePerm = false;
    private int warpPerPage = 50;
    private int MinLength = 4;
    private int MaxLength = 16;

    public void loadConfig(ConfigReader cfg) {
	
    }

    public boolean isWarpGUI() {
	return warpGUI;
    }

    public void load() {

    }

    boolean saving = false;

    private int saveId = -1;

    public void safeSave() {
	if (saveId != -1)
	    return;
	saveId = Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(CMI.getInstance(), new Runnable() {
	    @Override
	    public void run() {
		asyncSave();
		saveId = -1;
	    }
	}, 60 * 20);
    }

    public void asyncSave() {
    }

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

    public int getMinLength() {
	return MinLength;
    }

    public void setMinLenght(int minLenght) {
	MinLength = minLenght;
    }

    public int getMaxLength() {
	return MaxLength;
    }

    public void setMaxLenght(int maxLenght) {
	MaxLength = maxLenght;
    }

    public boolean isWarpRequirePerm() {
	return warpRequirePerm;
    }
}
