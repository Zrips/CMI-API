package com.Zrips.CMI.Containers;

import java.util.HashMap;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public class CMIEntity {

    private Entity ent;

    public static HashMap<EntityType, String> translatedNames = new HashMap<EntityType, String>();

    public CMIEntity(Entity ent) {
	this.ent = ent;
    }

    public Entity getEnt() {
	return ent;
    }

    public void setEnt(Entity ent) {
	this.ent = ent;
    }

    public String getName() {
	return null;
    }

    public String getCustomName() {
	return null;
    }
    
    public Inventory getInventory(){	
	return null;
    }

}
