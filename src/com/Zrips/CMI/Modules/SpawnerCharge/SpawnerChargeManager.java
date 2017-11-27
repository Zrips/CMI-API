package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class SpawnerChargeManager {

    private LinkedHashMap<String, SCharges> map = new LinkedHashMap<String, SCharges>();

    public void addCharge(SCharges charge) {
	map.put(charge.getName().toLowerCase(), charge);
    }

    public SCharges getCharge(String name) {
	return map.get(name.toLowerCase());
    }

    public SCharges getCharge(Player player) {
	return null;
    }
    
    public boolean changeSpawnerType(Block block, EntityType type){
	return true;
    }

}
