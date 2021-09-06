package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.GUI.GUIManager.GUIClickType;

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

    public void handleSignUpdates(Player player, Location locto) {

    }

    private static List<ChunkRef> getChunks(CMISign res) {
	List<ChunkRef> chunks = new ArrayList<>();
	return chunks;
    }
    private List<String> signEditBlackList = new ArrayList<String>();

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
		saveSigns();
		saveId = null;
	    }
	}, 20L * 5);
    }

    boolean saving = false;

    private void saveSigns() {
	
    }

    public void removeLastSignInRange(CMISign sign, UUID uuid) {

	Set<UUID> ls = lastSignInRange.get(sign);
	if (ls == null)
	    return;
	ls.remove(uuid);
	if (ls.isEmpty()) {
	    lastSignInRange.remove(sign);
	    return;
	}
	lastSignInRange.put(sign, ls);
    }

    public void addLastSignInRange(CMISign sign, UUID uuid) {
	
    }

    public void removeLastSignInRange(UUID uuid) {
	
    }

    private void tasker() {

    }

    public void addPlayersNearSign(CMISign sign) {

    }


    public Set<CMISign> getSigns() {
	return signs;
    }

    public List<CMISign> getSignsByDistance(Location loc) {

	return null;
    }

    public void removeSign(CMISign sign) {
	signs.remove(sign);
	lastSignInRange.remove(sign);
	this.recalculateChunks();
	this.save();
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
	Set<CMISign> ls = playerNearSigns.get(uuid);
	if (ls == null)
	    return;

	ls.remove(sign);

	if (ls.isEmpty())
	    playerNearSigns.remove(uuid);
    }

    public void removeNearSign(UUID uuid) {
	playerNearSigns.remove(uuid);
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

    public List<String> getSignEditBlackList() {
	return signEditBlackList;
    }

}
