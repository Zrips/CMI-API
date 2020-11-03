package com.Zrips.CMI.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIInteractType;

public final class CMIPlayerFakeEntityInteractEvent extends Event
//implements Cancellable
{

    private static final HandlerList handlers = new HandlerList();
//    private boolean cancel = false;
    private final int id;
    private Object obj;
    private Player player = null;
    private CMIInteractType type;

    public CMIPlayerFakeEntityInteractEvent(final Player player, final int id, final Object obj, CMIInteractType type) {
//	super(true);
	this.player = player;
	this.id = id;
	this.obj = obj;
	this.type = type;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player interacts with fake entity")
    public final HandlerList getHandlers() {
	return handlers;
    }

//    @Override
//    public final void setCancelled(final boolean cancel) {
//	this.cancel = cancel;
//    }
//
//    @Override
//    public final boolean isCancelled() {
//	return cancel;
//    }

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

    public Player getPlayer() {
	return player;
    }
}
