package com.Zrips.CMI.Modules.DeathMessages;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;

public class damageInformation {

    private Entity ent;
    private double damage = 0;
    private ItemStack item;
    private DamageCause cause;
    private Long time;
    private Block block;

    public void reset() {
	ent = null;
	damage = 0;
	item = null;
	cause = null;
	time = null;
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
	if (time == null)
	    time = System.currentTimeMillis();
	return time;
    }

    public void setTime(Long time) {
	this.time = time;
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
