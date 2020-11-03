package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Modules.tp.TpManager.TpAction;

public final class CMIPlayerTeleportRequestEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private Player whoOffers;
    private Player whoAccepts;
    private TpAction action;

    public CMIPlayerTeleportRequestEvent(final Player whoOffers, final Player whoAccepts, TpAction action) {
	this.whoOffers = whoOffers;
	this.whoAccepts = whoAccepts;
	this.action = action;

    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player requests teleportation to another player")
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

    public Player getWhoOffers() {
	return whoOffers;
    }

    public Player getWhoAccepts() {
	return whoAccepts;
    }

    public TpAction getAction() {
	return action;
    }

}
