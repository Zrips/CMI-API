package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CMIPlaneIntersection;
import com.Zrips.CMI.events.CMIPlayerEvent;

public final class CMIHologramStartHoverEvent extends CMIPlayerEvent {
    private CMIHologram hologram;
    private CMIPlaneIntersection pos;

    public CMIHologramStartHoverEvent(Player player, CMIHologram holo, CMIPlaneIntersection pos) {
        super(player, true);
    }

    public CMIHologram getHologram() {
        return null;
    }

    public CMIPlaneIntersection getPos() {
        return null;
    }
}
