package com.Zrips.CMI.Modules.Holograms;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

public class HologramManager {

    public HologramManager(CMI plugin) {

    }

    public void stop() {

    }

    public void addHologram(CMIHologram holo) {

    }

    public void recalculateChunks() {

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

    private static List<ChunkRef> getChunks(CMIHologram res) {
	return null;
    }

    public void loadConfig() {

    }

    public void load() {

    }

    public void save() {
    }

    private void saveHolograms() {

    }

    public void removeLastHoloInRange(CMIHologram holo, UUID uuid) {

    }

    public void addLastHoloInRange(CMIHologram sign, UUID uuid) {
    }

    public void removeLastHoloInRangeExtra(CMIHologram holo, UUID uuid) {
    }

    public void addLastHoloInRangeExtra(CMIHologram sign, UUID uuid) {
    }

    public void removeLastSignInRange(UUID uuid) {

    }

    private void tasker() {

    }

    public void hideHoloForAllPlayers(CMIHologram holo) {

    }

    public void resetHoloForAllPlayers(CMIHologram holo) {

    }

    public void addPlayersNearHolo(CMIHologram holo, boolean forceUpdate) {

    }

    public void addPlayersNearHoloExtra(CMIHologram holo, boolean forceUpdate) {

    }

    private void updateHolo(Player player, CMIHologram holo) {
    }

    private void updateHolo(CMIHologram holo) {

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
	return 1;
    }

    public boolean isNearSign(UUID uuid) {
	return false;
    }

    public void addNearHolo(UUID uuid, CMIHologram sign) {
    }

    public void removeNearHolo(UUID uuid, CMIHologram sign) {
    }

    public void addNearHoloExtra(UUID uuid, CMIHologram sign) {
    }

    public void removeNearHoloExtra(UUID uuid, CMIHologram sign) {
    }

    public void removeNearSign(UUID uuid) {
    }

    public void openGui(Player player, CMIHologram holo) {

    }

    public void hideAllHolograms() {
    }
}
