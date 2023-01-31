package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Items.CMIItemStack;

public class CMIDataWatcher {

    private Integer id;
    private Integer secId = null;
    private Object stand;
    private Location loc;
    private CMIItemStack item;
    private CMIHoloLineType type;

    private boolean updatingHead = false;

    public CMIDataWatcher(Integer id, Object stand, CMIHoloLineType type) {
        this.stand = stand;
        this.id = id;
        this.type = type;
    }

    public CMIDataWatcher(Integer id, Integer secid, Object stand, CMIHoloLineType type) {
        this.stand = stand;
        this.id = id;
        this.secId = secid;
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

    public boolean isUpdatingHead() {
        return updatingHead;
    }

    public void setUpdatingHead(boolean updatingHead) {
        this.updatingHead = updatingHead;
    }
}
