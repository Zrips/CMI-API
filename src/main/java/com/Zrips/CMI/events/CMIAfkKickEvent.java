package com.Zrips.CMI.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIAfkKickEvent extends Event  implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private Player player;
    private boolean cancel;
    private List<String> kickTrigerCommands = new ArrayList<String>();

    public CMIAfkKickEvent(Player player, List<String> kickTrigerCommands) {
	this.player = player;
	this.kickTrigerCommands = kickTrigerCommands;
    }

    public Player getPlayer() {
	return this.player;
    }

    @Override
    @EventAnnotation(info = "Fired when player should be kicked from server after being afk")
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

    public List<String> getKickTrigerCommands() {
	return kickTrigerCommands;
    }

    public void setKickTrigerCommands(List<String> kickTrigerCommands) {
	this.kickTrigerCommands = kickTrigerCommands;
    }
}