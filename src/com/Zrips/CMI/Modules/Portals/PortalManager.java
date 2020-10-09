package com.Zrips.CMI.Modules.Portals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.MemorySection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.Particl.CMIEffect;
import com.Zrips.CMI.Modules.Particl.CMIEffectManager.CMIParticle;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;
import com.Zrips.CMI.Modules.Worlds.CMIWorldListener;
import com.Zrips.CMI.Modules.Worlds.UpdateOnWorldLoad;

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

    private CMI plugin;

    public PortalManager(CMI plugin) {

    }

    private int sched = -1;

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

    public Set<CMIPortal> getByLocExtended(Location loc) {
	return null;
    }

    public CMIPortal collidesWithPortal(CuboidArea newarea) {
	Set<Entry<String, CMIPortal>> set = portals.entrySet();
	for (Entry<String, CMIPortal> entry : set) {
	    CMIPortal check = entry.getValue();
	    if (check.checkCollision(newarea)) {
		return entry.getValue();
	    }
	}
	return null;
    }

    private static List<ChunkRef> getChunks(CMIPortal res) {
	return null;
    }

    private static List<ChunkRef> getChunks(CMIPortal portal, int range) {
	return null;
    }

    Boolean performCmd = true;

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
	Set<CMIPortal> ls = playerNearPortals.get(uuid);
	return ls != null && !ls.isEmpty();
    }

    public void addNearPortal(UUID uuid, CMIPortal portal) {
    }

    public void removeNearPortal(UUID uuid, CMIPortal portal) {
    }

    public void removeNearPortal(UUID uuid) {
    }

    public void forceUpdate(CMIPortal portal) {
    }

    public void forceUpdate(UUID uuid, CMIPortal portal) {
    }
}
