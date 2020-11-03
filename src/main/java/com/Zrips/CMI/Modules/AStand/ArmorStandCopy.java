package com.Zrips.CMI.Modules.AStand;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandActions;
import com.Zrips.CMI.Modules.AStand.ArmorStandManager.armorStandExtraActions;

public class ArmorStandCopy {

    private Player player;
    private ArmorStand stand;
    private Set<armorStandActions> copy;
    private Set<armorStandExtraActions> extraCopy;

    ArmorStandCopy(Player player, ArmorStand stand, Set<armorStandActions> copy, Set<armorStandExtraActions> extraCopy) {
	this.player = player;
	this.stand = stand;
	this.copy = copy;
	this.extraCopy = extraCopy;
    }

    public Player getPlayer() {
	return player;
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public ArmorStand getStand() {
	return stand;
    }

    public void setStand(ArmorStand stand) {
	this.stand = stand;
    }

    public Set<armorStandActions> getCopy() {
	return copy;
    }

    public void duplicateOn(ArmorStand stand) {
    }

    public Set<armorStandExtraActions> getExtraCopy() {
	if (extraCopy == null)
	    extraCopy = new HashSet<armorStandExtraActions>();
	return extraCopy;
    }
}
