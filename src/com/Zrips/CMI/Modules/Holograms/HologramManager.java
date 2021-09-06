package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

public class HologramManager {

    private static HashMap<String, CMIHologram> holograms;

    protected static Map<String, Map<ChunkRef, Set<CMIHologram>>> chunkHoloRange;
    protected static Map<String, Map<ChunkRef, Set<CMIHologram>>> chunkHoloRangeExtra;

    private static Map<UUID, Set<CMIHologram>> playerNearHoloUpdate;
    private static Map<UUID, Set<CMIHologram>> playerNearHoloExtra;
//    private Map<UUID, Set<CMIHologram>> playerNearSticky;

    private int HoloRangeCheckInterval = 1000;

    private Integer saveId = null;

    private CMI plugin;

    public void clearCache(UUID uuid) {
	playerNearHoloUpdate.remove(uuid);
	playerNearHoloExtra.remove(uuid);
//	playerNearSticky.remove(uuid);
    }

    public HologramManager(CMI plugin) {
    }

    private int sched = -1;

    public void stop() {
	if (saveId != null) {
	    Bukkit.getScheduler().cancelTask(saveId);
	    this.saveHolograms();
	}
	if (sched == -1)
	    return;
	Bukkit.getScheduler().cancelTask(sched);
	sched = -1;
    }

    public void addHologram(CMIHologram holo) {
	addHologram(holo, true);
    }

    public void addHologram(CMIHologram holo, boolean checkForPlayers) {

    }

    public void recalculateChunks() {
	
    }

    public void removeChunkRecords(CMIHologram holo) {
	
    }

    public void recalculateChunks(CMIHologram holo) {
	
    }

    public void recalculateChunksExtra(CMIHologram holo) {
	
    }

    public CMIHologram getByName(String name) {
	if (name == null)
	    return null;
	return holograms.get(name.toLowerCase());
    }

    public CMIHologram getByLoc(Location loc) {
	
	return null;
    }

    public CMIHologram getByLocExtra(Location loc) {
	
	return null;
    }

    public Set<CMIHologram> getAllInRangeByLoc(Location loc) {
	
	return null;
    }

    public Set<CMIHologram> getAllInRangeByLocExtra(Location loc) {
	
	return null;
    }

    public void handleHoloUpdates(Player player, Location locto) {
	
    }

    public void handleHoloRangeUpdates(Player player, Location locto) {
	
    }

    public static int defaultViewRange = 8;
    public static int defaultUpdateRange = 8;
    public static double defaultUpdateInterval = 0D;
    public static double defaultpageChangeInterval = 0D;
    public static boolean defaultsPlaceUp = true;

    public void loadConfig() {
	

    }

    public void load() {
	
    }

    public void save() {
	if (saveId != null)
	    return;
	saveId = Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
	    @Override
	    public void run() {
		saveHolograms();
		saveId = null;
	    }
	}, 20L * 15);
    }

    private void saveHolograms() {
	
    }

    public void removeLastHologramInRange(UUID uuid) {
	
    }

    public void hideHoloForAllPlayers(CMIHologram holo) {
	
    }

    public void resetHoloForAllPlayers(CMIHologram holo) {
	
    }

    public void addPlayersNearHolo(CMIHologram holo, boolean forceUpdate) {
	
    }

    public void addPlayersNearHoloExtra(CMIHologram holo, boolean forceUpdate) {
	
    }

    public HashMap<String, CMIHologram> getHolograms() {
	return holograms;
    }

    public List<CMIHologram> getHologramsByDistance(Location loc) {

	return null;
    }

    public void removeHolo(CMIHologram holo) {
	
    }

    public int getHoloCheckInterval() {
	return HoloRangeCheckInterval;
    }

    public boolean isNearHolo(UUID uuid) {
	Set<CMIHologram> ls = playerNearHoloUpdate.get(uuid);
	return ls != null && !ls.isEmpty();
    }

    public boolean rechecInteractableHolograms(UUID uuid) {
	return recheckInteractableHolograms(Bukkit.getPlayer(uuid));
    }

    public boolean recheckInteractableHolograms(Player player) {
	
	return true;
    }

    public void addNearHolo(UUID uuid, CMIHologram holo) {
	
    }

    public void removeNearHolo(UUID uuid, CMIHologram holo) {
	
    }

    public void addNearHoloExtra(UUID uuid, CMIHologram holo) {
	
    }

    public void removeNearHoloExtra(UUID uuid, CMIHologram holo) {

    }

    public void openGui(Player player, CMIHologram holo) {

    }

    public void hideAllHolograms() {
	for (Entry<String, CMIHologram> one : HologramManager.holograms.entrySet()) {
	    this.hideHoloForAllPlayers(one.getValue());
	}
    }

    public Set<CMIHologram> getPlayerActiveHolograms(UUID uuid) {
	return playerNearHoloUpdate.get(uuid);
    }

//    public Map<Integer, Map<UUID, CMIHologram>> getFakeEntities() {
//	return fakeEntities;
//    }
}
