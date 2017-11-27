package com.Zrips.CMI.Modules.Scan;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.Containers.ScanFindPlace;

public class ScanResultLocations {

    Location TPloc;
    Location loc;
    ScanFindPlace place;

    ItemStack[] contents = new ItemStack[64];

    boolean found = false;

    boolean checked = false;

    int id;

    UUID uuid;

    public ScanResultLocations() {
    }

    public ScanResultLocations(Location loc, ScanFindPlace place, int id) {
	this.loc = loc;
	this.place = place;
	this.id = id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public int getId() {
	return this.id;
    }

    public void setcontents(ItemStack[] contents) {
	this.contents = contents;
    }

    public ItemStack[] getContents() {
	return this.contents;
    }

    public void setChecked(boolean checked) {
	this.checked = checked;
    }

    public boolean isChecked() {
	return this.checked;
    }

    public void setFound(boolean found) {
	this.found = found;
    }

    public boolean isFound() {
	return this.found;
    }

    public void setUUID(UUID uuid) {
	this.uuid = uuid;
    }

    public UUID getUUID() {
	return this.uuid;
    }

    public void setLocation(Location loc) {
	this.loc = loc;
    }

    public Location getLocation() {
	return this.loc;
    }

    public void setTPLocation(Location TPloc) {
	this.TPloc = TPloc;
    }

    public Location getTPLocation() {
	return this.TPloc;
    }

    public void setScanPlace(ScanFindPlace place) {
	this.place = place;
    }

    public ScanFindPlace getScanPlace() {
	return this.place;
    }
}
