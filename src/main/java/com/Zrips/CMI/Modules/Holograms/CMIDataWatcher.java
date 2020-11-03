package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;

public class CMIDataWatcher {

    private Integer id;
    private Object stand;
    private Location loc;
    private CMIItemStack item;
    private CMIHoloLineType type;

//    @Deprecated
//    public CMIDataWatcher(Integer id, Object stand) {
//	this.stand = stand;
//	this.id = id;
//    }

    public CMIDataWatcher(Integer id, Object stand, CMIHoloLineType type) {
	this.stand = stand;
	this.id = id;
	this.type = type;
    }

    public Object getStand() {
	return stand;
    }

    public void setStand(Object watcher) {
	this.stand = watcher;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public void remove(Player player) {
	CMI.getInstance().getNMS().removeHologram(player, id);
    }

    public Location getLoc() {
	return loc;
    }

    public void setLoc(Location loc) {
	this.loc = loc;
    }


    public CMIHoloLineType getType() {
	return type;
    }

    public void setType(CMIHoloLineType type) {
	this.type = type;
    }

    public CMIItemStack getItem() {
	return item;
    }

    public void setItem(CMIItemStack item) {
	this.item = item;
    }
}
