package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SilentChest {
    private Player player;
    private Inventory inv;
    private Inventory sourceInventory;
    private Location loc;
    private boolean editing;

    public SilentChest(Player player, Inventory inv, Location loc) {
    }

    public Player getPlayer() {
        return null;
    }

    public Inventory getInv() {
        return null;
    }

    public Location getLocation() {
        return null;
    }

    public void setEditing(boolean state) {
    }

    public boolean isEditing() {
        return false;
    }

    public Inventory getSourceInventory() {
        return null;
    }

    public void setSourceInventory(Inventory sourceInventory) {
    }
}
