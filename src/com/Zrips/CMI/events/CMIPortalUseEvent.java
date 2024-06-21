package com.Zrips.CMI.events;

import org.bukkit.entity.Player;

import com.Zrips.CMI.Modules.Portals.CMIPortal;

public final class CMIPortalUseEvent extends CMIPlayerCancellableEvent {

    private final CMIPortal portal;

    public CMIPortalUseEvent(final Player player, final CMIPortal portal) {
        super(player);
        this.portal = portal;
    }

    public CMIPortal getPortal() {
        return portal;
    }
}
