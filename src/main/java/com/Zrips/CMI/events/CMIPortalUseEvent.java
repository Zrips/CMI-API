package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import com.Zrips.CMI.Modules.Portals.CMIPortal;

public final class CMIPortalUseEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private final CMIPortal portal;

    public CMIPortalUseEvent(final Player player, final CMIPortal portal) {
	super(player);
	this.portal = portal;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player enters portal area")
    public final HandlerList getHandlers() {
	return handlers;
    }

    @Override
    public final void setCancelled(final boolean cancel) {
	this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
	return cancel;
    }

    public CMIPortal getPortal() {
	return portal;
    }
}
