package com.Zrips.CMI.Modules.GUI;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryAction;

import com.Zrips.CMI.CMI;

public class GUIManager {

    private HashMap<UUID, CMIGui> map = new HashMap<UUID, CMIGui>();
    private CMI plugin;

    public final static String CMIGUIIcon = "CMIGUIIcon";
    public final static String LIProtection = "LIProtection";

    public static boolean usePackets = false;

    public GUIManager(CMI plugin) {
	this.plugin = plugin;
    }

    public enum GUIButtonLocation {
	topLeft(0, 0), topRight(0, 1), bottomLeft(1, 0), bottomRight(1, 1);

	private Integer row;
	private Integer collumn;

	GUIButtonLocation(Integer row, Integer collumn) {
	    this.collumn = collumn;
	    this.row = row;
	}

	public Integer getRow() {
	    return row;
	}

	public Integer getCollumn() {
	    return collumn;
	}

    }

    public enum GUIRows {
	r1(1), r2(2), r3(3), r4(4), r5(5), r6(6);

	private int rows;

	GUIRows(int rows) {
	    this.rows = rows;
	}

	public Integer getFields() {
//	    if (Version.isCurrentEqualOrHigher(Version.v1_14_R1)) { 
//		return rows * 9 < 27 ? 27 : rows * 9;
//	    }
	    return rows * 9;
	}

	public Integer getRows() {
	    return rows;
	}

	public static GUIRows getByRows(Integer rows) {
	    if (rows > 9)
		rows = rows / 9;
	    for (GUIRows one : GUIRows.values()) {
		if (one.getRows().equals(rows))
		    return one;
	    }
	    return GUIRows.r6;
	}
    }

    public enum GUIFieldType {
	Free, Locked
    }

    public enum InvType {
	Gui, Main, Quickbar
    }

    public enum CmiInventoryType {
	regular, SavedInv, EditableInv, RecipeCreator, ArmorStandEditor, ArmorStandCopy, EntityInventoryEditor, Recipes, SellHand
    }

    public enum GUIClickType {
	Left, LeftShift, Right, RightShift, MiddleMouse
    }

    public void closeAll() {
    }

    public GUIClickType getClickType(boolean left, boolean shift, InventoryAction action) {
	return null;
    }

    public boolean processClick(final Player player, List<Integer> buttons, final GUIClickType clickType) {

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

    public boolean removePlayer(Player player) {

	return true;
    }

    public void generateInventory(CMIGui gui) {

    }

    public void openGui(CMIGui gui) {

    }

    public void updateContent(CMIGui gui) {
    }

}
