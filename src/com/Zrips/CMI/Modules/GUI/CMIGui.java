package com.Zrips.CMI.Modules.GUI;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashSet;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMISound;
import com.Zrips.CMI.Containers.PageInfo;
import com.Zrips.CMI.Modules.GUI.GUIManager.CmiInventoryType;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIButtonLocation;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;
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
    private LinkedHashSet<CMIGuiButton> noSlotButtons = new LinkedHashSet<CMIGuiButton>();

    private EnumMap<InvType, GUIFieldType> lock = new EnumMap<>(InvType.class);
    private EnumMap<InvType, String> permLock = new EnumMap<>(InvType.class);

    private CmiInventoryType type = CmiInventoryType.regular;
    private Object whatShows;
    private Object tempData;

    private boolean allowShift = false;
    private boolean allowPickUpAll = false;
    private boolean allowItemPickup = true;

    private CMISound openSound = null;
    private CMISound closeSound = null;

    public CMIGui(Player player) {
	this.player = player;
    }

    @Override
    public CMIGui clone() {
	return null;
    }

    public void playOpenSound() {
    }

    public void playCloseSound() {
    }

    public boolean isOpened() {
	return CMI.getInstance().getGUIManager().isOpenedGui(getPlayer());
    }

    public boolean isSimilar(CMIGui gui) {

	return true;
    }

    public CMIGui open() {
	return null;
    }

    public void outsideClick(GUIClickType type) {

    }

    public InventoryType getInvType() {
	return null;
    }

    public void setInvType(InventoryType invType) {
	this.invType = invType;
    }

    public GUIRows getInvSize() {
	return null;
    }

    public void setInvSize(GUIRows GUIRows) {
	this.gUIRows = GUIRows;
    }

    public void setInvSize(int rows) {
	this.gUIRows = GUIRows.getByRows(rows);
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
	if (inv == null)
	    CMI.getInstance().getGUIManager().generateInventory(this);
	return inv;
    }

    public void setInv(Inventory inv) {
	this.inv = inv;
    }

    public String getTitle() {
	return null;
    }

    public void updateTitle(String title) {
    }

    public void setTitle(String title) {

    }

    public HashMap<Integer, CMIGuiButton> getButtons() {
	return null;
    }

    public CMIGui replaceButton(CMIGuiButton button) {

	return null;
    }

    public CMIGui addButton(CMIGuiButton button) {
	return null;
    }

    public CMIGui addButton(CMIGuiButton button, int maxSlot) {

	return null;
    }

    private void combineButtons() {
    }

    public void fillEmptyButtons() {
	fillEmptyButtons(null);
    }

    public void fillEmptyButtons(ItemStack item) {
    }

    public void updateButton(CMIGuiButton button) {
    }

    public void addEmptyButton(int slot) {
    }

    public void addEmptyButton(ItemStack item, int slot) {

    }

    public void setButtons(HashMap<Integer, CMIGuiButton> buttons) {
    }

    public boolean isLocked(InvType type) {
	return lock.containsKey(type) ? (lock.get(type) == GUIFieldType.Locked) : false;
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

    public void setCmiInventoryType(CmiInventoryType type) {
	this.type = type;
    }

    public Object getWhatShows() {
	return whatShows;
    }

    public void setWhatShows(Object whatShows) {
	this.whatShows = whatShows;
    }

    public Integer getSlot(GUIButtonLocation place) {
	return null;
    }

    public void onClose() {

    }

    public void onOpen() {

    }

    public void pageChange(int page) {

    }

    public void addPagination(PageInfo pi) {

    }

    public boolean isAllowShift() {
	return allowShift;
    }

    public void setAllowShift(boolean allowShift) {
	this.allowShift = allowShift;
    }

    public CMISound getOpenSound() {
	return openSound;
    }

    public void setOpenSound(CMISound openSound) {
	this.openSound = openSound;
    }

    public CMISound getCloseSound() {
	return closeSound;
    }

    public void setCloseSound(CMISound closeSound) {
	this.closeSound = closeSound;
    }

    public Object getTempData() {
	return tempData;
    }

    public void setTempData(Object tempData) {
	this.tempData = tempData;
    }

    public boolean isAllowPickUpAll() {
	return allowPickUpAll;
    }

    public void setAllowPickUpAll(boolean allowPickUpAll) {
	this.allowPickUpAll = allowPickUpAll;
    }

    public void updateButtons() {
    }

    public boolean isAllowItemPickup() {
	return allowItemPickup;
    }

    public void setAllowItemPickup(boolean allowItemPickup) {
	this.allowItemPickup = allowItemPickup;
    }
}
