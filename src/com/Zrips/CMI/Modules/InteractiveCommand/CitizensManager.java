package com.Zrips.CMI.Modules.InteractiveCommand;

import java.util.UUID;

import org.bukkit.entity.Entity;

import com.Zrips.CMI.CMI;

public class CitizensManager {

    private CMI plugin;

    public CitizensManager(CMI plugin) {
        this.plugin = plugin;

    }

    public boolean isCitizen(Entity ent) {

        return false;
    }

    public UUID getCitizenPrivateUUID(UUID uuid) {
        return null;
    }

    public Integer getEntityId(Entity ent) {
        return null;
    }

    public Integer getEntityId(UUID uuid) {

        return null;
    }

    public UUID getEntityUUID(Entity ent) {
        return null;
    }

    public UUID getEntityUUID(int id) {
        return null;
    }

    public UUID getEntityRealUUID(int id) {
        return null;
    }
}
