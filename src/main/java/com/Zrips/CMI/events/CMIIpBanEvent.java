package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIIpBanEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CommandSender by;
    private String ip;
    private Long until;
    private String reason;

    public CMIIpBanEvent(CommandSender by, String ip, String reason, Long until) {
	this.by = by;
	this.ip = ip;
	this.reason = reason;
	this.until = until;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when ip gets ban")
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

    public CommandSender getBannedBy() {
	return by;
    }

    public String getIp() {
	return ip;
    }

    public Long getUntil() {
	return until;
    }

    public String getReason() {
	return reason;
    }
}
