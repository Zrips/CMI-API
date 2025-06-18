package com.Zrips.CMI.Modules.SavedInv;

import java.util.LinkedHashMap;
import java.util.Map;

import com.Zrips.CMI.Containers.CMIUser;

public class SavedInventories {
    private CMIUser owner;
    private Map<Integer, CMIInventory> inventories;

    public SavedInventories(CMIUser owner) {
    }

    public synchronized void addInventory(CMIInventory inv) {
    }

    public synchronized CMIInventory removeInventory(int id) {
        return null;
    }

    public synchronized CMIInventory removeInventory(CMIInventory inv) {
        return null;
    }

    public CMIUser getOwner() {
        return null;
    }

    public synchronized int getSavedInventoryCount() {
        return 0;
    }

    public void setOwner(CMIUser owner) {
    }

    private synchronized int getLastId() {
        return 0;
    }

    public int getNextId() {
        return 0;
    }

    public synchronized CMIInventory getInventory(int id) {
        return null;
    }

    public synchronized LinkedHashMap<Integer, CMIInventory> getInventories() {
        return null;
    }

    public synchronized CMIInventory getFirstInv() {
        return null;
    }

    public synchronized CMIInventory getLastInv() {
        return null;
    }

    public synchronized CMIInventory getNextInv(int id) {
        return null;
    }

    public synchronized CMIInventory getPrevInv(int id) {
        return null;
    }
}
