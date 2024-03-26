package com.Zrips.CMI.Modules.DeathMessages;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

public class damageInformation {

    private static HashMap<UUID, TreeMap<Long, damageInformation>> cache = new HashMap<UUID, TreeMap<Long, damageInformation>>();

    public static void cacheClear(UUID uuid) {
        cache.remove(uuid);
    }

    public static TreeMap<Long, damageInformation> getLastDamage(UUID uuid) {
        return cache.get(uuid);
    }

    public static TreeMap<Long, damageInformation> addLastDamage(UUID uuid, damageInformation lastDamage) {
        return null;
    }

    public static damageInformation getLastDamage(UUID uuid, damageInformation comparison) {

        return null;
    }

    private Entity ent;
    private double damage = 0;
    private ItemStack item;
    private DamageCause cause;
    private long time;
    private Block block;

    public void reset() {
        ent = null;
        damage = 0;
        item = null;
        cause = null;
        time = 0;
    }

    public Entity getEnt() {
        return ent;
    }

    public void setEnt(Entity ent) {
        this.ent = ent;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public ItemStack getItem() {
        return item;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public DamageCause getCause() {
        return cause;
    }

    public void setCause(DamageCause cause) {
        this.cause = cause;
    }

    public Long getTime() {
        if (time == 0)
            time = System.currentTimeMillis();
        return time;
    }

    public void setTime(Long time) {
        this.time = time == null ? 0 : time;
    }

    public void setTime() {
        this.time = System.currentTimeMillis();
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }
}
