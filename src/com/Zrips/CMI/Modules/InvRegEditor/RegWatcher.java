package com.Zrips.CMI.Modules.InvRegEditor;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RegWatcher {
    Player master = null;
    Player target = null;

    private int schedId = 0;
    private ItemStack[] contents = new ItemStack[64];
    
    private int actionSchedId = 0;

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
	return this.target;
    }

    public void setTarget(Player target) {
	this.target = target;
    }

    public int getSchedId() {
	return schedId;
    }

    public void setSchedId(int schedId) {
	this.schedId = schedId;
    }

    public ItemStack[] getContents() {
	return contents;
    }

    public void setContents(ItemStack[] contents) {
    }

    public int getActionSchedId() {
	return actionSchedId;
    }

    public void setActionSchedId(int actionSchedId) {
	this.actionSchedId = actionSchedId;
    }
}