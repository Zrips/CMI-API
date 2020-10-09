package com.Zrips.CMI.Containers;

import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

import com.Zrips.CMI.utils.VersionChecker.Version;

public enum CMIEquipmentSlot {
    NONE, CHEST, FEET, HAND, HEAD, LEGS, OFF_HAND;
    public static CMIEquipmentSlot get(String name) {
	return null;
    }

    public static CMIEquipmentSlot get(EquipmentSlot slot) {
	return get(slot.toString());
    }

    public static CMIEquipmentSlot get(PlayerInteractAtEntityEvent event) {
	return null;
    }

    public static CMIEquipmentSlot get(PlayerInteractEvent event) {
	return null;
    }
}
