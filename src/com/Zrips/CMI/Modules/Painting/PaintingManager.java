package com.Zrips.CMI.Modules.Painting;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Painting;

import com.Zrips.CMI.CMI;

public class PaintingManager {
    private CMI plugin;
    HashMap<UUID, Entity> map;

    public PaintingManager(CMI plugin) {
    }

    public boolean isEditing(UUID uuid) {
        return false;
    }

    public void addEditor(UUID uuid, Entity ent) {
    }

    public Painting getPainting(UUID uuid) {
        return null;
    }

    public void removeEditor(UUID uuid) {
    }

    public void removeEditor(Entity entity) {
    }
}
