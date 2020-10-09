package com.Zrips.CMI.Modules.Warps;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMILocation;
import com.Zrips.CMI.Locale.LC;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIRows;

public class CmiWarp {

    private CMILocation loc;
    private String name;
    private ItemStack item;
    private ItemStack offItem;
    private Integer slot;
    private Integer page = 1;
    private Boolean reqPerm = false;
    private Boolean showUnavailable = false;
    private Boolean autoLore = true;
    private boolean randomizeYaw = false;
    private String group = null;
    private boolean hidden = false;

    private UUID creator = null;

    public CmiWarp(String name) {
	this.name = name;
    }

    public void reset() {
	loc = null;
	item = null;
    }

    public CmiWarp(String name, CMILocation loc) {
	this.name = name;
	this.loc = loc;
    }

    public CMILocation getLoc() {
	loc.recheck();
	return loc;
    }

    public CMILocation getLocIncRand() {
	CMILocation location = getLoc().clone();
	if (this.isRandomizeYaw()) {
	    location.setYaw((new Random()).nextInt(359));
	}
	return location;
    }

    public String getName() {
	return name;
    }

    public ItemStack getItem() {
	return item;
    }

    public ItemStack getIcon() {

	return null;
    }

    public ItemStack getOffIcon() {
	return null;
    }

    public void setItem(ItemStack item) {
	this.item = item;
    }

    public void setLoc(CMILocation loc) {
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
    }

    public UUID getCreator() {
	return creator;
    }

    public String getCreatorName() {
	return null;
    }

    public void setCreator(UUID creator) {
	this.creator = creator;
    }

    public Boolean isAutoLore() {
	return autoLore;
    }

    public void setAutoLore(Boolean autoLore) {
	this.autoLore = autoLore;
    }

    public ItemStack getOffItem() {
	return offItem;
    }

    public void setOffItem(ItemStack offItem) {
	this.offItem = offItem;
    }

    public Boolean isShowUnavailable() {
	return showUnavailable;
    }

    public void setShowUnavailable(Boolean showUnavailable) {
	this.showUnavailable = showUnavailable;
    }

    public Integer getPage() {
	return page;
    }

    public void setPage(int p) {
	if (p < 0)
	    p = 1;
	this.page = p;
    }

    public void setName(String name) {
	this.name = name;
    }

    public boolean isRandomizeYaw() {
	return randomizeYaw;
    }

    public void setRandomizeYaw(boolean randomizeYaw) {
	this.randomizeYaw = randomizeYaw;
    }

    public String getGroup() {
	return group;
    }

    public void setGroup(String group) {
	this.group = group;
    }

    public boolean sameGroup(String group) {
	return this.group == null && group == null || this.group != null && group != null && this.group.equalsIgnoreCase(group);
    }

    public boolean isHidden() {
	return hidden;
    }

    public void setHidden(boolean hidden) {
	this.hidden = hidden;
    }
}
