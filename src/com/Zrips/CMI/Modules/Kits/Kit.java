package com.Zrips.CMI.Modules.Kits;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.Zrips.CMI.CMI;

public class Kit {

    private List<ItemStack> item = new ArrayList<ItemStack>();
    private List<String> commands = new ArrayList<String>();
    private List<String> conditions = new ArrayList<String>();
    private List<String> Description = new ArrayList<String>();
    private ItemStack helmet = null;
    private ItemStack chest = null;
    private ItemStack legs = null;
    private ItemStack boots = null;
    private ItemStack OffHand = null;
    
    private ItemStack Icon = null;
    private double cost = 0D;
    private int expCost = 0;
    private Long delay = -1L;
    private String name = null;
    private String group = null;
    private boolean enabled = true;
    private int weight = 0;
    private String cmdName = null;
    
    private Integer slot = null;

//    @Override
//    public Kit clone() {
//	Kit kit = new Kit(this.name);	
//	kit.setCommands(commands);
//	kit.setConditions(conditions);
//	kit.setCost(cost);
//	kit.setDelay(delay);
//	kit.setDescription(Description);
//	kit.setExpCost(expCost);
//	kit.setGroup(group);
//	kit.setItem(item);	
//	kit.setName(name);	
//        return kit;
//    }

    public Kit(String name) {
	this.name = name;
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

    public void setItem(List<ItemStack> item) {
	this.item = item;
    }

    public void setItem(int slot, ItemStack item) {
	this.item.set(slot, item);
    }

    public void addItem(ItemStack item) {
	this.item.add(item);
    }

    public List<String> getCommands(Player player) {
	List<String> t = new ArrayList<String>();
	for (String one : commands) {
	    t.add(CMI.getInstance().getKitsManager().processText(one, player, this));
	}
	return t;
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
	this.name = name;
    }

    public List<String> getDescription(Player player) {
	List<String> t = new ArrayList<String>();
	for (String one : this.Description) {
	    t.add(CMI.getInstance().getKitsManager().processText(one, player, this));
	}
	return t;
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

    public ItemStack getHelmet() {
	return helmet;
    }

    public void setHelmet(ItemStack helmet) {
	this.helmet = helmet;
    }

    public ItemStack getChest() {
	return chest;
    }

    public void setChest(ItemStack chest) {
	this.chest = chest;
    }

    public ItemStack getLegs() {
	return legs;
    }

    public void setLegs(ItemStack legs) {
	this.legs = legs;
    }

    public ItemStack getBoots() {
	return boots;
    }

    public void setBoots(ItemStack boots) {
	this.boots = boots;
    }

    public ItemStack getOffHand() {
	return OffHand;
    }

    public void setOffHand(ItemStack offHand) {
	OffHand = offHand;
    }

    public Integer getSlot() {
	return slot;
    }

    public void setSlot(Integer slot) {
	this.slot = slot;
    }

    public ItemStack getIcon() {
	if (Icon != null)
	    return Icon.clone();
	return Icon;
    }

    public void setIcon(ItemStack icon) {
	Icon = icon;
    }

}
