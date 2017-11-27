package com.Zrips.CMI.Modules.SavedInv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class CMIInventory {

    private int id = 0;
    private String owner;
    private Long time = 0L;
    private String killer;
    private String DeathReason;
    private double Exp;
    private double Health;
    private double MaxHealth;
    private float Saturation;
    private int Hunger;
    private GameMode GameMode;
    private boolean Fly;
    private Collection<PotionEffect> potions = new ArrayList<PotionEffect>();
    private HashMap<Integer, ItemStack> items = new HashMap<Integer, ItemStack>();
    private Location loc;
    
    private boolean editable = false;
    private UUID uuid;

    public CMIInventory() {
    }
    
    public CMIInventory(String owner, UUID uuid) {
	this.owner = owner;
	this.uuid = uuid;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public Long getTime() {
	return time;
    }

    public void setTime(Long time) {
	this.time = time;
    }

    public String getKiller() {
	return killer;
    }

    public void setKiller(String killer) {
	this.killer = killer;
    }

    public String getDeathReason() {
	return DeathReason;
    }

    public void setDeathReason(String deathReason) {
	DeathReason = deathReason;
    }

    public double getExp() {
	return Exp;
    }

    public void setExp(double exp) {
	Exp = exp;
    }

    public double getHealth() {
	return Health;
    }

    public void setHealth(double health) {
	Health = health;
    }

    public double getMaxHealth() {
	return MaxHealth;
    }

    public void setMaxHealth(double maxHealth) {
	MaxHealth = maxHealth;
    }

    public float getSaturation() {
	return Saturation;
    }

    public void setSaturation(float saturation) {
	Saturation = saturation;
    }

    public int getHunger() {
	return Hunger;
    }

    public void setHunger(int hunger) {
	Hunger = hunger;
    }

    public GameMode getGameMode() {
	return GameMode;
    }

    public void setGameMode(GameMode gameMode) {
	GameMode = gameMode;
    }

    public boolean isFly() {
	return Fly;
    }

    public void setFly(boolean fly) {
	Fly = fly;
    }

    public Location getLocation() {
	return loc;
    }

    public void setLoc(Location loc) {
	this.loc = loc;
    }

    public Collection<PotionEffect> getPotions() {
	return potions;
    }

    public void setPotions(Collection<PotionEffect> potions) {
	this.potions = potions;
    }

    public HashMap<Integer, ItemStack> getItems() {
	return items;
    }

    public ItemStack getBoots() {
	return items.get(36);
    }

    public ItemStack getPants() {
	return items.get(37);
    }

    public ItemStack getChest() {
	return items.get(38);
    }

    public ItemStack getHelmet() {
	return items.get(39);
    }

    public ItemStack getOffHand() {
	return items.get(40);
    }

    public void setItems(HashMap<Integer, ItemStack> items) {
	this.items = items;
    }

    public String getOwner() {
	return owner;
    }

    public void setOwner(String owner) {
	this.owner = owner;
    }

    public boolean isEditable() {
	return editable;
    }

    public void setEditable(boolean editable) {
	this.editable = editable;
    }

    public UUID getUuid() {
	return uuid;
    }

    public void setUuid(UUID uuid) {
	this.uuid = uuid;
    }

}
