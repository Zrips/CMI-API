package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIPvPEndEventAsync extends Event {

    private static final HandlerList handlers = new HandlerList();
    private Player player = null;

    public CMIPvPEndEventAsync(final Player player) {
	super(true);
	this.player = player;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player exits combat mode")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public Player getPlayer() {
	return player;
    }
}
