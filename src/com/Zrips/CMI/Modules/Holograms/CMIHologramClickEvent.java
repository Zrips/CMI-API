package com.Zrips.CMI.Modules.Holograms;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIInteractType;
import com.Zrips.CMI.Modules.Portals.CMIVector3D;
import com.Zrips.CMI.events.EventAnnotation;

public final class CMIHologramClickEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private Player player;
    private CMIHologram hologram;
    private int line;
    private CMIVector3D pos;
    private CMIInteractType actionType;

    public CMIHologramClickEvent(Player player, CMIHologram holo, int line, CMIVector3D pos, CMIInteractType actionType) {
	this.player = player;
	this.hologram = holo;
	this.line = line;
	this.pos = pos;
	this.actionType = actionType;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player click on hologram line")
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

    public Player getPlayer() {
	return player;
    }

    public CMIHologram getHologram() {
	return hologram;
    }

    public int getLineNumber() {
	return line;
    }

    public CMIVector3D getPos() {
	return pos;
    }

    public CMIInteractType getActionType() {
	return actionType;
    }
}
