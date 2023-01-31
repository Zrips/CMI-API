package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIConfigReloadEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private CommandSender sender;

    public CMIConfigReloadEvent(CommandSender sender) {
	this.sender = sender;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired on configuration files reload")
    public final HandlerList getHandlers() {
	return handlers;
    }

    public CommandSender getSender() {
	return sender;
    }
}
