package com.Zrips.CMI.events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.world.PortalCreateEvent.CreateReason;
import org.bukkit.util.Vector;

public final class CMIPortalCreateEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private int height;
    private int width;
    private World world;
    private Vector lowestPoint;
    private CreateReason reason;
    private boolean cancelled;
    private CMIPortalType type;
    
    public enum CMIPortalType{
	Nether, End;
    }

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
    @EventAnnotation(info = "Fired when new portal is been created")
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

    public CMIPortalType getType() {
	return type;
    }

    public void setType(CMIPortalType type) {
	this.type = type;
    }

    public Vector getLowestPoint() {
	return lowestPoint;
    }

    public void setLowestPoint(Vector lowestPoint) {
	this.lowestPoint = lowestPoint;
    }
}