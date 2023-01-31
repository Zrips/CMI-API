package com.Zrips.CMI.Modules.Portals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

public class PortalManager {

    private SortedMap<String, CMIPortal> portals;
    protected Map<String, Map<ChunkRef, Set<CMIPortal>>> chunkPortals;
    protected Map<String, Map<ChunkRef, Set<CMIPortal>>> chunkPortalsRange1;

    private Map<UUID, Set<CMIPortal>> playerNearPortals;

    private Map<UUID, Set<CMIPortal>> lastPortals;
    private Map<CMIPortal, Set<UUID>> lastPortalInRange;

    private int PortalsCheckInterval = 500;
    private int PortalsCheckParticleInterval = 500;
    private List<String> commandsOnTeleport = new ArrayList<String>();
    public static Boolean performCmd = true;

    private CMI plugin;

    public PortalManager(CMI plugin) {

    }

    private int sched = -1;

    public void stop() {
        if (sched == -1)
            return;
        Bukkit.getScheduler().cancelTask(sched);
        sched = -1;
    }

    private void tasker() {

    }

    private static void showParticlesForPortal(CMIPortal portal) {

    }

    public void addPortal(CMIPortal portal) {
        portals.put(portal.getName().toLowerCase(), portal);
        recalculateChunks(portal);
    }

    public void recalculateChunks() {
        chunkPortals.clear();
        chunkPortalsRange1.clear();
        for (Entry<String, CMIPortal> one : this.portals.entrySet()) {
            recalculateChunks(one.getValue());
        }
    }

    public void recalculateChunks(CMIPortal portal) {

    }

    public CMIPortal getByName(String name) {
        if (name == null)
            return null;
        return portals.get(name.toLowerCase());
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
        List<ChunkRef> chunks = new ArrayList<>();
        chunks.addAll(res.getArea().getChunks());
        return chunks;
    }

    private static List<ChunkRef> getChunks(CMIPortal portal, int range) {
        List<ChunkRef> chunks = new ArrayList<>();
        chunks.addAll(portal.getArea().getChunks(range));
        return chunks;
    }

    public void loadConfig() {

    }

    public void load() {

    }

    public void loadMap(String world, Map<String, Object> root) throws Exception {

    }

    public void handlePortalVisualizerUpdates() {
        for (Player one : Bukkit.getOnlinePlayers()) {
            handlePortalVisualizerUpdates(one, null, one.getLocation());
        }
    }

    public boolean handlePortalVisualizerUpdates(Player player, Location locfrom, Location locto) {

        return false;
    }

    public void savePortals() {
        if (id != null)
            return;
        id = Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(CMI.getInstance(), new Runnable() {
            @Override
            public void run() {
                CMI.getInstance().getPortalManager().save();
                id = null;
            }
        }, 20 * 10L);
    }

    private Integer id = null;
    private boolean saving = false;

    private void save() {

    }

    public void removeLastPortalInRange(CMIPortal portal, UUID uuid) {

    }

    public void removeLastPortalInRange(UUID uuid) {

    }

    public void addLastPortalInRange(CMIPortal portal, UUID uuid) {

    }

    public SortedMap<String, CMIPortal> getPortals() {
        return portals;
    }

    public List<CMIPortal> getPortalsByDistance(Location loc) {

        return null;
    }

    public void removePortal(CMIPortal portal) {
        portals.remove(portal.getName().toLowerCase());
        lastPortalInRange.remove(portal);
        this.recalculateChunks();
        this.savePortals();
    }

    public int getPortalsCheckInterval() {
        return PortalsCheckInterval;
    }

    public int getPortalsCheckParticleInterval() {
        return PortalsCheckParticleInterval;
    }

    public List<String> getCommandsOnTeleport() {
        return commandsOnTeleport;
    }

    public boolean isNearPortal(UUID uuid) {
        if (playerNearPortals.isEmpty())
            return false;
        if (uuid == null)
            return false;
        Set<CMIPortal> ls = playerNearPortals.get(uuid);
        return ls != null && !ls.isEmpty();
    }

    public void addNearPortal(UUID uuid, CMIPortal portal) {
        Set<CMIPortal> ls = playerNearPortals.get(uuid);
        if (ls == null)
            ls = new HashSet<CMIPortal>();
        ls.add(portal);
        portal.updateParticleLimitations(Bukkit.getPlayer(uuid));
        playerNearPortals.put(uuid, ls);
    }

    public void removeNearPortal(UUID uuid, CMIPortal portal) {

    }

    public void removeNearPortal(UUID uuid) {
        Set<CMIPortal> rem = playerNearPortals.remove(uuid);
        if (rem != null)
            for (CMIPortal one : rem) {
                one.removeParticleLimitations(uuid);
            }
    }

    public void forceUpdate(CMIPortal portal) {
        for (Player one : Bukkit.getOnlinePlayers()) {
            forceUpdate(one.getUniqueId(), portal);
        }
    }

    public void forceUpdate(UUID uuid, CMIPortal portal) {
    }
}
