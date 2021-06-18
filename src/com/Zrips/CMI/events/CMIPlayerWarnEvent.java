package com.Zrips.CMI.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Containers.CMIUser;
import com.Zrips.CMI.Modules.Warnings.CMIPlayerWarning;

public final class CMIPlayerWarnEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CMIUser user;
    private CMIPlayerWarning warning;

    public CMIPlayerWarnEvent(final CMIUser user, CMIPlayerWarning warning) {
	this.user = user;
	this.warning = warning;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when user gets a warn")
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

    public CMIUser getUser() {
	return user;
    }

    public CMIPlayerWarning getWarning() {
	return warning;
    }
}
