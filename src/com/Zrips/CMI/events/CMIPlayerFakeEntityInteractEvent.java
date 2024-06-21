package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIInteractType;

public final class CMIPlayerFakeEntityInteractEvent extends CMIPlayerEvent {

    private final int id;
    private Object obj;
    private CMIInteractType type;

    public CMIPlayerFakeEntityInteractEvent(final Player player, final int id, final Object obj, CMIInteractType type) {
        super(player);
        this.id = id;
        this.obj = obj;
        this.type = type;
    }

    public int getEntityId() {
        return id;
    }

    public Object getObject() {
        return obj;
    }

    public CMIInteractType getType() {
        return type;
    }

    public void setType(CMIInteractType type) {
        this.type = type;
    }
}
