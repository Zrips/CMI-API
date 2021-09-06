package com.Zrips.CMI.Modules.tp;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.events.CMIPlayerTeleportRequestEvent;

public class TpManager {

    private CMI plugin;
    TreeMap<UUID, Set<TpInfo>> tpRequests = new TreeMap<UUID, Set<TpInfo>>();
    TreeMap<UUID, Set<TpInfo>> blockedRequests = new TreeMap<UUID, Set<TpInfo>>();

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

}
