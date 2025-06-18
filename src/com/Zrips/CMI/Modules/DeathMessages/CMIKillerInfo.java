package com.Zrips.CMI.Modules.DeathMessages;

import java.util.List;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;

import net.Zrips.CMILib.Items.CMIItemStack;

class CMIKillerInfo {
    private damageInformation damage;
    private Entity killer;
    private Block killerBlock;
    private CMIDeathType type;
    private CMIItemStack killerItem;
    private List<CMIDeathType> path;

    public CMIKillerInfo(damageInformation lastDamage) {
    }

    public Entity getKiller() {
        return null;
    }

    public void setKiller(Entity killer) {
    }

    public List<CMIDeathType> getPath() {
        return null;
    }

    public void setPath(List<CMIDeathType> path) {
    }

    public damageInformation getDamage() {
        return null;
    }

    public Block getKillerBlock() {
        return null;
    }

    public void setKillerBlock(Block killerBlock) {
    }

    public CMIItemStack getKillerItem() {
        return null;
    }

    public void setKillerItem(CMIItemStack killerItem) {
    }

    public CMIDeathType getType() {
        return null;
    }

    public void setType(CMIDeathType type) {
    }
}
