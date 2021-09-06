package com.Zrips.CMI.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Jail.CMIJailCell;

public final class CMIPlayerJailEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;

    private CMIUser user;
    private CMIJailCell cell;

    public CMIPlayerJailEvent(CMIUser user, CMIJailCell cell) {
	this.user = user;
	this.cell = cell;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when players gets jailed")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public CMIUser getUser() {
	return user;
    }

    public CMIJailCell getCell() {
	return cell;
    }

    public void setCell(CMIJailCell cell) {
	this.cell = cell;
    }

    @Override
    public final void setCancelled(final boolean cancel) {
	this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
	return cancel;
    }

}
