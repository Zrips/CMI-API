package com.Zrips.CMI.events;

import java.util.UUID;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIPlayerBanEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private String reason;
    private Long until;
    private CommandSender by;
    private UUID banned;

    public CMIPlayerBanEvent(CommandSender by, final UUID banned, String reason, Long until) {
	this.banned = banned;
	this.by = by;
	this.reason = reason;
	this.until = until;
    }

    @Override
    @EventAnnotation(info = "Fired when player gets ban")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    public String getReason() {
	return reason;
    }

    public Long getUntil() {
	return until;
    }

    public CommandSender getBannedBy() {
	return by;
    }

    public UUID getBanned() {
	return banned;
    }
}
