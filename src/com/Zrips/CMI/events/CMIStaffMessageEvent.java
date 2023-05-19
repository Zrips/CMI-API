package com.Zrips.CMI.events;

import java.util.Set;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public final class CMIStaffMessageEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private boolean cancel = false;
    private CommandSender by;
    private Set<Player> receivers;
    private String message;

    public CMIStaffMessageEvent(CommandSender by, Set<Player> receivers, String message) {
        this.by = by;
        this.receivers = receivers;
        this.message = message;
    }

    @Override
    @EventAnnotation(info = "Fired when staff message is sent")
    public final HandlerList getHandlers() {
        return handlers;
    }

    public final static HandlerList getHandlerList() {
        return handlers;
    }

    public CommandSender getSentBy() {
        return by;
    }

    @Override
    public final void setCancelled(final boolean cancel) {
        this.cancel = cancel;
    }

    @Override
    public final boolean isCancelled() {
        return cancel;
    }

    public Set<Player> getReceivers() {
        return receivers;
    }

    public void setReceivers(Set<Player> receivers) {
        this.receivers = receivers;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
