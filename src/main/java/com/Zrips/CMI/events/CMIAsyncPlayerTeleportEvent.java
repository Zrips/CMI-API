package com.Zrips.CMI.events;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.Zrips.CMI.Modules.tp.SafeTeleport;
import com.Zrips.CMI.Modules.tp.Teleportations.TeleportType;

public final class CMIAsyncPlayerTeleportEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CommandSender sender;
    private Player player;
    private SafeTeleport safe;
    private TeleportType type;

    public CMIAsyncPlayerTeleportEvent(final CommandSender sender, final Player player, final SafeTeleport safe, final TeleportType type) {
	super(true);
	this.sender = sender;
	this.player = player;
	this.safe = safe;
	this.type = type;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired when player teleports to new safe location")
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

    public CommandSender getSender() {
	return sender;
    }

    public Player getPlayer() {
	return player;
    }

    public SafeTeleport getSafe() {
	return safe;
    }

    public TeleportType getType() {
	return type;
    }

    public Location getTo() {
	return getSafe().getSafeLoc();
    }
}
