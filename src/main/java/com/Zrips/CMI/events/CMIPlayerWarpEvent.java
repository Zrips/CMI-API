package com.Zrips.CMI.events;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import com.Zrips.CMI.Modules.Warps.CmiWarp;

public final class CMIPlayerWarpEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CmiWarp warp;
    private CommandSender sender;

    public CMIPlayerWarpEvent(final Player target, CmiWarp warp, CommandSender sender) {
	super(target);
	this.warp = warp;
	this.sender = sender;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired before teleporting player to warp location")
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

    public CmiWarp getWarp() {
	return warp;
    }

    public void setWarp(CmiWarp warp) {
	this.warp = warp;
    }

    public CommandSender getCommandSender() {
	return sender;
    }

    public void setCommandSender(CommandSender sender) {
	this.sender = sender;
    }
}
