package com.Zrips.CMI.Modules.Jail;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

import net.Zrips.CMILib.Container.CMILocation;
import net.Zrips.CMILib.Logs.CMIDebug;

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
        if (this.area != null && area != null) {
            if (this.area.checkCollision(area)) {
                return true;
            }
        }
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
        if (cell.getId() == null)
            cell.setId(this.getNextCellId());
        this.cells.put(cell.getId(), cell);
    }

    public int getCountInCells() {
        if (this.cells.isEmpty())
            return 0;
        int i = 0;
        for (Entry<Integer, CMIJailCell> one : this.cells.entrySet()) {
            i += one.getValue().getJailed().size();
        }
        return i;
    }

    public int getNextCellId() {
        if (this.cells.isEmpty())
            return 1;
        int i = 1;
        for (Entry<Integer, CMIJailCell> one : this.cells.entrySet()) {
            if (one.getKey() >= i)
                i = one.getKey() + 1;
        }
        return i;
    }
}
