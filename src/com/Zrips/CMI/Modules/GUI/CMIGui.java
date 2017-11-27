package com.Zrips.CMI.Modules.GUI;

import java.util.HashMap;
import java.util.Map.Entry;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.ChatColor;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.GUI.GUIManager.CmiInventoryType;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIFieldType;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIRows;
import com.Zrips.CMI.Modules.GUI.GUIManager.InvType;

public class CMIGui {

    private InventoryType invType;
    private GUIRows gUIRows;
    private Player player;
    private Inventory inv;
    private String title;
    private HashMap<Integer, CMIGuiButton> buttons = new HashMap<Integer, CMIGuiButton>();

    private HashMap<InvType, GUIFieldType> lock = new HashMap<InvType, GUIFieldType>();
    private HashMap<InvType, String> permLock = new HashMap<InvType, String>();

    private CmiInventoryType type;
    private Object whatShows;

    public CMIGui(Player player) {
	this.player = player;
    }

    @Override
    public CMIGui clone() {
	return null;
    }

    public boolean isSimilar(CMIGui gui) {
	return true;
    }

    public CMIGui open() {
	return this;
    }

    public InventoryType getInvType() {
	return invType;
    }

    public void setInvType(InventoryType invType) {
	this.invType = invType;
    }

    public GUIRows getInvSize() {
	return gUIRows;
    }

    public void setInvSize(GUIRows GUIRows) {
	this.gUIRows = GUIRows;
    }

    public void autoResize() {
    }

    public Player getPlayer() {
	return player;
    }

    public void setPlayer(Player player) {
	this.player = player;
    }

    public Inventory getInv() {
	return inv;
    }

    public void setInv(Inventory inv) {
	this.inv = inv;
    }

    public String getTitle() {
	return ChatColor.translateAlternateColorCodes('&', title);
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public HashMap<Integer, CMIGuiButton> getButtons() {
	return buttons;
    }

    public CMIGui addButton(CMIGuiButton button) {
	return this;
    }

    public void fillEmptyButtons() {
    }

    public void addEmptyButton(int slot) {
    }

    public void setButtons(HashMap<Integer, CMIGuiButton> buttons) {
    }

    public boolean isLocked(InvType type) {
	return true;
    }

    public void addLock(InvType type) {
	addLock(type, GUIFieldType.Locked);
    }

    public void addLock(InvType type, GUIFieldType lock) {
	this.lock.put(type, lock);
    }

    public boolean isPermLocked(InvType type) {
	return permLock.containsKey(type) ? (!this.player.hasPermission(permLock.get(type))) : true;
    }

    public void addPermLock(InvType type, String perm) {
	this.permLock.put(type, perm);
    }

    public CmiInventoryType getType() {
	return type;
    }

    public void setType(CmiInventoryType type) {
	this.type = type;
    }

    public Object getWhatShows() {
	return whatShows;
    }

    public void setWhatShows(Object whatShows) {
	this.whatShows = whatShows;
    }

}
