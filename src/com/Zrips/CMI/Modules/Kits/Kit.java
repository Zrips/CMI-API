package com.Zrips.CMI.Modules.Kits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;
import net.Zrips.CMILib.Colors.CMIChatColor;
import com.Zrips.CMI.Containers.CMIPlayerInventory.CMIInventorySlot;
import net.Zrips.CMILib.Items.CMIMaterial;

public class Kit {

    private List<ItemStack> item = new ArrayList<ItemStack>();
    private List<String> commands = new ArrayList<String>();
    private List<String> conditions = new ArrayList<String>();
    private List<String> Description = new ArrayList<String>();

    private HashMap<CMIInventorySlot, ItemStack> extraItems = new HashMap<CMIInventorySlot, ItemStack>();

    private ItemStack Icon = null;
    private ItemStack IconOff = null;
    private double cost = 0D;
    private int expCost = 0;
    private Long delay = -1L;
    private String name = null;
    private String displayName = null;
    private String group = null;
    private boolean enabled = true;
    private int weight = 0;
    private String cmdName = null;

    private Integer slot = null;

    private int maxUsages = -1;
    private boolean showDespiteUsage = false;
    private boolean showDespiteWeight = false;

    private boolean dropItems = true;

    public Kit(String name) {
	this.name = CMIChatColor.stripColor(name);
	reset();
    }

    public void reset() {
    }

    public ItemStack getFirstNotNullItem() {
	return null;
    }

    public List<ItemStack> getItems() {
	return null;
    }

    public List<ItemStack> getItems(Player player) {
	
	return null;
    }

    private ItemStack checkBook(ItemStack book) {
	
	return null;
    }

    public void setItem(List<ItemStack> item) {
	
    }

    public void setItem(int slot, ItemStack item) {
	
    }

    public void addItem(ItemStack item) {
	
    }

    public List<String> getCommands(Player player) {
	
	return null;
    }

    public List<String> getCommands() {
	return commands;
    }

    public void setCommands(List<String> commands) {
	this.commands = commands;
    }

    public double getCost() {
	return cost;
    }

    public void setCost(double cost) {
	this.cost = cost;
    }

    public int getExpCost() {
	return expCost;
    }

    public void setExpCost(int expCost) {
	this.expCost = expCost;
    }

    public long getDelay() {
	return delay;
    }

    public void setDelay(long delay) {
	this.delay = delay;
    }

//    public boolean isOneTimeUse() {
//	return this.delay <= -1;
//    }

    public List<String> getConditions() {
	return conditions;
    }

    public void setConditions(List<String> conditions) {
	this.conditions = conditions;
    }

    public String getConfigName() {
	return name;
    }

    public void setName(String name) {
	this.name = CMIChatColor.stripColor(name);
    }

    public List<String> getDescription(Player player) {
	return null;
    }

    public List<String> getDescription() {
	return Description;
    }

    public void setDescription(List<String> description) {
	Description = description;
    }

    public String getGroup() {
	return group;
    }

    public void setGroup(String group) {
	if (group.equalsIgnoreCase("na") || group.equalsIgnoreCase("none"))
	    this.group = null;
	else
	    this.group = group;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public void setEnabled(boolean enabled) {
	this.enabled = enabled;
    }

    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }

    public String getCommandName() {
	if (cmdName == null)
	    cmdName = this.getConfigName();
	return cmdName;
    }

    public void setCommandName(String CommandName) {
	this.cmdName = CommandName;
    }

    public ItemStack getExtraItem(CMIInventorySlot slot) {

	return extraItems.get(slot);
    }

    public ItemStack getExtraItem(Player player, CMIInventorySlot slot) {

	return null;
    }

    public void setExtraItem(CMIInventorySlot slot, ItemStack item) {
	if (item != null)
	    extraItems.put(slot, item.clone());
	else
	    extraItems.put(slot, null);
    }

    @Deprecated
    public ItemStack getHelmet() {
	return extraItems.get(CMIInventorySlot.Helmet);
    }

    @Deprecated
    public void setHelmet(ItemStack helmet) {
	if (helmet != null)
	    extraItems.put(CMIInventorySlot.Helmet, helmet.clone());
    }

    @Deprecated
    public ItemStack getChest() {
	return extraItems.get(CMIInventorySlot.ChestPlate);
    }

    @Deprecated
    public void setChest(ItemStack chest) {
	if (chest != null)
	    extraItems.put(CMIInventorySlot.ChestPlate, chest.clone());
    }

    @Deprecated
    public ItemStack getLegs() {
	return extraItems.get(CMIInventorySlot.Pants);
    }

    @Deprecated
    public void setLegs(ItemStack legs) {
	if (legs != null)
	    extraItems.put(CMIInventorySlot.Pants, legs.clone());
    }

    @Deprecated
    public ItemStack getBoots() {
	return extraItems.get(CMIInventorySlot.Boots);
    }

    @Deprecated
    public void setBoots(ItemStack boots) {
	if (boots != null)
	    extraItems.put(CMIInventorySlot.Boots, boots.clone());
    }

    @Deprecated
    public ItemStack getOffHand() {
	return extraItems.get(CMIInventorySlot.OffHand);
    }

    @Deprecated
    public void setOffHand(ItemStack offHand) {
	if (offHand != null)
	    extraItems.put(CMIInventorySlot.OffHand, offHand.clone());
    }

    public Integer getSlot() {
	return slot;
    }

    public void setSlot(Integer slot) {
	this.slot = slot;
    }

    public ItemStack getSafeIcon() {
	if (Icon != null)
	    return Icon.clone();
	return this.item.isEmpty() ? CMIMaterial.WHITE_WOOL.newItemStack() : getFirstNotNullItem() != null ? getFirstNotNullItem() : CMIMaterial.WHITE_WOOL.newItemStack();
    }

    public ItemStack getIcon() {
	if (Icon != null)
	    return Icon.clone();
	return Icon;
    }

    public void setIcon(ItemStack icon) {
	Icon = icon;
    }

    public ItemStack getSafeIconOff() {
	if (IconOff != null)
	    return IconOff.clone();
	return getSafeIcon();
    }

    public ItemStack getIconOff() {
	if (IconOff != null)
	    return IconOff.clone();
	return getIcon();
    }

    public void setIconOff(ItemStack iconOff) {
	IconOff = iconOff;
    }

    public int getMaxUsages() {
	return maxUsages;
    }

    public void setMaxUsages(int maxUsages) {
	this.maxUsages = maxUsages;
    }

    public boolean isLimitedUse() {
	return this.maxUsages > 0;
    }

    public boolean isShowDespiteWeight() {
	return showDespiteWeight;
    }

    public void setShowDespiteWeight(boolean showDespiteWeight) {
	this.showDespiteWeight = showDespiteWeight;
    }

    public boolean isDropItems() {
	return dropItems;
    }

    public void setDropItems(boolean dropItems) {
	this.dropItems = dropItems;
    }

    public String getDisplayName() {
	return displayName == null ? getCommandName() : displayName;
    }

    public void setDisplayName(String displayName) {
	this.displayName = displayName;
    }

    public boolean isShowDespiteUsage() {
	return showDespiteUsage;
    }

    public void setShowDespiteUsage(boolean showDespiteUsage) {
	this.showDespiteUsage = showDespiteUsage;
    }

}
