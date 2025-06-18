package com.Zrips.CMI.Modules.SavedInv;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

public class CMIInventory {
    private int id;
    private String owner;
    private long time;
    private String killer;
    private String DeathReason;
    private double Exp;
    private double Health;
    private double MaxHealth;
    private float Saturation;
    private int Hunger;
    private GameMode GameMode;
    private boolean Fly;
    private Collection<PotionEffect> potions;
    private HashMap<Integer, ItemStack> items;
    private Location loc;
    private boolean editable;
    private UUID uuid;

    public CMIInventory() {
    }

    public CMIInventory(String owner, UUID uuid) {
    }

    public int getId() {
        return 0;
    }

    public void setId(int id) {
    }

    public void afterSave() {
    }

    public Long getTime() {
        return null;
    }

    public void setTime(Long time) {
    }

    public String getKiller() {
        return null;
    }

    public void setKiller(String killer) {
    }

    public String getDeathReason() {
        return null;
    }

    public void setDeathReason(String deathReason) {
    }

    public double getExp() {
        return 0.0;
    }

    public void setExp(double exp) {
    }

    public double getHealth() {
        return 0.0;
    }

    public void setHealth(double health) {
    }

    public double getMaxHealth() {
        return 0.0;
    }

    public void setMaxHealth(double maxHealth) {
    }

    public float getSaturation() {
        return 0.0f;
    }

    public void setSaturation(float saturation) {
    }

    public int getHunger() {
        return 0;
    }

    public void setHunger(int hunger) {
    }

    public GameMode getGameMode() {
        return null;
    }

    public void setGameMode(GameMode gameMode) {
    }

    public boolean isFly() {
        return false;
    }

    public void setFly(boolean fly) {
    }

    public Location getLocation() {
        return null;
    }

    public void setLoc(Location loc) {
    }

    public Collection<PotionEffect> getPotions() {
        return null;
    }

    public void setPotions(Collection<PotionEffect> potions) {
    }

    public HashMap<Integer, ItemStack> getItems() {
        return null;
    }

    public ItemStack getBoots() {
        return null;
    }

    public ItemStack getPants() {
        return null;
    }

    public ItemStack getChest() {
        return null;
    }

    public ItemStack getHelmet() {
        return null;
    }

    public ItemStack getOffHand() {
        return null;
    }

    public void setItems(HashMap<Integer, ItemStack> items) {
    }

    public String getOwner() {
        return null;
    }

    public void setOwner(String owner) {
    }

    public boolean isEditable() {
        return false;
    }

    public void setEditable(boolean editable) {
    }

    @Deprecated
    public UUID getUuid() {
        return null;
    }

    public UUID getUniqueId() {
        return null;
    }

    public void setUuid(UUID uuid) {
    }
}
