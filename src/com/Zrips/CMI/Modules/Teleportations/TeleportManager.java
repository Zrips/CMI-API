package com.Zrips.CMI.Modules.Teleportations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class TeleportManager {

    private CMI plugin;
    private TreeMap<UUID, Set<TpInfo>> tpRequests = new TreeMap<UUID, Set<TpInfo>>();
    private TreeMap<UUID, Set<TpInfo>> blockedRequests = new TreeMap<UUID, Set<TpInfo>>();

    private boolean SafeLocationDownThenUp;
    private int TeleportInvulnerability = 2;
    private boolean TeleportToSpawnBefore;
    private boolean TeleportSwitchPlaces;
    private boolean TpaCurrentLoc;
    private boolean TpahereCurrentLoc;
    private int TeleportJumpDefault;
    private int TeleportTpaTime;
    private int TeleportTpaWarmup;
    private boolean TeleportTpaMove;
    private int TeleportTpaBlock;
    private boolean TeleportDenyConfirm;
    private int TeleportTpaMaxDistance;
    private int TeleportTpaHereMaxDistance;
    private int TeleportTpBypass;
    private int BackMinDistance = 5;
    private boolean BackWithWE = true;
    private List<String> BackBlackList = new ArrayList<String>();

    private HashMap<TpAction, Boolean> BlackListedItemsEnabledFor = new HashMap<TpAction, Boolean>();
    private HashMap<Material, Integer> blockedItems = new HashMap<Material, Integer>();

//    public int showFor = 60;
//    public int blockFor = 6;

    public enum TpAction {
        tpa, tpahere, tpaall, tp, warp, home, spawn;

        public static TpAction get(String name) {
            for (TpAction one : TpAction.values()) {
                if (one.toString().equalsIgnoreCase(name))
                    return one;
            }
            return null;
        }

    }

    public void loadConfig() {

    }

    public TeleportManager(CMI plugin) {
        this.plugin = plugin;
    }

    public void clearRequests(Player player) {
        tpRequests.remove(player.getUniqueId());
    }

    private void clearRequests() {

    }

    private void clearBlocks() {

    }

    public void addTpBlock(Player whoAccepts, TpInfo ti) {

    }

    public boolean isBlockedRequest(Player whoOffers, Player whoAccepts, TpAction action) {

        return false;
    }

    public long getBlockTime(Player whoOffers, Player whoAccepts, TpAction action) {

        return 0L;
    }

    public boolean addTpRequest(Player whoOffers, Player whoAccepts, TpAction action) {
        return addTpRequest(whoOffers, whoAccepts, action, true);
    }

    public boolean addTpRequest(Player whoOffers, Player whoAccepts, TpAction action, boolean currentLoc) {

        return true;
    }

    public boolean removeTpRequest(Player whoOffers, Player whoAccepts) {
        Set<TpInfo> list = tpRequests.get(whoOffers.getUniqueId());
        if (list == null)
            return true;
        for (TpInfo one : new HashSet<TpInfo>(list)) {
            if (one.getWhoAccepts().equals(whoAccepts)) {
                list.remove(one);
                return true;
            }
        }
        return false;
    }

    public boolean isAlreadyInRequest(Player whoOffers, Player whoAccepts, TpAction action) {
        return false;
    }

    @Deprecated
    public TpInfo getTeleportInfo(Player whoAccepts, Player whoOffers) {
        return getTeleportInfo(whoAccepts, whoOffers, null);
    }

    public TpInfo getTeleportInfo(Player whoAccepts, Player whoOffers, TpAction action) {

        return null;
    }

    public TreeMap<UUID, Set<TpInfo>> getTeleportRequests() {
        return tpRequests;
    }

    public Set<TpInfo> getTeleportRequests(UUID uuid) {
        return tpRequests.get(uuid);
    }

    public TreeMap<UUID, Set<TpInfo>> getBlockedRequests() {
        return blockedRequests;
    }

    public Set<TpInfo> getBlockedRequests(UUID uuid) {
        return blockedRequests.get(uuid);
    }

    public HashMap<Material, Integer> getBlockedItems() {
        return blockedItems;
    }

    public Boolean isBlackListedItemsEnabledFor(TpAction action) {
        if (!BlackListedItemsEnabledFor.containsKey(action))
            return false;
        return BlackListedItemsEnabledFor.get(action);
    }

    public boolean isSwitchTeleportPlaces() {
        return TeleportSwitchPlaces;
    }

    public int getTpaWarmupTime() {
        return TeleportTpaWarmup;
    }

    public boolean isTpaMove() {
        return TeleportTpaMove;
    }

    public boolean isTpaCurrentLoc() {
        return TpaCurrentLoc;
    }

    public boolean isTpahereCurrentLoc() {
        return TpahereCurrentLoc;
    }

    public int getJumpDefaultDistance() {
        return TeleportJumpDefault;
    }

    public int getBackMinDistance() {
        return BackMinDistance;
    }

    public boolean isSafeLocationDownThenUp() {
        return SafeLocationDownThenUp;
    }

    public void setSafeLocationDownThenUp(boolean safeLocationDownThenUp) {
        SafeLocationDownThenUp = safeLocationDownThenUp;
    }

    public List<String> getBackBlackList() {
        return BackBlackList;
    }

    public int getTpaMaxDistance() {
        return TeleportTpaMaxDistance;
    }

    public int getTpaHereMaxDistance() {
        return TeleportTpaHereMaxDistance;
    }

    public int getInvulnerabilityTime() {
        return TeleportInvulnerability;
    }

    public boolean isToSpawnBeforeTeleporting() {
        return TeleportToSpawnBefore;
    }

    public boolean isDenyConfirm() {
        return TeleportDenyConfirm;
    }

    public int getTpBypassTime() {
        return TeleportTpBypass;
    }

    public boolean isBackWithWE() {
        return BackWithWE;
    }

    public int getTpaTime() {
        return TeleportTpaTime;
    }
}
