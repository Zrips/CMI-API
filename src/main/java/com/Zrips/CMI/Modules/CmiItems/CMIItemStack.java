package com.Zrips.CMI.Modules.CmiItems;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

import com.Zrips.CMI.CMI;
import com.Zrips.CMI.Modules.Attributes.Attribute;

public class CMIItemStack {

    private int id = 0;
    private short data = 0;
    private short durability = 0;
    private int amount = 0;

    private String bukkitName = null;
    private String mojangName = null;
    private CMIMaterial cmiMaterial = null;
    private Material material = null;
    private CMIEntityType entityType = null;
    private ItemStack item;

    public CMIItemStack(Material material) {
	this.material = material;
	this.cmiMaterial = CMIMaterial.get(material);
    }

    public CMIItemStack(CMIMaterial cmiMaterial) {
	this.cmiMaterial = cmiMaterial;
	if (cmiMaterial != null)
	    this.material = cmiMaterial.getMaterial();
    }

    public CMIItemStack(ItemStack item) {
	this.setItemStack(item);
    }

    @Override
    public CMIItemStack clone() {
	CMIItemStack cm = new CMIItemStack(material);
	cm.entityType = this.entityType;
	cm.setId(id);
	cm.setData(data);
	cm.setAmount(amount);
	cm.setDurability(durability);
	cm.setBukkitName(bukkitName);
	cm.setMojangName(mojangName);
	cm.setCMIMaterial(cmiMaterial);
	cm.setMaterial(material);
	cm.setItemStack(this.item != null ? this.item.clone() : null);
	return cm;
    }

    public int getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public short getData() {
	return data;
    }

    public boolean isTool() {
	return getMaxDurability() > 0;
    }

    public boolean isArmor() {
	if (this.getCMIType() != null && this.getCMIType().isArmor())
	    return true;
	return CMIMaterial.isArmor(this.getType());
    }

    public short getDurability() {
	return this.getItemStack().getDurability();
    }

    public short getMaxDurability() {
	return this.material.getMaxDurability();
    }

    public void setData(short data) {
    }

    public CMIItemStack setUnbreakable(Boolean state) {
	return null;
    }

    public CMIItemStack addAttributes(List<Attribute> attList) {
	return null;
    }

    public CMIItemStack setTag(String tag) {
	return null;
    }

    public CMIItemStack setDisplayName(String name) {
	return null;
    }

    public String getDisplayName() {
	return null;
    }

    public CMIItemStack addLore(String string) {
	return null;
    }

    public CMIItemStack clearLore() {
	return null;
    }

    public CMIItemStack setLore(List<String> lore) {
	return null;
    }

    public CMIItemStack addEnchant(Enchantment enchant, Integer level) {
	return null;
    }

    public CMIItemStack addEnchant(HashMap<Enchantment, Integer> enchants) {
	return null;
    }

    public CMIItemStack clearEnchants() {
	return null;
    }

    public List<String> getLore() {
	return null;
    }

    public String getRealName() {
	return null;
    }

    public String getBukkitName() {
	return bukkitName == null || bukkitName.isEmpty() ? null : bukkitName;
    }

    public void setBukkitName(String bukkitName) {
	this.bukkitName = bukkitName;
    }

    public String getMojangName() {
	return null;
    }

    public void setMojangName(String mojangName) {
    }

    public Material getType() {
	return null;
    }

    public CMIMaterial getCMIType() {
	return null;
    }

    @Deprecated
    public Material getMaterial() {
	return getType();
    }

    public void setMaterial(Material material) {
    }

    public void setCMIMaterial(CMIMaterial material) {
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
	return amount <= 0 ? 1 : amount;
    }

    public void setAmount(int amount) {
	this.amount = amount;
	if (item != null)
	    this.item.setAmount(this.amount == 0 ? item.getAmount() : this.amount);
    }

    public boolean isSimilar(ItemStack item) {
	return isSimilar(CMI.getInstance().getItemManager().getItem(item));
    }

    public boolean isSimilar(CMIItemStack item) {
	return false;
    }

    public EntityType getEntityType() {

	return null;
    }

    public boolean hasNbtTag() {
	return false;
    }

    public List<Recipe> getRecipesFor() {

	return null;
    }

    public List<Recipe> getRecipesFrom() {

	return null;
    }

    public void setDurability(short durability) {
	this.durability = durability;
    }

    public Set<Enchantment> getValidEnchants() {

	return null;
    }

    public String toOneLiner() {

	return null;
    }

    public static ItemStack getHead(String texture) {

	return null;
    }

    public void setEntityType(CMIEntityType entityType) {
	this.entityType = entityType;
    }

    public void setEntityType(EntityType entityType) {
	setEntityType(CMIEntityType.getByType(entityType));
    }
}
