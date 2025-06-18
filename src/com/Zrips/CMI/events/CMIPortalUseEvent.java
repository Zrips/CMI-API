package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CMIPortal;

public class CMIPortalUseEvent extends CMIPlayerCancellableEvent {
    private final CMIPortal portal = null;

    public CMIPortalUseEvent(Player player, CMIPortal portal) {
        super(player);
    }

    public CMIPortal getPortal() {
        return null;
    }
}
