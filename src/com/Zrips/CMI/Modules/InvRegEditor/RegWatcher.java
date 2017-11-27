package com.Zrips.CMI.Modules.InvRegEditor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class RegWatcher {
    Player master = null;
    Player target = null;

    public RegWatcher(Player player1, Player target) {
	this.master = player1;
	this.target = target;
    }

    public Player getMaster() {
	return this.master;
    }

    public void setMaster(Player player) {
	this.master = player;
    }

    public Player getTarget() {
	if (Bukkit.getPlayer(target.getUniqueId()) != null)
	    return Bukkit.getPlayer(target.getUniqueId());
	return this.target;
    }

    public void setTarget(Player target) {
	this.target = target;
    }
}