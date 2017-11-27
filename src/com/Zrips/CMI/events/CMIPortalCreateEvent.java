package com.Zrips.CMI.events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.PortalCreateEvent.CreateReason;

public final class CMIPortalCreateEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private int height;
    private int width;
    private World world;
    private CreateReason reason;
    private boolean cancelled;

    public CMIPortalCreateEvent(Player player, World world, CreateReason reason, int height, int width) {
	this.player = player;
	this.height = height;
	this.width = width;
	this.world = world;
	this.reason = reason;
    }

    public Player getPlayer() {
	return this.player;
    }

    public int getHeight() {
	return this.height;
    }

    public int getWidth() {
	return this.width;
    }

    @Override
    public boolean isCancelled() {
	return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
	cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
	return handlers;
    }

    public static HandlerList getHandlerList() {
	return handlers;
    }

    public World getWorld() {
	return world;
    }

    public CreateReason getReason() {
	return reason;
    }
}