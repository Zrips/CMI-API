package com.Zrips.CMI.Modules.InvEndEditor;

import org.bukkit.entity.Player;

public class EndWatcher {
    Player master = null;
    Player target = null;

    public EndWatcher(Player player1, Player target) {
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
	return this.target;
    }

    public void setTarget(Player target) {
	this.target = target;
    }
}