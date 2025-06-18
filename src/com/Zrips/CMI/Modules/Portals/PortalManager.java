package com.Zrips.CMI.Modules.Portals;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class PortalManager {
    private SortedMap<String, CMIPortal> portals;
    protected Map<String, Map<ChunkRef, Set<CMIPortal>>> chunkPortals;
    protected Map<String, Map<ChunkRef, Set<CMIPortal>>> chunkPortalsRange1;
    private Map<UUID, Set<CMIPortal>> playerNearPortals;
    private ConcurrentHashMap<UUID, Set<CMIPortal>> lastPortals;
    private ConcurrentHashMap<CMIPortal, Set<UUID>> lastPortalInRange;
    private int PortalsCheckInterval;
    private int PortalsCheckParticleInterval;
    private List<String> commandsOnTeleport;
    public static boolean performCmd;
    private CMI plugin;
    private CMITask sched;
    private String fileName;
    private CMITask id;
    private boolean saving;

    public PortalManager(CMI plugin) {
    }

    public void stop() {
    }

    private void tasker() {
    }

    private static void showParticlesForPortal(CMIPortal portal) {
    }

    public void addPortal(CMIPortal portal) {
    }

    public void recalculateChunks() {
    }

    public void recalculateChunks(CMIPortal portal) {
    }

    public CMIPortal getByName(String name) {
        return null;
    }

    public CMIPortal getByLoc(Location loc) {
        return null;
    }

    public Set<CMIPortal> getByLocList(Location loc) {
        return null;
    }

    public Set<CMIPortal> getByLocExtended(Location loc) {
        return null;
    }

    public CMIPortal collidesWithPortal(CuboidArea newarea) {
        return null;
    }

    private static List<ChunkRef> getChunks(CMIPortal res) {
        return null;
    }

    private static List<ChunkRef> getChunks(CMIPortal portal, int range) {
        return null;
    }

    public void loadConfig() {
    }

    public void load() {
    }

    public void loadMap(String world, Map<String, Object> root) throws Exception {
    }

    public void handlePortalVisualizerUpdates() {
    }

    public boolean handlePortalVisualizerUpdates(Player player, Location locfrom, Location locto) {
        return false;
    }

    public void savePortals() {
    }

    private void save() {
    }

    public synchronized void removeLastPortalInRange(CMIPortal portal, UUID uuid) {
    }

    public synchronized void removeLastPortalInRange(UUID uuid) {
    }

    public synchronized void addLastPortalInRange(CMIPortal portal, UUID uuid) {
    }

    public synchronized Map<CMIPortal, Set<UUID>> getLastPortalInRange() {
        return null;
    }

    public synchronized Map<UUID, Set<CMIPortal>> getPlayerNearPortals() {
        return null;
    }

    public SortedMap<String, CMIPortal> getPortals() {
        return null;
    }

    public List<CMIPortal> getPortalsByDistance(Location loc) {
        return null;
    }

    public synchronized void removePortal(CMIPortal portal) {
    }

    public int getPortalsCheckInterval() {
        return 0;
    }

    public int getPortalsCheckParticleInterval() {
        return 0;
    }

    public List<String> getCommandsOnTeleport() {
        return null;
    }

    public boolean isNearPortal(UUID uuid) {
        return false;
    }

    public synchronized void addNearPortal(UUID uuid, CMIPortal portal) {
    }

    public synchronized void removeNearPortal(UUID uuid, CMIPortal portal) {
    }

    public synchronized void removeNearPortal(UUID uuid) {
    }

    public void forceUpdate(CMIPortal portal) {
    }

    public void forceUpdate(UUID uuid, CMIPortal portal) {
    }
}
