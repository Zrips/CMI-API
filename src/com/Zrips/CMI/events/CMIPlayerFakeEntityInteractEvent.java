package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIInteractType;

public class CMIPlayerFakeEntityInteractEvent extends CMIPlayerEvent {
    private final int id = 0;
    private Object obj;
    private CMIInteractType type;

    public CMIPlayerFakeEntityInteractEvent(Player player, int id, Object obj, CMIInteractType type) {
        super(player);
    }

    public int getEntityId() {
        return 0;
    }

    public Object getObject() {
        return null;
    }

    public CMIInteractType getType() {
        return null;
    }

    public void setType(CMIInteractType type) {
    }
}
