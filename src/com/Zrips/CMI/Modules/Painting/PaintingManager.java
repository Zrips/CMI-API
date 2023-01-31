package com.Zrips.CMI.Modules.Painting;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Painting;

import com.Zrips.CMI.CMI;

public class PaintingManager {

    private CMI plugin;

    public PaintingManager(CMI plugin) {
        this.plugin = plugin;
    }

    HashMap<UUID, Entity> map = new HashMap<UUID, Entity>();

    public boolean isEditing(UUID uuid) {
        return map.containsKey(uuid);
    }

    public void addEditor(UUID uuid, Entity ent) {
        map.put(uuid, ent);
    }

    public Painting getPainting(UUID uuid) {
        Entity ent = map.get(uuid);
        return ent instanceof Painting ? (Painting) ent : null;
    }

    public void removeEditor(UUID uuid) {
        map.remove(uuid);
    }

    public void removeEditor(Entity entity) {
    }

}
