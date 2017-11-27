package com.Zrips.CMI.Modules.GUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.utils.Util.CommandType;

public class GUIManager {

    private HashMap<UUID, CMIGui> map = new HashMap<UUID, CMIGui>();
    private CMI plugin;

    public GUIManager(CMI plugin) {
	this.plugin = plugin;
    }

    public enum GUIRows {
	r1(9), r2(18), r3(27), r4(36), r5(45), r6(54);
	private Integer fields = 0;

	GUIRows(int fields) {
	    this.fields = fields;
	}

	public Integer getFields() {
	    return fields;
	}
    }

    public enum GUIFieldType {
	Free, Locked
    }

    public enum InvType {
	Gui, Main, Quickbar
    }

    public enum CmiInventoryType {
	SavedInv, EditableInv, Recipe
    }

    public enum GUIClickType {
	Left, LeftShift, Right, RightShift
    }

    public void closeAll() {
    }

    public GUIClickType getClickType(boolean left, boolean shift) {
	return null;
    }

    public boolean processClick(Player player, List<Integer> buttons, GUIClickType clickType) {
	return false;
    }

    public boolean isLockedPart(Player player, List<Integer> buttons) {

	return false;
    }

    public boolean canClick(Player player, List<Integer> buttons) {
	return true;
    }

    public CMIGui getGui(Player player) {
	return map.get(player.getUniqueId());
    }

    public boolean isOpenedGui(Player player) {
	return true;
    }

    public void removePlayer(Player player) {
    }

    public void generateInventory(CMIGui gui) {

    }


    public void openGui(CMIGui gui) {
	
    }

    public void updateContent(CMIGui gui) {
    }

}
