package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Permissions.PermissionsManager.CMIPerm;

public class SpawnerChargeManager {

    private LinkedHashMap<String, SCharges> map = new LinkedHashMap<String, SCharges>();

    private Integer total = 0;

    private void recalculateTotalSpawnerEntities() {

    }

    public void addCharge(SCharges charge) {
        map.put(charge.getName().toLowerCase(), charge);
    }

    public SCharges getCharge(String name) {
        return map.get(name.toLowerCase());
    }

    public SCharges getCharge(Player player) {
        return null;
    }

    public boolean changeSpawnerType(Block block, EntityType type) {

        return true;
    }

    @Deprecated
    public void openSpawnerPickerUI(Player player) {
        openSpawnerPickerUI(player, 1);
    }

    public void openSpawnerPickerUI(Player player, int page) {

    }

    public int getSpawnerDropChance(Player player, Block block) {

        return 0;
    }

}
