package com.Zrips.CMI.Modules.PlayerCombat;

import org.bukkit.entity.EntityType;

public class EntityKillCount {

    EntityType type = null;
    private Long lastKill = 0L;
    private int kills = 0;
    private int headDropCount = 0;

    public EntityKillCount(EntityType type) {
	this.type = type;
    }

    public int addKill() {
	lastKill = System.currentTimeMillis();
	return kills++;
    }

    public int getKills() {
	return kills;
    }

    public void setKills(int kills) {
	this.kills = kills;
    }

    public Long getLastKill() {
	return lastKill;
    }

    public void setLastKill(Long lastKill) {
	this.lastKill = lastKill;
    }

    public int getHeadDropCount() {
	return headDropCount;
    }

    public void setHeadDropCount(int headDropCount) {
	this.headDropCount = headDropCount;
    }

    public void addHeadDropCount() {
	this.headDropCount++;
    }
}
