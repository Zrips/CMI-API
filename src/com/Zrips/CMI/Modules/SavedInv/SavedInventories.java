package com.Zrips.CMI.Modules.SavedInv;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import com.Zrips.CMI.Containers.CMIUser;

public class SavedInventories {

    private CMIUser owner;
    private LinkedHashMap<Integer, CMIInventory> inventories = new LinkedHashMap<Integer, CMIInventory>();

    public SavedInventories(CMIUser owner) {
	this.owner = owner;
    }

    public void addInventory(CMIInventory inv) {
	inventories.put(inv.getId(), inv);
    }

    public CMIUser getOwner() {
	return owner;
    }

    private int getLastId() {
	int id = 0;
	for (Entry<Integer, CMIInventory> one : inventories.entrySet()) {
	    if (one.getKey() > id)
		id = one.getKey();
	}
	return id;
    }

    public int getNextId() {
	return getLastId() + 1;
    }

    public void setOwner(CMIUser owner) {
	this.owner = owner;
    }

    public LinkedHashMap<Integer, CMIInventory> getInventories() {
	return inventories;
    }
}
