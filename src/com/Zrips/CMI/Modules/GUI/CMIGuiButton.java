package com.Zrips.CMI.Modules.GUI;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Containers.CMIChatColor;
import com.Zrips.CMI.Modules.CmiItems.CMIItemStack;
import com.Zrips.CMI.Modules.CmiItems.CMIMaterial;
import com.Zrips.CMI.Modules.Enchants.CMIEnchantment;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIFieldType;
import com.Zrips.CMI.utils.Util.CommandType;

public class CMIGuiButton {

    private Integer slot = null;
    private GUIFieldType fieldType = GUIFieldType.Locked;
    private boolean closeInv = false;

    private EnumMap<GUIClickType, List<GUIButtonCommand>> commandMap = new EnumMap<>(GUIClickType.class);

    private List<String> permissions = new ArrayList<String>();
    private ItemStack item = null;

    @Override
    public CMIGuiButton clone() {
	return null;
    }

    public CMIGuiButton(Integer slot, GUIFieldType fieldType, ItemStack item) {
    }

    public CMIGuiButton(Integer slot) {
	this.slot = slot;
    }

    public void hideItemFlags() {
	if (item != null)
	    item = CMI.getInstance().getReflectionManager().HideFlag(item, 63);
    }

    public CMIGuiButton(ItemStack item) {
	this.item = item == null ? null : item.clone();
    }

    public CMIGuiButton(CMIMaterial mat) {
	this.item = mat == null ? null : mat.newItemStack();
    }

    public CMIGuiButton(Integer slot, CMIItemStack item) {
	this(slot, item.getItemStack());
    }

    public CMIGuiButton(Integer slot, Material material) {
	this(slot, CMIMaterial.get(material), null);
    }

    public CMIGuiButton(Integer slot, CMIMaterial material) {
	this(slot, material, null);
    }

    @Deprecated
    public CMIGuiButton(Integer slot, Material material, int data) {
	this(slot, material, data, null);
    }

    public CMIGuiButton(Integer slot, Material material, String name) {
	this(slot, CMIMaterial.get(material), name);
    }

    public CMIGuiButton(Integer slot, CMIMaterial material, String name) {
    }

    @Deprecated
    public CMIGuiButton(Integer slot, Material material, int data, String name) {
    }

    public CMIGuiButton(Integer slot, ItemStack item) {
    }

    private int schedId = -1;
    private int updateInterval = 20;
    private int ticks = 0;
    private CMIGui sgui;

    public void setGui(CMIGui sgui) {
	this.sgui = sgui;
    }

    public void startAutoUpdate(int intervalTicks) {
	updateInterval = intervalTicks;
	tasker();
    }

    @Deprecated
    public void startAutoUpdate(CMIGui sgui, int intervalTicks) {
	updateInterval = intervalTicks;
	this.sgui = sgui;
	tasker();
    }

    private void tasker() {
	
    }

    public void updateLooks() {

    }

    public void update() {
	if (this.sgui != null)
	    sgui.updateButton(this);
    }

    public void update(CMIGui gui) {
	if (gui != null)
	    gui.updateButton(this);
    }

    public Integer getSlot() {
	return slot;
    }

    public CMIGuiButton setSlot(Integer slot) {
	this.slot = slot;
	return this;
    }

    public GUIFieldType getFieldType() {
	return fieldType;
    }

    public CMIGuiButton setFieldType(GUIFieldType fieldType) {
	this.fieldType = fieldType;
	return this;
    }

    public CMIGuiButton lockField() {
	this.fieldType = GUIFieldType.Locked;
	return this;
    }

    public CMIGuiButton unlockField() {
	this.fieldType = GUIFieldType.Free;
	return this;
    }

    public boolean isLocked() {
	return this.fieldType.equals(GUIFieldType.Locked);
    }

    public List<String> getPermissions() {
	return permissions;
    }

    public CMIGuiButton addPermission(String perm) {
	this.permissions.add(perm);
	return this;
    }

    public void setPermissions(List<String> permissions) {
	this.permissions = permissions;
    }

    public List<GUIButtonCommand> getCommands(GUIClickType type) {
	return null;
    }

    public CMIGuiButton setName(String name) {
	return null;
    }

    public CMIGuiButton addLore(List<String> l) {
	return null;
    }

    public CMIGuiButton addLore(String l) {
	
	return null;
    }

    public CMIGuiButton clearLore() {
	
	return null;
    }

    public CMIGuiButton addItemName(String name) {

	return null;
    }

    public CMIGuiButton addCommand(String command) {
	return null;
    }

    public CMIGuiButton addCommand(String command, CommandType vis) {
	return null;
    }

    public CMIGuiButton addCommand(GUIClickType type, String command) {
	return null;
    }

    public CMIGuiButton addCommand(GUIClickType type, String command, CommandType vis) {
	
	return null;
    }

    public void click() {

    }

    public void click(GUIClickType type) {

    }

    public CMIGuiButton addCommand(Location loc) {
	return null;
    }

    public ItemStack getItem() {
	return null;
    }

    public ItemStack getItem(Player player) {

	return null;
    }

    public CMIGuiButton setItem(ItemStack item) {
	return null;
    }

    public void setCommandMap(HashMap<GUIClickType, List<GUIButtonCommand>> commandMap) {
    }

    public boolean isCloseInv() {
	return closeInv;
    }

    public void setCloseInv(boolean closeInv) {
	this.closeInv = closeInv;
    }

    public CMIGui getGui() {
	return sgui;
    }

    public int getTicks() {
	return ticks;
    }

    public void setGlowing() {
    }

    public void removeGlowing() {
    }
}
