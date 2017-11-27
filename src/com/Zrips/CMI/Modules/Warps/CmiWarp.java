package com.Zrips.CMI.Modules.Warps;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class CmiWarp {

    private Location loc;
    private String name;
    private ItemStack item;
    private Integer slot;
    private Boolean reqPerm = false;

    private String creator = null;

    public CmiWarp(String name) {
	this.name = name;
    }

    public void reset() {
	loc = null;
	item = null;
    }

    public CmiWarp(String name, Location loc) {
	this.name = name;
	this.loc = loc;
    }

    public Location getLoc() {
	return loc;
    }

    public String getName() {
	return name;
    }

    public ItemStack getItem() {
	return item;
    }

    public void setItem(ItemStack item) {
	this.item = item;
    }

    public void setLoc(Location loc) {
	this.loc = loc;
    }

    public boolean isReqPerm() {
	return reqPerm;
    }

    public void setReqPerm(boolean reqPerm) {
	this.reqPerm = reqPerm;
    }

    public Integer getSlot() {
	return slot;
    }

    public void setSlot(Integer slot) {
	if (slot != null) {
	    if (slot < 0)
		slot = 0;
	    if (slot > 53)
		slot = 53;
	}
	this.slot = slot;
    }

    public String getCreator() {
	return creator;
    }

    public void setCreator(String creator) {
	this.creator = creator;
    }
}
