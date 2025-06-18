package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Items.ArmorTypes;

public class CMIArmorChangeEvent extends CMIPlayerCancellableEvent {
    private final EquipMethod equipType = null;
    private final ArmorTypes type = null;
    private ItemStack oldArmorPiece;
    private ItemStack newArmorPiece;

    public CMIArmorChangeEvent(Player player, EquipMethod equipType, ArmorTypes type, ItemStack oldArmorPiece, ItemStack newArmorPiece) {
        super(player);
    }

    public final ArmorTypes getType() {
        return null;
    }

    public final ItemStack getOldArmorPiece() {
        return null;
    }

    public final void setOldArmorPiece(ItemStack oldArmorPiece) {
    }

    public final ItemStack getNewArmorPiece() {
        return null;
    }

    public final void setNewArmorPiece(ItemStack newArmorPiece) {
    }

    public EquipMethod getMethod() {
        return null;
    }

    public enum EquipMethod {
        SHIFT_CLICK, DRAG, HOTBAR, HOTBAR_SWAP, DISPENSER, BROKE, DEATH;
    }
}
