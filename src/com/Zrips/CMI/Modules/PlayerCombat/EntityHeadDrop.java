package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Entities.CMIEntityType;

public class EntityHeadDrop {
    private CMIEntityType type;
    private double baseDropChance = 0D;
    private double baseLowerAmount = 0D;
    private HashMap<String, Double> heads = new HashMap<String, Double>();
    private Set<String> ls = new HashSet<String>();

    public EntityHeadDrop(CMIEntityType type) {
        this.type = type;
    }

    public HashMap<String, Double> getHeads() {
        return heads;
    }

    public void setHeads(HashMap<String, Double> heads) {
    }

    public void addHead(String texture, Double chance) {
        this.heads.put(texture, chance);
        ls.add(texture);
    }

    public ItemStack getHead() {

        return null;
    }

    public ItemStack getHead(Entity ent) {
        return getHead(null, ent);
    }

    public ItemStack getHead(Player player, Entity ent) {

        return null;
    }

    public double getBaseDropChance() {
        return baseDropChance;
    }

    public void setBaseDropChance(double baseDropChance) {
        this.baseDropChance = baseDropChance;
    }

    public double getBaseLowerAmount() {
        return baseLowerAmount;
    }

    public void setBaseLowerAmount(double baseLowerAmount) {
        this.baseLowerAmount = baseLowerAmount;
    }

    public CMIEntityType getType() {
        return type;
    }
}
