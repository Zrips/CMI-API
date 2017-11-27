package com.Zrips.CMI.Modules.CmiItems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Attributes.Attribute;

public class CMIItemStack {

    private int id = 0;
    private short data = 0;
    private int amount = 0;

    private String bukkitName = null;
    private String mojangName = null;
    private Material material = null;
    private ItemStack item;

    public CMIItemStack(Material material) {
	this.material = material;
    }

    public CMIItemStack(ItemStack item) {
	this.setItemStack(item);
    }

    @Override
    public CMIItemStack clone() {
	CMIItemStack cm = new CMIItemStack(material);
	cm.setId(id);
	cm.setData(data);
	cm.setBukkitName(bukkitName);
	cm.setMojangName(mojangName);
	cm.setItemStack(this.item);
	return cm;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public short getData() {
	return data;
    }

    public boolean isTool() {
	return getMaxDurability() > 0;
    }

    public short getDurability() {
	return this.getItemStack().getDurability();
    }

    public short getMaxDurability() {
	return this.material.getMaxDurability();
    }

    public void setData(short data) {
	this.data = data;
    }

    public CMIItemStack setUnbreakable(Boolean state) {
	return this;
    }

    public CMIItemStack addAttributes(List<Attribute> attList) {
	return this;
    }

    public CMIItemStack setTag(String tag) {
	return this;
    }

    public CMIItemStack setDisplayName(String name) {
	return this;
    }

    public String getDisplayName() {
	ItemMeta meta = this.getItemStack().getItemMeta();
	return meta.getDisplayName() == null ? this.getRealName() : meta.getDisplayName();
    }

    public CMIItemStack addLore(String string) {
	return this;
    }

    public CMIItemStack setLore(List<String> lore) {
	return this;
    }

    public CMIItemStack addEnchant(Enchantment enchant, Integer level) {
	return this;
    }

    public CMIItemStack addEnchant(HashMap<Enchantment, Integer> enchants) {
	return this;
    }

    public CMIItemStack clearEnchants() {
	return this;
    }

    public List<String> getLore() {
	ItemMeta meta = this.getItemStack().getItemMeta();
	return meta.getLore();
    }

    public String getRealName() {
	return CMI.getInstance().getItemManager().getRealName(this, true).getName();
    }

    public String getBukkitName() {
	return bukkitName;
    }

    public void setBukkitName(String bukkitName) {
	this.bukkitName = bukkitName;
    }

    public String getMojangName() {
	return mojangName;
    }

    public void setMojangName(String mojangName) {
	this.mojangName = mojangName.replace("minecraft:", "");
    }

    public Material getMaterial() {
	return material;
    }

    public void setMaterial(Material material) {
	this.material = material;
    }

    @SuppressWarnings("deprecation")
    public ItemStack getItemStack() {
	return null;
    }

    @SuppressWarnings("deprecation")
    public CMIItemStack setItemStack(ItemStack item) {

	return null;
    }

    public int getAmount() {
	return amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
    }

    public boolean isSimilar(ItemStack item) {
	return isSimilar(CMI.getInstance().getItemManager().getItem(item));
    }

    public boolean isSimilar(CMIItemStack item) {
	if (item == null)
	    return false;
	return this.getMaterial().equals(item.material) && this.getData() == item.getData();
    }

    public boolean hasNbtTag() {
	return CMI.getInstance().getRef().hasNbt(this.getItemStack());
    }
}
