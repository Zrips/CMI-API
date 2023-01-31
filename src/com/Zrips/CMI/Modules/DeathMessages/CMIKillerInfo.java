package com.Zrips.CMI.Modules.DeathMessages;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

import net.Zrips.CMILib.Items.CMIItemStack;

class CMIKillerInfo {
    private damageInformation damage;

    private Entity killer = null;
    private Block killerBlock = null;

    private CMIDeathType type = CMIDeathType.Custom;

    private CMIItemStack killerItem = null;
    private List<CMIDeathType> path = new ArrayList<CMIDeathType>();

    public CMIKillerInfo(damageInformation lastDamage) {
	damage = lastDamage;
    }

    public Entity getKiller() {
	return killer;
    }

    public void setKiller(Entity killer) {
	this.killer = killer;
    }

    public List<CMIDeathType> getPath() {
	return path;
    }

    public void setPath(List<CMIDeathType> path) {
	this.path = path;
    }

    public damageInformation getDamage() {
	return damage;
    }

    public Block getKillerBlock() {
	return killerBlock;
    }

    public void setKillerBlock(Block killerBlock) {
	this.killerBlock = killerBlock;
    }

    public CMIItemStack getKillerItem() {
	return killerItem;
    }

    public void setKillerItem(CMIItemStack killerItem) {
	this.killerItem = killerItem;
    }

    public CMIDeathType getType() {
	return type;
    }

    public void setType(CMIDeathType type) {
	this.type = type;
    }

}