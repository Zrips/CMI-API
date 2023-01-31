package com.Zrips.CMI.Containers;

import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Version.Version;

public class CMIEvent {

    public static BlockPlaceEvent createSignEvent(Block block, Sign sign, Player player) {
	if (Version.isCurrentEqualOrHigher(Version.v1_9_R1))
	    return new BlockPlaceEvent(block, sign, block, new ItemStack(block.getType()), player, true, EquipmentSlot.HAND);
	return new BlockPlaceEvent(block, sign, block, new ItemStack(block.getType()), player, true);
    }

    public static BlockPlaceEvent placeSignEvent(Block block, Sign sign, Player player) {
	if (Version.isCurrentEqualOrHigher(Version.v1_9_R1))
	    return new BlockPlaceEvent(block, sign, block, new ItemStack(block.getType()), player, true, EquipmentSlot.HAND);
	return new BlockPlaceEvent(block, sign, block, new ItemStack(block.getType()), player, true);
    }

    public static BlockPlaceEvent placeBlockEvent(Block block, Player player) {
	if (Version.isCurrentEqualOrHigher(Version.v1_9_R1))
	    return new BlockPlaceEvent(block, block.getState(), block, new ItemStack(block.getType()), player, true, EquipmentSlot.HAND);
	return new BlockPlaceEvent(block, block.getState(), block, new ItemStack(block.getType()), player, true);
    }
}
