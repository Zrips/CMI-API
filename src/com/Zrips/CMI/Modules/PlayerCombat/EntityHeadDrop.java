package com.Zrips.CMI.Modules.PlayerCombat;

import java.util.HashMap;
import java.util.Set;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import net.Zrips.CMILib.Entities.CMIEntityType;

public class EntityHeadDrop {
    private CMIEntityType type;
    private double baseDropChance;
    private double baseLowerAmount;
    private HashMap<String, Double> heads;
    private Set<String> ls;

    public EntityHeadDrop(CMIEntityType type) {
    }

    public HashMap<String, Double> getHeads() {
        return null;
    }

    public void setHeads(HashMap<String, Double> heads) {
    }

    public void addHead(String texture, Double chance) {
    }

    public ItemStack getHead() {
        return null;
    }

    public ItemStack getHead(Entity ent) {
        return null;
    }

    public ItemStack getHead(Player player, Entity ent) {
        return null;
    }

    public double getBaseDropChance() {
        return 0.0;
    }

    public void setBaseDropChance(double baseDropChance) {
    }

    public double getBaseLowerAmount() {
        return 0.0;
    }

    public void setBaseLowerAmount(double baseLowerAmount) {
    }

    public CMIEntityType getType() {
        return null;
    }
}
