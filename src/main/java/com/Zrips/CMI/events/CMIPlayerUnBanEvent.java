package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public final class CMIPlayerUnBanEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CommandSender by;

    public CMIPlayerUnBanEvent(CommandSender by, final Player player) {
	super(player);
	this.by = by;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player gets unban")
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
}
