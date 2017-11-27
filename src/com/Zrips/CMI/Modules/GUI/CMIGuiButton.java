package com.Zrips.CMI.Modules.GUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.ChatColor;

import com.Zrips.CMI.Modules.GUI.GUIManager.GUIClickType;
import com.Zrips.CMI.Modules.GUI.GUIManager.GUIFieldType;

public class CMIGuiButton {

    private Integer slot = null;
    private GUIFieldType fieldType = GUIFieldType.Locked;

    private HashMap<GUIClickType, List<String>> commandMap = new HashMap<GUIClickType, List<String>>();

    private List<String> permissions = new ArrayList<String>();
    private ItemStack item = null;

    @Override
    public CMIGuiButton clone() {
	CMIGuiButton b = new CMIGuiButton(slot, fieldType, item);
	b.setPermissions(permissions);
	b.setCommandMap(commandMap);
	return b;
    }

    public CMIGuiButton(Integer slot, GUIFieldType fieldType, ItemStack item) {
	this.slot = slot;
	this.fieldType = fieldType;
	this.item = item;
    }

    public CMIGuiButton(Integer slot) {
	this.slot = slot;
    }

    public CMIGuiButton(ItemStack item) {
	this.item = item;
    }

    public CMIGuiButton(Integer slot, ItemStack item) {
	this.slot = slot;
	this.item = item;
    }

    public CMIGuiButton(Integer slot, Material material) {
	this.slot = slot;
	this.item = new ItemStack(material);
    }

    public CMIGuiButton(Integer slot, Material material, int data) {
	this(slot, material, data, null);
    }

    public CMIGuiButton(Integer slot, Material material, String name) {
	this(slot, material, 0, name);
    }

    public CMIGuiButton(Integer slot, Material material, int data, String name) {
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

    public List<String> getCommands(GUIClickType type) {
	List<String> list = commandMap.get(type);
	if (list == null)
	    list = new ArrayList<String>();
	return list;
    }

    public CMIGuiButton setName(String name) {
	return this;
    }

    public CMIGuiButton addLore(List<String> l) {
	return this;
    }

    public CMIGuiButton addLore(String l) {
	return this;
    }

    public CMIGuiButton addItemName(String name) {
	return this;
    }

    public CMIGuiButton addCommand(String command) {
	return addCommand(null, command);
    }

    public CMIGuiButton addCommand(GUIClickType type, String command) {
	return this;
    }

    public CMIGuiButton addCommand(Location loc) {
	return this;
    }

    public ItemStack getItem() {
	return item;
    }

    public CMIGuiButton setItem(ItemStack item) {
	this.item = item;
	return this;
    }

    public void setCommandMap(HashMap<GUIClickType, List<String>> commandMap) {
	this.commandMap = commandMap;
    }

}
