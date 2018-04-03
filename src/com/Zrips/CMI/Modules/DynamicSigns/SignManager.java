package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;
import com.Zrips.CMI.utils.Util.CMIChatColor;

public class SignManager {

    public SignManager(CMI plugin) {
    }

    private int sched = -1;

    public void stop() {
    }

    public void addSign(CMISign sign) {
    }

    public void recalculateChunks() {
    }

    public void recalculateChunks(CMISign sign) {
    }

    public CMISign getByLoc(Location loc) {
	return null;
    }

    public Set<CMISign> getAllInRangeByLoc(Location loc) {
	Set<CMISign> sign = new HashSet<CMISign>();
	return sign;
    }

    private Map<UUID, Set<CMISign>> lastSigns;

    public void handleSignUpdates(Player player, Location locto) {
    }

    private static List<ChunkRef> getChunks(CMISign res) {
	List<ChunkRef> chunks = new ArrayList<>();
	return chunks;
    }

    public void loadConfig() {
    }

    public void load() {

    }

    public void save() {
    }

    private void saveSigns() {
    }

    public void removeLastSignInRange(CMISign sign, UUID uuid) {

    }

    public void addLastSignInRange(CMISign sign, UUID uuid) {

    }

    public void removeLastSignInRange(UUID uuid) {

    }

    private void tasker() {

    }

    public void addPlayersNearSign(CMISign sign) {

    }

    private static void updateSign(Player player, CMISign sign) {

    }

    private void updateSign(CMISign sign) {

    }

    public Set<CMISign> getSigns() {
	return null;
    }

    public List<CMISign> getSignsByDistance(Location loc) {

	List<CMISign> sortedList = new ArrayList<CMISign>();

	return sortedList;
    }

    public void removeSign(CMISign sign) {

    }

    public int getSignCheckInterval() {
	return 0;
    }

    public boolean isNearSign(UUID uuid) {
	return false;
    }

    public void addNearSign(UUID uuid, CMISign sign) {

    }

    public void removeNearSign(UUID uuid, CMISign sign) {

    }

    public void removeNearSign(UUID uuid) {
    }

    public void openGui(Player player, CMISign sign) {
    }

    public static void changeIndividual(Player player, CMISign sign) {

    }

    public static void changeRange(Player player, GUIClickType click, CMISign sign) {

    }

    public static void changeInterval(Player player, GUIClickType click, CMISign sign) {

    }

    public HashMap<CMIChatColor, CMIChatColor> getColorChange() {
	return null;
    }

    public void setColorChange(HashMap<CMIChatColor, CMIChatColor> colorChange) {
    }

    public String updateSignColors(String message) {
	return "";
    }
}
