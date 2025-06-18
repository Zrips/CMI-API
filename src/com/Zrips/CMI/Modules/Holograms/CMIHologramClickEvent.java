package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Modules.Portals.CMIVector3D;
import com.Zrips.CMI.events.CMIPlayerCancellableEvent;

public final class CMIHologramClickEvent extends CMIPlayerCancellableEvent {
    private CMIHologram hologram;
    private int line;
    private CMIVector3D pos;
    private CMIInteractType actionType;

    public CMIHologramClickEvent(Player player, CMIHologram holo, int line, CMIVector3D pos, CMIInteractType actionType) {
        super(player);
    }

    public CMIHologram getHologram() {
        return null;
    }

    public int getLineNumber() {
        return 0;
    }

    public CMIVector3D getPos() {
        return null;
    }

    public CMIInteractType getActionType() {
        return null;
    }
}
