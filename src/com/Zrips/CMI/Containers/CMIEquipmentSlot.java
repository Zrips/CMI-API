package com.Zrips.CMI.Containers;

import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

import net.Zrips.CMILib.Version.Version;

public enum CMIEquipmentSlot {
    NONE, CHEST, FEET, HAND, HEAD, LEGS, OFF_HAND;
    public static CMIEquipmentSlot get(String name) {
	for (CMIEquipmentSlot one : CMIEquipmentSlot.values()) {
	    if (one.toString().equalsIgnoreCase(name))
		return one;
	}
	return null;
    }

    public static CMIEquipmentSlot get(EquipmentSlot slot) {
	return get(slot.toString());
    }

    public static CMIEquipmentSlot get(PlayerInteractAtEntityEvent event) {
	if (Version.isCurrentEqualOrLower(Version.v1_8_R3))
	    return CMIEquipmentSlot.HAND;
	if (event.getHand() == null)
	    return CMIEquipmentSlot.HAND;
	return get(event.getHand().toString());
    }

    public static CMIEquipmentSlot get(PlayerInteractEvent event) {
	if (event.getAction().equals(Action.PHYSICAL))
	    return CMIEquipmentSlot.NONE;
	if (Version.isCurrentEqualOrLower(Version.v1_8_R3))
	    return CMIEquipmentSlot.HAND;
	if (event.getHand() == null)
	    return CMIEquipmentSlot.HAND;
	return get(event.getHand().toString());
    }
}
