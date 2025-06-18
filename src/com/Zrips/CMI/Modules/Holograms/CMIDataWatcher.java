package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import net.Zrips.CMILib.Items.CMIItemStack;

public class CMIDataWatcher {
    private Integer id;
    private Integer secId;
    private Object stand;
    private Location loc;
    private CMIItemStack item;
    private CMIHoloLineType type;
    private boolean updatingHead;

    public CMIDataWatcher(Integer id, Object stand, CMIHoloLineType type) {
    }

    public CMIDataWatcher(Integer id, Integer secid, Object stand, CMIHoloLineType type) {
    }

    public Object getStand() {
        return null;
    }

    public void setStand(Object watcher) {
    }

    public Integer getId() {
        return null;
    }

    public void setId(Integer id) {
    }

    public void remove(Player player) {
    }

    public Location getLoc() {
        return null;
    }

    public void setLoc(Location loc) {
    }

    public CMIHoloLineType getType() {
        return null;
    }

    public void setType(CMIHoloLineType type) {
    }

    public CMIItemStack getItem() {
        return null;
    }

    public void setItem(CMIItemStack item) {
    }

    public boolean isUpdatingHead() {
        return false;
    }

    public void setUpdatingHead(boolean updatingHead) {
    }
}
