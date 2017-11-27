package com.Zrips.CMI.Modules.tp;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;

public class TpManager {

    private CMI plugin;
    TreeMap<UUID, Set<TpInfo>> tpRequests = new TreeMap<UUID, Set<TpInfo>>();
    TreeMap<UUID, Set<TpInfo>> blockedRequests = new TreeMap<UUID, Set<TpInfo>>();

//    public int showFor = 60;
//    public int blockFor = 6;

    public enum TpAction {
	tpa, tpahere, tpaall, tp, warp, home, spawn
    }

    public TpManager(CMI plugin) {
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

    public void addTpRequest(Player whoOffers, Player whoAccepts, TpAction action) {

    }

    public boolean isAlreadyInRequest(Player whoOffers, Player whoAccepts, TpAction action) {

	return false;
    }

    public TpInfo getTeleportInfo(Player whoAccepts, Player whoOffers) {

	return null;
    }

}
