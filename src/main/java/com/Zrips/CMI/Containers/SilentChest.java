package com.Zrips.CMI.Containers;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class SilentChest {
    private Player player;
    private Inventory inv;
    private Location loc;
    private boolean editing = true;

    public SilentChest(Player player, Inventory inv, Location loc) {
	this.player = player;
	this.inv = inv;
	this.loc = loc;
    }

    public Player getPlayer() {
	return this.player;
    }

    public Inventory getInv() {
	return this.inv;
    }

    public Location getLocation() {
	return this.loc;
    }

    public void setEditing(boolean state) {
	this.editing = state;
    }

    public boolean isEditing() {
	return this.editing;
    }
}
