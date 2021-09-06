package com.Zrips.CMI.events;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

import com.Zrips.CMI.Modules.EventActions.EventActionManager.eventAction;

public final class CMIEventCommandEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private final eventAction action;
    private List<String> commands;
    private List<String> sourceCommands;
    private Player source;

    public CMIEventCommandEvent(final Player player, Player source, final eventAction action, List<String> commands, List<String> sourceCommands) {
	super(player);
	this.source = source;
	this.action = action;
	this.commands = commands;
	this.sourceCommands = sourceCommands;
    }

    public final static HandlerList getHandlerList() {
	return handlers;
    }

    @Override
    @EventAnnotation(info = "Fired before event command is performed")
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

    public eventAction getAction() {
	return action;
    }

    public List<String> getCommands() {
	return commands;
    }

    @Deprecated
    public void setCommands(List<String> commands) {
	this.commands.clear();
	this.commands.addAll(commands);
    }

    public Player getSource() {
	return source;
    }

    public void setSource(Player source) {
	this.source = source;
    }

    public List<String> getSourceCommands() {
	return sourceCommands;
    }
}
