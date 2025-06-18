package com.Zrips.CMI.Modules.Selection;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CMIPortal;
import com.Zrips.CMI.Modules.Portals.CuboidArea;

import net.Zrips.CMILib.Version.Schedulers.CMITask;

public class Visualizer {
    private Player player;
    private long start;
    private List<CuboidArea> areas;
    private List<CuboidArea> errorAreas;
    private CMITask id;
    private CMITask errorId;
    private boolean once;
    private int starting;
    private List<Location> locations;
    private List<Location> errorLocations;
    private List<Location> locations2;
    private List<Location> errorLocations2;
    private Location loc;

    public Visualizer(Player player) {
    }

    public void cancelAll() {
    }

    public boolean isSameLoc() {
        return false;
    }

    public long getStart() {
        return 0;
    }

    public void setStart(long start) {
    }

    public Player getPlayer() {
        return null;
    }

    public void setPlayer(Player player) {
    }

    public List<CuboidArea> getAreas() {
        return null;
    }

    public void setAreas(CMIPortal res) {
    }

    public void setAreas(CuboidArea[] areas) {
    }

    public void setAreas(ArrayList<CuboidArea> areas) {
    }

    public void setAreas(CuboidArea area) {
    }

    public List<CuboidArea> getErrorAreas() {
        return null;
    }

    public void setErrorAreas(CMIPortal res) {
    }

    public void setErrorAreas(CuboidArea[] errorAreas) {
    }

    public void setErrorAreas(ArrayList<CuboidArea> errorAreas) {
    }

    public void setErrorAreas(CuboidArea errorArea) {
    }

    public CMITask getTask() {
        return null;
    }

    public void setTask(CMITask id) {
    }

    public CMITask getErrorTask() {
        return null;
    }

    public void setErrorTask(CMITask errorId) {
    }

    public boolean isOnce() {
        return false;
    }

    public void setOnce(boolean once) {
    }

    public List<Location> getLocations() {
        return null;
    }

    public void setLocations(List<Location> locations) {
    }

    public List<Location> getLocations2() {
        return null;
    }

    public void setLocations2(List<Location> locations) {
    }

    public List<Location> getErrorLocations() {
        return null;
    }

    public void setErrorLocations(List<Location> errorLocations) {
    }

    public List<Location> getErrorLocations2() {
        return null;
    }

    public void setErrorLocations2(List<Location> errorLocations) {
    }

    public Location getLoc() {
        return null;
    }

    public void setLoc(Location loc) {
    }

    public int getStarting() {
        return 0;
    }

    public void setStarting(int starting) {
    }
}
