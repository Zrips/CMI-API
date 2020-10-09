package com.Zrips.CMI.Modules.SpawnerCharge;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.stream.Stream;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Config;
import com.Zrips.CMI.Containers.PageInfo;
import com.Zrips.CMI.Modules.CmiItems.CMIEntityType;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.GUI.CMIGui;
import com.Zrips.CMI.Modules.GUI.CMIGuiButton;
import com.Zrips.CMI.Modules.GUI.GUIManager.InvType;
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
