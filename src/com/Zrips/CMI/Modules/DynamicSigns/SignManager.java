package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Containers.CMILocation;
import com.Zrips.CMI.FileHandler.ConfigReader;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIRows;
import com.Zrips.CMI.Modules.ModuleHandling.CMIModule;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;
import com.Zrips.CMI.Modules.Worlds.CMIWorldListener;
import com.Zrips.CMI.Modules.Worlds.UpdateOnWorldLoad;

public class SignManager {

    private Set<CMISign> signs;
    protected Map<String, Map<ChunkRef, Set<CMISign>>> chunkSignsRange;

    private Map<UUID, Set<CMISign>> playerNearSigns;

    private Map<CMISign, Set<UUID>> lastSignInRange;

    private int SignRangeCheckInterval = 500;
    private HashMap<CMIChatColor, CMIChatColor> colorChange = new HashMap<CMIChatColor, CMIChatColor>();

    private Integer saveId = null;

    private CMI plugin;

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

	return null;
    }

    private Map<UUID, Set<CMISign>> lastSigns;

    public void handleSignUpdates(Player player, Location locto) {

    }

    private static List<ChunkRef> getChunks(CMISign res) {
	List<ChunkRef> chunks = new ArrayList<>();
	chunks.addAll(res.getArea().getChunks());
	return chunks;
    }

    public void loadConfig() {
    }

    public void load() {

    }

    public void save() {
    }

    boolean saving = false;

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
	return signs;
    }

    public List<CMISign> getSignsByDistance(Location loc) {

	return null;
    }

    public void removeSign(CMISign sign) {
    }

    public int getSignCheckInterval() {
	return SignRangeCheckInterval;
    }

    public boolean isNearSign(UUID uuid) {
	Set<CMISign> ls = playerNearSigns.get(uuid);
	return ls != null && !ls.isEmpty();
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
	sign.setPersonal(!sign.isPersonal());
	CMI.getInstance().getSignManager().openGui(player, sign);
	CMI.getInstance().getSignManager().save();
    }

    public static void changeRange(Player player, GUIClickType click, CMISign sign) {
    }

    public static void changeInterval(Player player, GUIClickType click, CMISign sign) {
    }

    public HashMap<CMIChatColor, CMIChatColor> getColorChange() {
	return colorChange;
    }

    public void setColorChange(HashMap<CMIChatColor, CMIChatColor> colorChange) {
	this.colorChange = colorChange;
    }

}
