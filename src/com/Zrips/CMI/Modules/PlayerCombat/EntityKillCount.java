package com.Zrips.CMI.Modules.PlayerCombat;

import org.bukkit.entity.EntityType;

public class EntityKillCount {
    EntityType type;
    private long lastKill;
    private int kills;
    private int headDropCount;

    public EntityKillCount(EntityType type) {
    }

    public int addKill() {
        return 0;
    }

    public int getKills() {
        return 0;
    }

    public void setKills(int kills) {
    }

    public Long getLastKill() {
        return null;
    }

    public void setLastKill(Long lastKill) {
    }

    public int getHeadDropCount() {
        return 0;
    }

    public void setHeadDropCount(int headDropCount) {
    }

    public void addHeadDropCount() {
    }
}
