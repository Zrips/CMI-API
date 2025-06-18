package com.Zrips.CMI.Modules.DynamicSigns;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Portals.CuboidArea.ChunkRef;

import net.Zrips.CMILib.Colors.CMIChatColor;
import net.Zrips.CMILib.GUI.GUIManager.GUIClickType;
import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class SignManager {
    private Set<CMISign> signs;
    protected Map<String, Map<ChunkRef, Set<CMISign>>> chunkSignsRange;
    private Map<UUID, Set<CMISign>> playerNearSigns;
    private Map<CMISign, Set<UUID>> lastSignInRange;
    private int SignRangeCheckInterval;
    private HashMap<CMIChatColor, CMIChatColor> colorChange;
    private CMITask saveId;
    private CMI plugin;
    private CMITask sched;
    private List<String> signEditBlackList;
    private String fileName;
    boolean saving;

    public SignManager(CMI plugin) {
    }

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

    private static CompletableFuture<List<ChunkRef>> getChunks(CMISign res) {
        return null;
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

    private static void updateSign(CMISign sign, Set<UUID> list) {
    }

    public Set<CMISign> getSigns() {
        return null;
    }

    public List<CMISign> getSignsByDistance(Location loc) {
        return null;
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

    public List<String> getSignEditBlackList() {
        return null;
    }
}
