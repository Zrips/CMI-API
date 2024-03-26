package com.Zrips.CMI.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public final class CMIAfkEnterEvent extends PlayerEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private List<String> awayTrigerCommands = new ArrayList<String>();
    private boolean cancel;
    private AfkType type;

    public enum AfkType {
	auto, manual;
    }

    public CMIAfkEnterEvent(Player player, List<String> awayTrigerCommands, AfkType afkType) {
        super(player);
	this.awayTrigerCommands = awayTrigerCommands;
	this.type = afkType;
    }

    @Override
    @EventAnnotation(info = "Fired when player enters afk mode")
    public HandlerList getHandlers() {
	return handlers;
    }

    public static HandlerList getHandlerList() {
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

    public List<String> getAwayTrigerCommands() {
	return awayTrigerCommands;
    }

    public void setAwayTrigerCommands(List<String> awayTrigerCommands) {
	this.awayTrigerCommands = awayTrigerCommands;
    }

    public AfkType getType() {
	return this.type;
    }
}