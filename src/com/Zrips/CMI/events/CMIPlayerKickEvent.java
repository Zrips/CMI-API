package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIPlayerKickEvent extends Event  implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private String reason;
    private CommandSender by;
    private UUID banned;

    public CMIPlayerKickEvent(CommandSender by, final UUID banned, String reason) {
	this.banned = banned;
	this.by = by;
	this.reason = reason;
    }

    @Override
    @EventAnnotation(info = "Fired when player gets kick")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    public String getReason() {
	return reason;
    }

    public CommandSender getBannedBy() {
	return by;
    }

    public UUID getBanned() {
	return banned;
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
