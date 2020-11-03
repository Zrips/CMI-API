package com.Zrips.CMI.Modules.Jail;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import com.Zrips.CMI.Containers.CMILocation;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

public class CMIJail {

    private String name;
    private CuboidArea area;
    private CMILocation safeLoc;
    private HashMap<Integer, CMIJailCell> cells = new HashMap<Integer, CMIJailCell>();

    public CMIJail() {
	area = new CuboidArea(null);
    }

    public boolean containsLoc(Location loc) {
	return area.containsLoc(loc);
    }

    public boolean containsLoc(Location loc, int range) {
	return area.containsLoc(loc, range);
    }

    public CuboidArea getArea() {
	return area;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public boolean checkCollision(CuboidArea area) {
	return false;
    }

    public CuboidArea loadBounds(String root) throws Exception {
	return null;
    }

    public void setArea(CuboidArea area) {
	this.area = area;
    }

    public Location getOutsideLocation() {
	return safeLoc;
    }

    @Deprecated
    public void setOutsideLocation(Location safeLoc) {
	if (safeLoc != null)
	    this.safeLoc = new CMILocation(safeLoc);
    }

    public void setOutsideLocation(CMILocation safeLoc) {
	this.safeLoc = safeLoc;
    }

    public HashMap<Integer, CMIJailCell> getCells() {
	return cells;
    }

    public void setCells(HashMap<Integer, CMIJailCell> cells) {
	this.cells = cells;
    }

    public void addCell(CMIJailCell cell) {
    }

    public int getCountInCells() {
	return 0;
    }

    public int getNextCellId() {
	return 1;
    }
}
