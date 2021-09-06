package com.Zrips.CMI.Containers;

import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public enum CMIEquipmentSlot {
    NONE, CHEST, FEET, HAND, HEAD, LEGS, OFF_HAND;
    public static CMIEquipmentSlot get(String name) {
	return null;
    }

    public static CMIEquipmentSlot get(EquipmentSlot slot) {
	return null;
    }

    public static CMIEquipmentSlot get(PlayerInteractAtEntityEvent event) {
	return null;
    }

    public static CMIEquipmentSlot get(PlayerInteractEvent event) {
	return null;
    }
}
