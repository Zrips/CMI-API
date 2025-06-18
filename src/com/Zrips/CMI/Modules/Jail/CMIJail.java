package com.Zrips.CMI.Modules.Jail;

import java.util.HashMap;

import org.bukkit.Location;

import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Container.CMILocation;

public class CMIJail {
    private String name;
    private CuboidArea area;
    private CMILocation safeLoc;
    private boolean preventLeave;
    private HashMap<Integer, CMIJailCell> cells;

    public CMIJail() {
    }

    public boolean containsLoc(Location loc) {
        return false;
    }

    public boolean containsLoc(Location loc, int range) {
        return false;
    }

    public CuboidArea getArea() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
    }

    public boolean checkCollision(CuboidArea area) {
        return false;
    }

    public CuboidArea loadBounds(String root) throws Exception {
        return null;
    }

    public void setArea(CuboidArea area) {
    }

    public Location getOutsideLocation() {
        return null;
    }

    @Deprecated
    public void setOutsideLocation(Location safeLoc) {
    }

    public void setOutsideLocation(CMILocation safeLoc) {
    }

    public HashMap<Integer, CMIJailCell> getCells() {
        return null;
    }

    public void setCells(HashMap<Integer, CMIJailCell> cells) {
    }

    public void addCell(CMIJailCell cell) {
    }

    public int getCountInCells() {
        return 0;
    }

    public int getNextCellId() {
        return 0;
    }

    public boolean isPreventLeave() {
        return false;
    }

    public void setPreventLeave(boolean preventLeave) {
    }
}
