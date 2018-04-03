package com.Zrips.CMI.Modules.Holograms;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CuboidArea;

public class CMIHologram {

    public CMIHologram(String name, Location loc) {
    }

    public World getWorld() {
	return null;
    }

    public Location getLoc() {
	return null;
    }

    public void setLoc(Location loc) {
    }

    public String[] getLines() {
	return null;
    }

    public String getLine(int place) {
	return null;
    }

    public List<String> getLinesAsList() {
	return null;
    }

    public void setLines(List<String> l) {
    }

    public void setLines(String[] lines) {
    }

    public CuboidArea getArea() {
	return null;
    }

    public CuboidArea getAreaExtra() {
	return null;
    }

    public void setArea(CuboidArea area) {
    }

    public void setAreaExtra(CuboidArea area) {
    }

    public boolean isTimeToUpdate() {
	return true;
    }

    public void setAsUpdated() {
    }

    public void update() {
    }

    public void hide(Player player) {
    }

    public void update(final Player player) {

    }

    public void removeFromCache(UUID uuid) {

    }

    private void updateCache(UUID uuid, int place, CMIDataWatcher w) {

    }

    private CMIDataWatcher getCache(UUID uuid, int place) {

	return null;
    }

    public int getUpdateIntervalSec() {
	return 1;
    }

    public void setUpdateIntervalSec(int updateIntervalSec) {
    }

    public int getUpdateRange() {
	return 1;
    }

    public void setUpdateRange(int activationRange) {
    }

    public String getName() {
	return null;
    }

    public void setName(String name) {
    }

    public int getShowRange() {
	return 1;
    }

    public void setShowRange(int showRange) {
    }

    public Double getIconSpacing() {
	return null;
    }

    public void setIconSpacing(Double iconSpacing) {
    }

    public Double getSpacing() {
	return null;
    }

    public void setSpacing(Double spacing) {
    }
}
