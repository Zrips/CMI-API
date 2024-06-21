package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.ArmorTypes;

public final class CMIArmorChangeEvent extends CMIPlayerCancellableEvent {

    private final EquipMethod equipType;
    private final ArmorTypes type;
    private ItemStack oldArmorPiece, newArmorPiece;

    public CMIArmorChangeEvent(final Player player, final EquipMethod equipType, ArmorTypes type, final ItemStack oldArmorPiece, final ItemStack newArmorPiece) {
	super(player);
	this.equipType = equipType;
	this.type = type;
	this.oldArmorPiece = oldArmorPiece;
	this.newArmorPiece = newArmorPiece;
    }


    public final ArmorTypes getType() {
	return type;
    }

    public final ItemStack getOldArmorPiece() {
	return oldArmorPiece;
    }

    public final void setOldArmorPiece(final ItemStack oldArmorPiece) {
	this.oldArmorPiece = oldArmorPiece;
    }

    public final ItemStack getNewArmorPiece() {
	return newArmorPiece;
    }

    public final void setNewArmorPiece(final ItemStack newArmorPiece) {
	this.newArmorPiece = newArmorPiece;
    }

    public EquipMethod getMethod() {
	return equipType;
    }

    public enum EquipMethod {
	SHIFT_CLICK,
        DRAG,
        HOTBAR,
	HOTBAR_SWAP,
	DISPENSER,
	BROKE,
	DEATH;
    }
}
