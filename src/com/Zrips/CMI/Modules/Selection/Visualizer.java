package com.Zrips.CMI.Modules.Selection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CMIPortal;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class Visualizer {
    private Player player;
    private long start;
    private List<CuboidArea> areas = new ArrayList<CuboidArea>();
    private List<CuboidArea> errorAreas = new ArrayList<CuboidArea>();
    private CMITask id = null;
    private CMITask errorId = null;
    private boolean once = false;
    private int starting = 0;

    private List<Location> locations = new ArrayList<Location>();
    private List<Location> errorLocations = new ArrayList<Location>();
    private List<Location> locations2 = new ArrayList<Location>();
    private List<Location> errorLocations2 = new ArrayList<Location>();
    private Location loc = null;

    public Visualizer(Player player) {
        this.player = player;
        this.start = System.currentTimeMillis();
    }

    public void cancelAll() {
        if (id != null) {
            id.cancel();
        }
        if (errorId != null) {
            errorId.cancel();
        }
        loc = null;
    }

    public boolean isSameLoc() {
        if (loc == null)
            return false;
        if (loc.getWorld() != player.getWorld())
            return false;
        if (!errorAreas.isEmpty() && errorLocations.isEmpty())
            return false;
        if (loc.distance(player.getLocation()) > 1)
            return false;

        return true;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public List<CuboidArea> getAreas() {
        return areas;
    }

    public void setAreas(CMIPortal res) {
        if (res != null)
            this.areas = Arrays.asList(res.getArea());
    }

    public void setAreas(CuboidArea[] areas) {
        this.areas = Arrays.asList(areas);
    }

    public void setAreas(ArrayList<CuboidArea> areas) {
        this.areas = areas;
    }

    public void setAreas(CuboidArea area) {
        areas = new ArrayList<CuboidArea>();
        this.areas.add(area);
    }

    public List<CuboidArea> getErrorAreas() {
        return errorAreas;
    }

    public void setErrorAreas(CMIPortal res) {
        if (res != null)
            this.errorAreas = Arrays.asList(res.getArea());
    }

    public void setErrorAreas(CuboidArea[] errorAreas) {
        this.errorAreas = Arrays.asList(errorAreas);
    }

    public void setErrorAreas(ArrayList<CuboidArea> errorAreas) {
        this.errorAreas = errorAreas;
    }

    public void setErrorAreas(CuboidArea errorArea) {
        this.errorAreas.add(errorArea);
    }

    public CMITask getTask() {
        return id;
    }

    public void setTask(CMITask id) {
        this.id = id;
    }

    public CMITask getErrorTask() {
        return errorId;
    }

    public void setErrorTask(CMITask errorId) {
        this.errorId = errorId;
    }

    public boolean isOnce() {
        return once;
    }

    public void setOnce(boolean once) {
        this.once = once;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Location> getLocations2() {
        return locations2;
    }

    public void setLocations2(List<Location> locations) {
        this.locations2 = locations;
    }

    public List<Location> getErrorLocations() {
        return errorLocations;
    }

    public void setErrorLocations(List<Location> errorLocations) {
        this.errorLocations = errorLocations;
    }

    public List<Location> getErrorLocations2() {
        return errorLocations2;
    }

    public void setErrorLocations2(List<Location> errorLocations) {
        this.errorLocations2 = errorLocations;
    }

    public Location getLoc() {
        return loc;
    }

    public void setLoc(Location loc) {
        this.loc = loc;
    }

    public int getStarting() {
        return starting;
    }

    public void setStarting(int starting) {
        this.starting = starting;
    }
}
