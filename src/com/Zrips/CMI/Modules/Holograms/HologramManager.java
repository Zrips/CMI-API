package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Future.CMIFutureBatcher;
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
    private static Map<UUID, CMIFutureBatcher> playerFutureBatcher;
    private static Set<UUID> inPacketListener;
    private ConcurrentHashMap<UUID, CMIAiming> aimingAt;
    private CMIHologramLine prevPage;
    private int prevPageLength;
    private CMIHologramLine nextPage;
    private int nextPageLength;
    private int HoloRangeCheckInterval;
    private CMITask saveScheduler;
    private CMI plugin;
    public static int defaultViewRange;
    public static int defaultUpdateRange;
    public static double defaultUpdateInterval;
    public static double defaultpageChangeInterval;
    public static boolean defaultsPlaceUp;
    private String fileName;

    public void clearCache(UUID uuid) {
    }

    public void clearCachedData(UUID uuid) {
    }

    public HologramManager(CMI plugin) {
    }

    public void stop() {
    }

    public void addHologram(CMIHologram holo) {
    }

    public void addHologram(CMIHologram holo, boolean checkForPlayers) {
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
        return null;
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

    public void loadConfig() {
    }

    public void reload() {
    }

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
        return null;
    }

    public List<CMIHologram> getHologramsByDistance(Location loc) {
        return null;
    }

    public void removeHolo(CMIHologram holo) {
    }

    public int getHoloCheckInterval() {
        return 0;
    }

    public boolean isNearHolo(UUID uuid) {
        return false;
    }

    public boolean rechecInteractableHolograms(UUID uuid) {
        return false;
    }

    public boolean recheckInteractableHolograms(Player player) {
        return false;
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
    }

    public Set<CMIHologram> getPlayerActiveHolograms(UUID uuid) {
        return null;
    }

    public void addAimAt(UUID uuid, String name, CMIVector3D pos) {
    }

    public void addAimAt(UUID uuid, String name, CMIVector3D pos, double localX) {
    }

    public CMIAiming getAimAt(UUID uuid) {
        return null;
    }

    public void removeAimAt(UUID uuid) {
    }

    public CMIHologramLine getPrevPageSection() {
        return null;
    }

    public void setPrevPageSection(CMIHologramLine prevPage) {
    }

    public CMIHologramLine getNextPageSection() {
        return null;
    }

    public void setNextPageSection(CMIHologramLine nextPage) {
    }

    public int getPrevPageLength() {
        return 0;
    }

    public void setPrevPageLength(int prevPageLength) {
    }

    public int getNextPageLength() {
        return 0;
    }

    public void setNextPageLength(int nextPageLength) {
    }

    public Set<CMIHologram> getHologramsByGroup(String group) {
        return null;
    }

    public Optional<Location> getCenterLocation(Set<CMIHologram> holograms) {
        return null;
    }

    public Location getCenterOfGroup(String group) {
        return null;
    }

    public void relocateHologramGroup(Location loc, String group) {
    }

    public void shiftHologramGroup(Vector vector, String group) {
    }

    public void rotateHologramYawGroup(int amount, String group, Location referencePoint) {
    }

    class CMIAiming {
        private String name;
        private CMIVector3D pos;
        private CMIPEAnimationInterface eff;
        private double localX;

        public CMIAiming(String name, CMIVector3D pos) {
        }

        public CMIAiming(String name, CMIVector3D pos, double localX) {
        }

        public String getName() {
            return null;
        }

        public void setName(String name) {
        }

        public CMIVector3D getPos() {
            return null;
        }

        public void setPos(CMIVector3D pos) {
        }

        public CMIPEAnimationInterface getEff() {
            return null;
        }

        public void setEff(CMIPEAnimationInterface eff) {
        }

        public double getLocalX() {
            return 0.0;
        }
    }
}
