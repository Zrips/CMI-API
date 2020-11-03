package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIIpUnBanEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CommandSender by;
    private String ip;

    public CMIIpUnBanEvent(CommandSender by, String ip) {
	this.by = by;
	this.ip = ip;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fire when ip gets unban")
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
}
