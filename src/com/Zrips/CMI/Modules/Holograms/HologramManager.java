package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Particl.CMIPEAnimationInterface;
import com.Zrips.CMI.Modules.Portals.CMIVector3D;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class HologramManager {

    private static HashMap<String, CMIHologram> holograms;

    protected static Map<String, Map<ChunkRef, Set<CMIHologram>>> chunkHoloRange;
    protected static Map<String, Map<ChunkRef, Set<CMIHologram>>> chunkHoloRangeExtra;

    private static Map<UUID, Set<CMIHologram>> playerNearHoloUpdate;
    private static Map<UUID, Set<CMIHologram>> playerNearHoloExtra;

    private static Set<UUID> inPacketListener = new HashSet<UUID>();

    private ConcurrentHashMap<UUID, CMIAiming> aimingAt = new ConcurrentHashMap<UUID, CMIAiming>();

    private CMIHologramLine prevPage;
    private int prevPageLength = 0;
    private CMIHologramLine nextPage;
    private int nextPageLength = 0;

    class CMIAiming {
        private String name;
        private CMIVector3D pos;
        private CMIPEAnimationInterface eff;
        private double localX = 0;

        public CMIAiming(String name, CMIVector3D pos) {
            this.name = name;
            this.pos = pos;
        }

        public CMIAiming(String name, CMIVector3D pos, double localX) {
            this.name = name;
            this.pos = pos;
            this.localX = localX;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CMIVector3D getPos() {
            return pos;
        }

        public void setPos(CMIVector3D pos) {
            this.pos = pos;
        }

        public CMIPEAnimationInterface getEff() {
            return eff;
        }

        public void setEff(CMIPEAnimationInterface eff) {
            this.eff = eff;
        }

        public double getLocalX() {
            return localX;
        }

    }

//    private Map<UUID, Set<CMIHologram>> playerNearSticky;

    private int HoloRangeCheckInterval = 1000;

    private CMITask saveScheduler = null;

    private CMI plugin;

    public void clearCache(UUID uuid) {
    }

    public HologramManager(CMI plugin) {
    }

    public void stop() {
    }

    public void addHologram(CMIHologram holo) {
        addHologram(holo, true);
    }

    public void addHologram(CMIHologram holo, boolean checkForPlayers) {
        addHologram(holo, checkForPlayers, true);
    }

    public void addHologram(CMIHologram holo, boolean checkForPlayers, boolean recalculateChunks) {

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

    private String fileName = "Holograms.yml";

    public void load() {

    }

    public void save() {

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
        return recheckInteractableHolograms(CMIUser.getOnlinePlayer(uuid));
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
        HologramGUIEditor.openGui(player, holo);
    }

    public void hideAllHolograms() {
        for (Entry<String, CMIHologram> one : HologramManager.holograms.entrySet()) {
            this.hideHoloForAllPlayers(one.getValue());
        }
    }

    public Set<CMIHologram> getPlayerActiveHolograms(UUID uuid) {
        return playerNearHoloUpdate.get(uuid);
    }

    public void addAimAt(UUID uuid, String name, CMIVector3D pos) {
        aimingAt.put(uuid, new CMIAiming(name, pos));
    }

    public void addAimAt(UUID uuid, String name, CMIVector3D pos, double localX) {
        aimingAt.put(uuid, new CMIAiming(name, pos, localX));
    }

    public CMIAiming getAimAt(UUID uuid) {
        return aimingAt.get(uuid);
    }

    public void removeAimAt(UUID uuid) {
        CMIAiming removed = aimingAt.remove(uuid);
    }
//    public Map<Integer, Map<UUID, CMIHologram>> getFakeEntities() {
//	return fakeEntities;
//    }

    public CMIHologramLine getPrevPageSection() {
        return null;
    }

    public void setPrevPageSection(CMIHologramLine prevPage) {
        this.prevPage = prevPage;
    }

    public CMIHologramLine getNextPageSection() {
        return null;
    }

    public void setNextPageSection(CMIHologramLine nextPage) {
        this.nextPage = nextPage;
    }

    public int getPrevPageLength() {
        return prevPageLength;
    }

    public void setPrevPageLength(int prevPageLength) {
        this.prevPageLength = prevPageLength;
    }

    public int getNextPageLength() {
        return nextPageLength;
    }

    public void setNextPageLength(int nextPageLength) {
        this.nextPageLength = nextPageLength;
    }
}
